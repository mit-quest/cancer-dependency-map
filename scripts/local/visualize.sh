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

# Open website
xdg-open $IP:$PORT
