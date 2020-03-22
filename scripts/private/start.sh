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

ssh -t -i $PRIVATE_KEY_PATH $USER@$IP << EOF
  # Build container
  echo Building the *private* Docker container
  sudo docker run -d -p $PORT:8888 $HOST_URL/$PROJ_NAME/$FOLDER_NAME/private
EOF

# Remove IP from ssh known hosts
echo Removing VM IP from ssh known hosts
ssh-keygen -R $IP
