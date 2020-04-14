#!/bin/bash
set -e

while getopts d:f:h:i:j:p:t:u:v: option
do
case "${option}"
in
d) THIS_DIR_PATH=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
h) HOST_URL=${OPTARG};;
i) IP=${OPTARG};;
j) PROJ_NAME=${OPTARG};;
p) PORT=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
esac
done

echo Building the *public* Docker container, SSHing into VM to grab Jupyter auth token
ssh -T -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP << EOF
  # Build container
  sudo docker run -d -p $PORT:8888 --mount source=$TRIAL_ID,target=/home/jovyan $HOST_URL/$PROJ_NAME/$FOLDER_NAME/public

  # Grab Jupyter auth token
  for i in {1..60}
  do
    ping -c1 0.0.0.0
    if [ \$? -eq 0 ]
    then
      CONTAINER_ID=\$(sudo docker container ls -l -q)
      for j in {1..60}
      do
        sleep 1
        LINE_COUNT=\$(sudo docker exec \$CONTAINER_ID jupyter notebook list | wc -l)
        if [ "\$LINE_COUNT" -gt "1" ]; then
          # parse Jupyter auth token from Docker logs and write to text file
          sudo docker exec \$CONTAINER_ID jupyter notebook list | grep -o -P '(?<=token=).*(?= :)' > ~/token.txt

          exit 0
        fi
      done
      # Could not access Jupyter Notebook server within 60 seconds
      exit 2
    fi
  done
  # Could not ping Docker container server within 60 seconds
  exit 1
EOF


echo Copying Jupyter notebook token down to localhost
scp -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP:~/token.txt $THIS_DIR_PATH/data/public/token.txt
