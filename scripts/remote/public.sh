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
echo Logging in to Docker
cat $CRED_PATH | sudo docker login -u _json_key --password-stdin $HOST_URL

# Pull probcomp/rnaseq image
echo Pulling probcomp/rnaseq from Google Cloud registry
sudo docker pull $HOST_URL/$PROJ_NAME/probcomp-rnaseq

# Build container
echo Building probcomp/rnaseq container
sudo docker run -d -p $PORT:8888 $HOST_URL/$PROJ_NAME/probcomp-rnaseq

sleep 10

CONTAINER_ID=$(sudo docker container ls -l -q)

# parse auth token from Docker logs and write to text file
echo Grabbing Jupyter authentication token
sudo docker exec $CONTAINER_ID jupyter notebook list | grep -o -P '(?<=token=).*(?= :)' > ~/token.txt

