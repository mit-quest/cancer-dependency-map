# Install Docker
echo Installing docker
sudo curl -sSL https://get.docker.com/ | sh

# Pull the probcomp/notebook image from the official Docker Hub
echo Pulling probcomp/notebook docker image from the official Docker Hub
sudo docker pull probcomp/notebook

# Navigate to repository and get variables
cd cancer-dependency-map
credentials_file_path=$(cat "credentials_file_path.txt")
project_name=$(cat "project_name.txt")
host_name=$(cat "host_name.txt")

# Login to Docker
cat $credentials_file_path | docker login -u _json_key --password-stdin $host_name

# Build and push probcomp/rnaseq image
echo Building probcomp/rnaseq docker image
cd gene-expression-public
sudo docker build -t probcomp/rnaseq .
cd ..
echo Pushing probcomp/rnaseq to Google Cloud registry
sudo docker tag probcomp/rnaseq $host_name/$project_name/probcomp-rnaseq
sudo docker push $host_name/$project_name/probcomp-rnaseq
sudo docker images rm probcomp/rnaseq

# Build and push probcomp/genome
echo Building probcomp/genome docker image
cd genome-simulator
sudo docker build -t probcomp/genome .
cd ..
echo Pushing probcomp/genome to Google Cloud registry
sudo docker tag probcomp/genome $host_name/$project_name/probcomp-genome
sudo docker push $host_name/$project_name/probcomp-genome

# Build probcomp/visualizer
echo Building probcomp/visualizer docker image
cd gene-expression-viz-bridge
sudo docker build -t probcomp/visualizer .
cd ..
echo Pushing probcomp/visualizer to Google Cloud registry
sudo docker tag probcomp/visualizer $host_name/$project_name/probcomp-visualizer
sudo docker push $host_name/$project_name/probcomp-visualizer
