#!/bin/bash

# Read variables from arguments
while getopts i:p:u:v:d:t:f: option
do
case "${option}"
in
i) IP=${OPTARG};;
p) PORT=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
d) DATA_DIR_PATH=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
esac
done

echo SSHing into VM and grabbing Jupyter auth token
ssh -T -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP << 'EOF'
  for i in {1..60}
  do
    ping -c1 0.0.0.0
    if [ $? -eq 0 ]
    then
      CONTAINER_ID=$(sudo docker container ls -l -q)
      for j in {1..60}
      do
        sleep 1
        LINE_COUNT=$(sudo docker exec $CONTAINER_ID jupyter notebook list | wc -l)
        if [ "$LINE_COUNT" -gt "1" ]; then
          # parse Jupyter auth token from Docker logs and write to text file
          sudo docker exec $CONTAINER_ID jupyter notebook list | grep -o -P '(?<=token=).*(?= :)' > ~/token.txt

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

# Securely copy the token text from the VM
echo Copying Jupyter notebook token down to localhost
scp -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP:~/token.txt $DATA_DIR_PATH/token.txt

# Get the token string
echo Grabbing Jupyter notebook token
TOKEN=$(cat $DATA_DIR_PATH/token.txt)

# Open website
echo Opening Jupyter notebook website
xdg-open http://$IP:$PORT/?token=$TOKEN &
