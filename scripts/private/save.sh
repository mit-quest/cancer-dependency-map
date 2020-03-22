#!/bin/bash
set -e

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

# SSH into VM and execute commands
echo SSHing into VM and executing commands
ssh -t -i $PRIVATE_KEY_PATH $USER@$IP << EOF
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
          # copy output JSON from Docker container down to VM
          sudo docker cp \$CONTAINER_ID:/home/jovyan/cmi-results/results-Bridge-demo-Arac-part.json ~/

          # copy output JSON from VM to the GCP bucket
          gsutil cp ~/results-Bridge-demo-Arac-part.json gs://$FOLDER_NAME-bucket-$USER/private/$TRIAL_ID.json

          exit 0
        fi
      done
      echo Could not access Jupyter Notebook server within 60 seconds
      exit 1
    fi
  done
  echo Could not ping Docker container server within 60 seconds
  exit 1
EOF

# Remove IP from ssh known hosts
echo Removing VM IP from ssh known hosts
ssh-keygen -R $IP
