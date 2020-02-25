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

# Open website
xdg-open http://$IP:$PORT
