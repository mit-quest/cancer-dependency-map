# cancer-dependency-map

## Intro
This repository is an automated way to run computationally expensive Jupyter notebook experiments on Google Cloud Platform (GCP). See "Getting started" for further instructions.

This repository contains three distinct codebases:
* [gene-expression-public](/gene-expression-public) contains code to perform probabilistic program
synthesis and hypothesis testing on publicly available RNA sequencing data. See the [README](/gene-expression-public/README.md) and the [start-here](/gene-expression-public/start-here.ipynb) notebook to get started.
* [genome-simulator](https://github.com/mit-quest/genome-simulator/) contains code to infer a probabilistic program of a genome and compute dependencies that can be used in the visualization. See the [synthesis demo notebook](https://github.com/mit-quest/genome-simulator/blob/master/synthesis-demo-with-one-part-Bridge.ipynb) to get started.
* [gene-expression-viz-bridge](https://github.com/mit-quest/gene-expression-viz-bridge) contains code to start the UI to examine the dependencies inferred from the genome simulator. See the [README](https://github.com/mit-quest/gene-expression-viz-bridge/blob/master/README.md) to get started.

Note that `genome-simulator` and `gene-expression-viz-bridge` are [git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules).

## Getting started
0. [Intro to Terraform](https://learn.hashicorp.com/terraform/gcp/intro)
1. [Install Terraform](https://learn.hashicorp.com/terraform/gcp/install)

This repository has only been tested on Ubuntu, it is possible that filepaths will break down on another OS.
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
