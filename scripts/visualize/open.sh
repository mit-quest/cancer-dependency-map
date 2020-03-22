#!/bin/bash
set -e

# Read variables from arguments
while getopts i:p:u:v:d:t:f: option
do
case "${option}"
in
i) IP=${OPTARG};;
p) PORT=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
d) DATA_DIR_PATH=${OPTARG};;
t) TRIAL_ID=${OPTARG};;
f) FOLDER_NAME=${OPTARG};;
esac
done

# Open website
echo Opening Clojure website
xdg-open http://$IP:$PORT &