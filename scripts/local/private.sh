# Read variables from arguments
while getopts ip:port:user:private:data: option
do
case "${option}"
in
ip) IP=${OPTARG};;
port) PORT=${OPTARG};;
user) USER=${OPTARG};;
private) PRIVATE_KEY_PATH=${OPTARG};;
data) DATA_DIR_PATH=${OPTARG};;
esac
done

# Securely copy the token text from the VM
scp -i $PRIVATE_KEY_PATH $USER@$IP:~/token.txt $DATA_DIR_PATH

# Securely copy the output JSON from the VM
scp -i $PRIVATE_KEY_PATH $USER@$IP:~/results-Bridge-demo-Arac-part.json $(dirname $DATA_DIR_PATH)/visualize

# Get the token string
TOKEN=$(cat $DATA_DIR_PATH/token.txt)

# Open website
xdg-open $IP:$PORT/?token=$TOKEN
