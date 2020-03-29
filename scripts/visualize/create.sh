#!/bin/bash
set -e

# Read variables from arguments
while getopts c:f:h:j: option
do
case "${option}"
in
c) CRED_PATH=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
h) HOST_URL=${OPTARG};;
j) PROJ_NAME=${OPTARG};;
esac
done

# Install Docker
echo Installing Docker
sudo curl -sSL https://get.docker.com/ | sh

# Login to Docker
echo Logging in to Docker
cat $CRED_PATH | sudo docker login -u _json_key --password-stdin $HOST_URL

# Pull probcomp/rnaseq image
echo Pulling the *visualize* Docker image from Google Cloud registry
sudo docker pull $HOST_URL/$PROJ_NAME/$FOLDER_NAME/visualize
