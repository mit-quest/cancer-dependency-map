# tools
SHELL := /bin/bash

# Default command and help messages
.PHONY: default help
default: help

.PHONY: build
build:
	cp tf.config build-images/terraform.tfvars
	cd build-images && terraform init && terraform apply && terraform destroy

.PHONY: public_create
public_create:
	cp tf.config run-containers/terraform.tfvars
	cd run-containers && terraform init && terraform apply -var 'image=public' -var 'status=RUNNING'

.PHONY: public_start
public_start:
	cd run-containers && terraform init && terraform apply -var 'image=public' -var 'status=RUNNING'
	bash data/public/start.txt

.PHONY: public_stop
public_stop:
	cd run-containers && terraform init && terraform apply -var 'image=public' -var 'status=TERMINATED'

.PHONY: public_open
public_open:
	bash data/public/open.txt

.PHONY: public_save
public_save:
	bash data/public/save.txt

.PHONY: public_delete
public_delete:
	cd run-containers && terraform destroy

.PHONY: private_create
private_create:
	cp tf.config run-containers/terraform.tfvars
	cd run-containers && terraform init && terraform apply -var 'image=private' -var 'status=RUNNING'

.PHONY: private_start
private_start:
	cd run-containers && terraform init && terraform apply -var 'image=private' -var 'status=RUNNING'
	bash data/private/start.txt

.PHONY: private_stop
private_stop:
	cd run-containers && terraform init && terraform apply -var 'image=private' -var 'status=TERMINATED'

.PHONY: private_open
private_open:
	bash data/private/open.txt

.PHONY: private_save
private_save:
	bash data/private/save.txt

.PHONY: private_delete
private_delete:
	cd run-containers && terraform destroy

.PHONY: visualize_create
visualize_create:
	cp tf.config run-containers/terraform.tfvars
	cd run-containers && terraform init && terraform apply -var 'image=visualize' -var 'status=RUNNING'

.PHONY: visualize_start
visualize_start:
	cd run-containers && terraform init && terraform apply -var 'image=visualize' -var 'status=RUNNING'
	bash data/visualize/start.txt

.PHONY: visualize_stop
visualize_stop:
	cd run-containers && terraform init && terraform apply -var 'image=visualize' -var 'status=TERMINATED'

.PHONY: visualize_open
visualize_open:
	bash data/visualize/open.txt

.PHONY: visualize_save
visualize_save:
	bash data/visualize/save.txt

.PHONY: visualize_delete
visualize_delete:
	cd run-containers && terraform destroy
