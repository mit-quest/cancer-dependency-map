# cancer-dependency-map

This repository contains three distinct codebases:
* [gene-expression-public](/gene-expression-public) contains code to perform probabilistic program
synthesis and hypothesis testing on publicly available RNA sequencing data. See the [README](/gene-expression-public/README.md) and the [start-here](/gene-expression-public/start-here.ipynb) notebook to get started.
* [genome-simulator](https://github.com/mit-quest/genome-simulator/) contains code to infer a probabilistic program of a genome and compute dependencies that can be used in the visualization. See the [synthesis demo notebook](https://github.com/mit-quest/genome-simulator/blob/master/synthesis-demo-with-one-part-Bridge.ipynb) to get started.
* [gene-expression-viz-bridge](https://github.com/mit-quest/gene-expression-viz-bridge) contains code to start the UI to examine the dependencies inferred from the genome simulator. See the [README](https://github.com/mit-quest/gene-expression-viz-bridge/blob/master/README.md) to get started.

Note that `genome-simulator` and `gene-expression-viz-bridge` are [git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules).
