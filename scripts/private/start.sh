#!/bin/bash
set -e

while getopts c:i:j:h:p:t:f:u:v: option
do
case "${option}"
in
c) CRED_PATH=${OPTARG};;
i) IP=${OPTARG};;
j) PROJ_NAME=${OPTARG};;
h) HOST_URL=${OPTARG};;
p) PORT=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
esac
done

# Build container
echo Building the *private* Docker container
ssh -T -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP << EOF
  sudo docker run -d -p $PORT:8888 --mount source=$TRIAL_ID,target=/home/jovyan $HOST_URL/$PROJ_NAME/$FOLDER_NAME/private
EOF
