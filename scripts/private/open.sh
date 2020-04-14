#!/bin/bash
set -e

# Read variables from arguments
while getopts d:i:p: option
do
case "${option}"
in
d) THIS_DIR_PATH=${OPTARG};;
i) IP=${OPTARG};;
p) PORT=${OPTARG};;
esac
done

# Get the token string
TOKEN=$(cat $THIS_DIR_PATH/data/private/token.txt)

# Open website
echo Opening Jupyter notebook website
xdg-open http://$IP:$PORT/?token=$TOKEN &
