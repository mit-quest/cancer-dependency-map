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
echo Building the *visualize* Docker container
ssh -T -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP << EOF
  # Build the Docker container
  sudo docker run -dit -p $PORT:3449 $HOST_URL/$PROJ_NAME/$FOLDER_NAME/visualize

  # Copy JSON from GCP Bucket down to VM
  gsutil cp gs://$FOLDER_NAME-bucket-$USER/private/$TRIAL_ID.json ~/results-Bridge-demo-Arac-part.json

  for i in {1..60}
  do
    ping -c1 0.0.0.0
    if [ \$? -eq 0 ]
    then
      CONTAINER_ID=\$(sudo docker container ls -l -q)

      # Copy JSON to container (overwrite dummy JSON)
      sudo docker cp ~/results-Bridge-demo-Arac-part.json \$CONTAINER_ID:/

      # Run 'make' inside container to build website
      sudo docker exec \$CONTAINER_ID make &

      exit 0
    fi
  done
  # Could not ping Docker container server within 60 seconds
  exit 1
EOF
