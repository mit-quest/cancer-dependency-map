#!/bin/bash
set -e

while getopts d:f:h:i:j:p:t:u:v: option
do
case "${option}"
in
d) THIS_DIR_PATH=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
h) HOST_URL=${OPTARG};;
i) IP=${OPTARG};;
j) PROJ_NAME=${OPTARG};;
p) PORT=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
esac
done

echo Building the *visualize* Docker container, downloading JSON from GCP bucket
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
