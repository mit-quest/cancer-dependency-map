# Read variables from arguments
while getopts i:p:u:v:d: option
do
case "${option}"
in
i) IP=${OPTARG};;
p) PORT=${OPTARG};;
u) USER=${OPTARG};;
v) PRIVATE_KEY_PATH=${OPTARG};;
d) DATA_DIR_PATH=${OPTARG};;
esac
done

# Securely copy the token text from the VM
echo Copying Jupyter notebook token down to localhost
scp -i $PRIVATE_KEY_PATH $USER@$IP:~/token.txt $DATA_DIR_PATH/token.txt

# Get the token string
echo Grabbing Jupyter notebook token
TOKEN=$(cat $DATA_DIR_PATH/token.txt)

# Open website
echo Opening Jupyter notebook website
xdg-open http://$IP:$PORT/?token=$TOKEN &

# Remove IP from ssh known hosts
echo Removing VM IP from ssh known hosts
ssh-keygen -R $IP
