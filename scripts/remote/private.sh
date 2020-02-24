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
echo Pulling probcomp/genome from Google Cloud registry
sudo docker pull $HOST_URL/$PROJ_NAME/probcomp-genome

# Build container
echo Building probcomp/genome container
sudo docker run -it --rm -p $PORT:8888 probcomp/genome &

CONTAINER_ID=$(sudo docker container ls -l -q)

# parse auth token from Docker logs and write to text file
sudo docker exec -it $CONTAINER_ID jupyter notebook list | grep -o -P '(?<=token=).*(?= :)' > ~/token.txt

# copy output JSON from Docker container down to VM
sudo docker cp $CONTAINER_ID:/home/jovyan/cmi-results/results-Bridge-demo-Arac-part.json ~

# append public key to end of authorized_keys
cat $PUBLIC_KEY_PATH >> ~/.ssh/authorized_keys

