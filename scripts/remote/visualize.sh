#!/bin/bash
set -e

while getopts c:j:h:p:d: option
do
case "${option}"
in
c) CRED_PATH=${OPTARG};;
j) PROJ_NAME=${OPTARG};;
h) HOST_URL=${OPTARG};;
p) PORT=${OPTARG};;
d) DATA_DIR_PATH=${OPTARG};;
esac
done

# Install Docker
echo Installing Docker
sudo curl -sSL https://get.docker.com/ | sh

# Login to Docker
cat $CRED_PATH | sudo docker login -u _json_key --password-stdin $HOST_URL

# Pull probcomp/rnaseq image
echo Pulling probcomp/visualizer from Google Cloud registry
sudo docker pull $HOST_URL/$PROJ_NAME/probcomp-visualizer

# Build container
echo Building probcomp/rnaseq container
sudo docker run -d -p $PORT:8888 probcomp/visualizer

sleep 10

CONTAINER_ID=$(sudo docker container ls -l -q)

# Copy JSON to container (overwrite dummy JSON)
sudo docker cp $DATA_DIR_PATH/results-Bridge-demo-Arac-part.json $CONTAINER_ID:~/

# Run 'make' inside container to build website
sudo docker exec $CONTAINER_ID make
