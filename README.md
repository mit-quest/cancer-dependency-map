# cancer-dependency-map

## For Future Devs
https://docs.google.com/document/d/1YhYWo3PuyuZEE7OTFxbVL6XJ_YH1O3Z5HTdOkvXdsUA/edit?usp=sharing

## Intro
This project automates running computationally-expensive probabilistic computing experiments with [MIT Probabilistic Computing Project](http://probcomp.csail.mit.edu/) libraries on Google Cloud Platform (GCP). See the **Getting started** section for further instructions for running this project.

The code has only been tested on Ubuntu 18.04, so it could break on another OS.

This repository contains 3 distinct experiments, all located in the `experiments` directory.
* `public`

  [gene-expression-public](/experiments/gene-expression-public) contains code to perform probabilistic program
  synthesis and hypothesis testing on publicly available RNA sequencing data. See the [README](/experiments/gene-expression-public/README.md) and the [start-here](/experiments/gene-expression-public/start-here.ipynb) notebook to get started.

* `private`

  [genome-simulator](https://github.com/mit-quest/genome-simulator/) contains code to infer a probabilistic program of a genome and compute dependencies that can be used in the visualization. See the [synthesis demo notebook](https://github.com/mit-quest/genome-simulator/blob/master/synthesis-demo-with-one-part-Bridge.ipynb) to get started.

* `visualize`

  [gene-expression-viz-bridge](https://github.com/mit-quest/gene-expression-viz-bridge) contains code to start the UI to examine the dependencies inferred from the genome simulator. See the [README](https://github.com/mit-quest/gene-expression-viz-bridge/blob/master/README.md) to get started.

Note that `genome-simulator` and `gene-expression-viz-bridge` are [git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules).

## Getting started
0. **Clone this repository**

  ```
  cd ~
  git clone https://github.com/mit-quest/cancer-dependency-map.git
  cd ~/cancer-dependency-map
  git submodule init
  git submodule update
  ```

1. **[Intro to Terraform](https://learn.hashicorp.com/terraform/gcp/intro)**

2. **[Install Terraform](https://learn.hashicorp.com/terraform/gcp/install)**

  This repository requires Terraform 0.12+.

3. **[Set up GCP](https://learn.hashicorp.com/terraform/gcp/build)**

  The suggested path for the downloaded JSON is `~/.gcloud/Terraform.json`.

4. **Generate SSH key pair**

  ```
  $ ssh-keygen -f ~/.ssh/gcloud_id_rsa
  # Important: press <Enter> when asked (twice) for a pass-phrase
  ```

5. **Edit tf.config**

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

  For each subsequent run, you should only need to modify `trial_id`.

6. **Build images**

  To build and save the Docker images for all experiments you will need to run the following command in the repository directory.

  * `make build`

    Create a VM that builds the Docker images for each experiment and pushes them to the GCP registry.

7. **Run containers**

  For each experiment, you will need to run the following commands in order in the repository directory.

  *Disclaimer*: You must start and finish your current experiment before running another one.

  Using the experiment `public` as an example,

  * `make public_create`

    Create the VM, build its related GCP resources, and install dependencies on the VM.

  * `make public_start`

    Start a Docker container and run its internal experiment.

  * `make public_stop`

    Pause the VM, which shuts down the Docker container. *Shutting down the Docker container will not erase your saved changes since they are kept with the VM.*

  * `make public_open`

    Open a local browser to the Docker container's internal server so the user can begin running experiments.

  * `make public_save`

    Save the experiment's output to a GCP bucket. (Not all experiments create data that needs to be saved.)

  * `make public_delete`

    Delete the VM and its related GCP resources.
