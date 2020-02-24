while getopts cred:proj:host:port:public:data: option
do
case "${option}"
in
cred) CRED_PATH=${OPTARG};;
proj) PROJ_NAME=${OPTARG};;
host) HOST_URL=${OPTARG};;
port) PORT=${OPTARG};;
public) PUBLIC_KEY_PATH=${OPTARG};;
data) DATA_DIR_PATH=${OPTARG};;
esac
done

# Login to Docker
cat $CRED_PATH | sudo docker login -u _json_key --password-stdin $HOST_URL

# Pull probcomp/rnaseq image
echo Pulling probcomp/visualizer from Google Cloud registry
sudo docker pull $HOST_URL/$PROJ_NAME/probcomp-visualizer

# Build container
echo Building probcomp/rnaseq container
sudo docker run -dit --rm -p $PORT:8888 probcomp/visualizer &

CONTAINER_ID=$(sudo docker container ls -l -q)

# Copy JSON to container (overwrite dummy JSON)
sudo docker cp $DATA_DIR_PATH/results-Bridge-demo-Arac-part.json $CONTAINER_ID:~/

# Run 'make' inside container to build website
sudo docker exec -it $CONTAINER_ID make
