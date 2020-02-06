# tools
SHELL := /bin/bash

# Default command and help messages
.PHONY: default help
default: help

.PHONY: build
build:
	cd tf-build-images && terraform init && terraform apply && terraform destroy

.PHONY: run
run:
	cd tf-run-containers && terraform init && terraform apply && terraform destroy

.PHONY: public
public:
	bash scripts/public.sh

.PHONY: private
private:
	bash scripts/private.sh

.PHONY: visualize
visualize:
	bash scripts/visualize.sh
