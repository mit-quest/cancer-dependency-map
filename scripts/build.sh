#!/bin/bash
set -e

# Read variables from arguments
while getopts c:j:h:f:u: option
do
case "${option}"
in
c) CRED_PATH=${OPTARG};;
j) PROJ_ID=${OPTARG};;
h) HOST_NAME=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
u) USER=${OPTARG};;
esac
done

# Create GCP bucket for data transfer across experiments
echo Creating GCP bucket
/snap/bin/gsutil mb gs://$FOLDER_NAME-bucket-$USER

# Install Docker
echo Installing docker
sudo curl -sSL https://get.docker.com/ | sh

# Login to Docker
echo Logging in to Docker
cat $CRED_PATH | sudo docker login -u _json_key --password-stdin $HOST_NAME

# Pull the probcomp/notebook image from the official Docker Hub
echo Pulling probcomp/notebook docker image from the official Docker Hub
sudo docker pull probcomp/notebook

# Navigate to the experiments in the uploaded repository
cd ~/experiments

# Build and push the *public* image
echo Building the *public* docker image
cd gene-expression-public
PUBLIC=$FOLDER_NAME/public
sudo docker build -t $PUBLIC .
cd ..
echo Pushing *public* to Google Cloud registry
sudo docker tag $PUBLIC $HOST_NAME/$PROJ_ID/$PUBLIC
sudo docker push $HOST_NAME/$PROJ_ID/$PUBLIC

# Build and push the *private* image
echo Building the *private* docker image
cd genome-simulator
PRIVATE=$FOLDER_NAME/private
sudo docker build -t $PRIVATE .
cd ..
echo Pushing *private* to Google Cloud registry
sudo docker tag $PRIVATE $HOST_NAME/$PROJ_ID/$PRIVATE
sudo docker push $HOST_NAME/$PROJ_ID/$PRIVATE

# Build and push the *visualize* image
echo Building the *visualize* docker image
cd gene-expression-viz-bridge
VISUALIZE=$FOLDER_NAME/visualize
sudo docker build -t $VISUALIZE .
cd ..
echo Pushing *visualize* to Google Cloud registry
sudo docker tag $VISUALIZE $HOST_NAME/$PROJ_ID/$VISUALIZE
sudo docker push $HOST_NAME/$PROJ_ID/$VISUALIZE
