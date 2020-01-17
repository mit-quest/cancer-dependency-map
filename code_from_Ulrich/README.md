# Demonstrating probabilistic program synthesis and hypothesis testing

We provide two, dockerized notebooks to demonstrate probabilistic program
synthesis and hypothesis testing. You will have to install docker to run the
demo.

## Install Docker

We've developed the Docker image using Docker for Linux. Users of Docker Toolbox should be able to use these images, but will need to make some minor adjustments to some commands. See [1] for details about Docker Desktop vs Docker Toolbox.

Try running `docker --version`. If you that command succeeds, you can skip this section, though see [^1] if you're unsure if you have Docker Desktop or Docker Toolbox installed.

Otherwise, first obtain Docker (for [Mac and Windows](https://www.docker.com/products/docker-desktop), or for [Linux](https://docs.docker.com/install/linux/docker-ce/ubuntu/))

If on Linux, make sure to run the [post-installation steps](https://docs.docker.com/install/linux/linux-postinstall/) so that you can run the docker commands smoothly without needing sudo access.

If on Mac, run the Docker application and make sure that you see the Docker whale icon in your menu bar (when you click on the icon it should say "Docker Desktop is running").

## Build the container

Navigate to the extracted directory
```
$ cd 2019-04-04/

```
then build the Docker image:
```
$ docker build -t probcomp/rnaseq .
```

## Run a container with the demo

Execute the demo by running:
```
$ docker run -it --rm -p 8888:8888 probcomp/rnaseq
```

You should see the following output:
```
$ docker run -it --rm -p 8888:8888 probcomp/rnaseqSyncing tutorial notebooks
Trusting tutorial notebooks
[TrustNotebookApp] Writing notebook-signing key to /home/jovyan/.local/share/jupyter/notebook_secret
/usr/local/bin/start-notebook.sh: ignoring /usr/local/bin/start-notebook.d/*

Container must be run with group root to update passwd file
Executing the command: jupyter notebook
[W 13:01:56.417 NotebookApp] Config option `delete_to_trash` not recognized by `LargeFileManager`.
[I 13:01:56.423 NotebookApp] Writing notebook server cookie secret to /home/jovyan/.local/share/jupyter/runtime/notebook_cookie_secret
[W 13:01:56.722 NotebookApp] WARNING: The notebook server is listening on all IP addresses and not using encryption. This is not recommended.
[I 13:01:56.729 NotebookApp] Serving notebooks from local directory: /home/jovyan
[I 13:01:56.730 NotebookApp] 0 active kernels
[I 13:01:56.730 NotebookApp] The Jupyter Notebook is running at:
[I 13:01:56.730 NotebookApp] http://[all ip addresses on your system]:8888/?token=d4ff19f2c82691cc4fb4653ae81355ed7cdc68ecabfd44df
[I 13:01:56.730 NotebookApp] Use Control-C to stop this server and shut down all kernels (twice to skip confirmation).
[C 13:01:56.730 NotebookApp] 
    
    Copy/paste this URL into your browser when you connect for the first time,
    to login with a token:
        http://localhost:8888/?token=d4ff19f2c82691cc4fb4653ae81355ed7cdc68ecabfd44df
```
In your browser, navigate to the URL above.


### Notes

[1]: Docker Desktop is the currently supported and developed application for using Docker containers on desktop operating systems. The Docker folks [recommend its use](https://docs.docker.com/toolbox/) over the older Docker Toolbox release and provide instructions for upgrading on [Mac](https://docs.docker.com/docker-for-mac/install/) and [Windows](https://docs.docker.com/docker-for-windows/install/). Our problem set notebooks run on either Desktop or Toolbox docker installations, but our documentation is towards Docker Desktop users.

If you're unsure if you have Toolbox or Desktop installed, try running `docker-machine env default` in a shell. If that command returns a number of environment variables, you're running Docker Toolbox. If it returns an error, you're likely running Desktop.

[2]: Docker Toolkit users will need to use the IP address of the virtual machine hosting Docker containers in place of `localhost` or `127.0.0.1` when accessing the problem set notebook, and later when using the visualization server running in the container.

To get the IP address of the Docker virtual machine, run `docker-machine ip` in a shell. This should return an address in the `192.168.x.y` range, which should be used in place of `localhost` or `127.0.0.1` in the instructions in ths document.
