# cancer-dependency-map

## Intro
This project automates running computationally-expensive probabilistic computing experiments on Google Cloud Platform (GCP). See the "Getting started" section for further instructions for getting this project up and running.

This repository contains 3 distinct codebases/experiments:
* `public`

[gene-expression-public](/gene-expression-public) contains code to perform probabilistic program
synthesis and hypothesis testing on publicly available RNA sequencing data. See the [README](/gene-expression-public/README.md) and the [start-here](/gene-expression-public/start-here.ipynb) notebook to get started.
* `private`

[genome-simulator](https://github.com/mit-quest/genome-simulator/) contains code to infer a probabilistic program of a genome and compute dependencies that can be used in the visualization. See the [synthesis demo notebook](https://github.com/mit-quest/genome-simulator/blob/master/synthesis-demo-with-one-part-Bridge.ipynb) to get started.
* `visualize`

[gene-expression-viz-bridge](https://github.com/mit-quest/gene-expression-viz-bridge) contains code to start the UI to examine the dependencies inferred from the genome simulator. See the [README](https://github.com/mit-quest/gene-expression-viz-bridge/blob/master/README.md) to get started.

Note that `genome-simulator` and `gene-expression-viz-bridge` are [git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules), so remember to run `git submodule init` and `git submodule update` after `git clone THIS_REPO`.

This repository has only been tested on Ubuntu, so it is possible that filepaths will break down on another OS.

## Getting started
0. [Intro to Terraform](https://learn.hashicorp.com/terraform/gcp/intro)
1. [Install Terraform](https://learn.hashicorp.com/terraform/gcp/install)

*Important:* This repository requires Terraform 0.12+.
2. [Set up GCP](https://learn.hashicorp.com/terraform/gcp/build)

The suggested path for the downloaded JSON is `~/.gcloud/Terraform.json`.
3. Generate SSH key pair

```
$ ssh-keygen -f ~/.ssh/gcloud_id_rsa
# Important: press <Enter> when asked (twice) for a pass-phrase
```

4. Edit tf.config

Modify the following lines with your specific data.
```
trial_id = NAME_OF_CURRENT_TRIAL_RUN
this_dir_path = PATH_TO_WHERE_YOU_INSTALLED_THIS_REPO
username = YOUR_GCP_USERNAME
project = YOUR_GCP_PROJECT_ID
credentials_file_path = PATH_TO_YOUR_GCP_SERVICE_ACCOUNT_KEY_JSON
public_key_path = PATH_TO_YOUR_SSH_PUBLIC_KEY
private_key_path = PATH_TO_YOUR_SSH_PRIVATE_KEY
```

You can also change any of the other variables if you would like, but the default values should work just fine.

Each subsequent run, you should only need to modify `trial_id`.

5. Build images

In the repository directory, run

`make build`

This command creates a VM that builds the Docker images for each experiment.

6. Run containers

For each experiment, you will need to run the following commands in order in the repository directory.

*Disclaimer*: You must start and finish your current experiment before running another one.

Using `public` as an example,

`make public_create`

This creates the VM, its related GCP resources, and installs any necessary dependencies on the VM.

`make public_start`

This creates the Docker container and runs its internal server.

`make public_open`

This opens a local browser to the Docker container's internal server. You can now begin running your computational experiment.

`make public_save`

This saves the experiment's results to a GCP bucket. (Not all experiments create data that needs to be saved.)

`make public_delete`

This deletes the VM and its related GCP resources.
