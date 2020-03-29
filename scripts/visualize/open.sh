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

# Open website
echo Opening Clojure website
xdg-open http://$IP:$PORT &
