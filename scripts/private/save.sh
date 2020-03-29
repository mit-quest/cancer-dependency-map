#!/bin/bash
set -e

# Read variables from arguments
while getopts f:i:p:t:u:v: option
do
case "${option}"
in
f) FOLDER_NAME=${OPTARG};;
i) IP=${OPTARG};;
p) PORT=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
esac
done

# SSH into VM and execute commands
echo SSHing into VM and uploading JSON to GCP bucket
ssh -T -i $PRIVATE_KEY_PATH -o UserKnownHostsFile=/dev/null -o CheckHostIP=no -o StrictHostKeyChecking=no $USER@$IP << EOF
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
          /snap/bin/gsutil cp ~/results-Bridge-demo-Arac-part.json gs://$FOLDER_NAME-bucket-$USER/private/$TRIAL_ID.json

          exit 0
        fi
      done
      # Could not access Jupyter Notebook server within 60 seconds
      exit 2
    fi
  done
  # Could not ping Docker container server within 60 seconds
  exit 1
EOF
