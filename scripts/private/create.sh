#!/bin/bash
set -e

while getopts c:j:h:p:t:f:u: option
do
case "${option}"
in
c) CRED_PATH=${OPTARG};;
j) PROJ_NAME=${OPTARG};;
h) HOST_URL=${OPTARG};;
p) PORT=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
u) USER=${OPTARG};;
esac
done

# Install Docker
echo Installing Docker
sudo curl -sSL https://get.docker.com/ | sh

# Login to Docker
cat $CRED_PATH | sudo docker login -u _json_key --password-stdin $HOST_URL

# Pull probcomp/rnaseq image
echo Pulling the *private* Docker image from Google Cloud registry
sudo docker pull $HOST_URL/$PROJ_NAME/$FOLDER_NAME/private
