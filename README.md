# cancer-dependency-map

This repository contains three distinct codebases:
* [gene-expression-public](\gene-expression-public) contains code to perform probabilistic program
synthesis and hypothesis testing on publicly available RNA sequencing data. See the [README](\gene-expression-public\README.md) and the [start-here](start-here.ipynb) notebook to get started.
* [genome-simulator](\genome-simulator) contains code to infer a probabilistic program of a genome and compute dependencies that can be used in the visualization. See the [synthesis demo notebook](synthesis-demo-with-one-part-Bridge.ipynb) to get started.
* [gene-expression-viz-bridge](\gene-expression-viz-bridge) contains code to start the UI to examine the dependencies inferred from the genome simulator. See the [README](\gene-expression-viz-bridge\README.md) to get started.

Note that `genome-simulator` and `gene-expression-viz-bridge` are [git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules).