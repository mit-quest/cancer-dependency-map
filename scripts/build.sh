# Read variables from arguments
while getopts cred:proj:host: option
do
case "${option}"
in
cred) CRED_PATH=${OPTARG};;
proj) PROJ_ID=${OPTARG};;
host) HOST_NAME=${OPTARG};;
esac
done

# Install Docker
echo Installing docker
sudo curl -sSL https://get.docker.com/ | sh

# Pull the probcomp/notebook image from the official Docker Hub
echo Pulling probcomp/notebook docker image from the official Docker Hub
sudo docker pull probcomp/notebook

# Login to Docker
cat $CRED_PATH | docker login -u _json_key --password-stdin $HOST_NAME

# Navigate to uploaded repository
cd cancer-dependency-map

# Build and push probcomp/rnaseq image
echo Building probcomp/rnaseq docker image
cd gene-expression-public
sudo docker build -t probcomp/rnaseq .
cd ..
echo Pushing probcomp/rnaseq to Google Cloud registry
sudo docker tag probcomp/rnaseq $HOST_NAME/$PROJ_ID/probcomp-rnaseq
sudo docker push $HOST_NAME/$PROJ_ID/probcomp-rnaseq

# Build and push probcomp/genome
echo Building probcomp/genome docker image
cd genome-simulator
sudo docker build -t probcomp/genome .
cd ..
echo Pushing probcomp/genome to Google Cloud registry
sudo docker tag probcomp/genome $HOST_NAME/$PROJ_ID/probcomp-genome
sudo docker push $HOST_NAME/$PROJ_ID/probcomp-genome

# Build probcomp/visualizer
echo Building probcomp/visualizer docker image
cd gene-expression-viz-bridge
sudo docker build -t probcomp/visualizer .
cd ..
echo Pushing probcomp/visualizer to Google Cloud registry
sudo docker tag probcomp/visualizer $HOST_NAME/$PROJ_ID/probcomp-visualizer
sudo docker push $HOST_NAME/$PROJ_ID/probcomp-visualizer
