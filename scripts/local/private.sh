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
scp -i $PRIVATE_KEY_PATH $USER@$IP:~/token.txt $DATA_DIR_PATH

# Securely copy the output JSON from the VM
scp -i $PRIVATE_KEY_PATH $USER@$IP:~/results-Bridge-demo-Arac-part.json $(dirname $DATA_DIR_PATH)/visualize

# Get the token string
TOKEN=$(cat $DATA_DIR_PATH/token.txt)

# Open website
xdg-open http://$IP:$PORT/?token=$TOKEN
