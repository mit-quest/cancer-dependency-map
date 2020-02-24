# tools
SHELL := /bin/bash

# Default command and help messages
.PHONY: default help
default: help

.PHONY: build
build:
	cd tf-build-images && terraform init && terraform apply && terraform destroy

.PHONY: public
public:
	cd tf-run-containers && terraform init && terraform apply -var 'image=public' -var 'data_dir_path=$(realpath ./data/public)'

.PHONY: private
private:
	cd tf-run-containers && terraform init && terraform apply -var 'image=private' -var 'data_dir_path=$(realpath ./data/private)'

.PHONY: visualize
visualize:
	cd tf-run-containers && terraform init && terraform apply -var 'image=visualize' -var 'data_dir_path=$(realpath ./data/visualize)'
