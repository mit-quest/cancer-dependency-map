FROM probcomp/notebook

# Notebooks
ADD start-here.ipynb /home/jovyan/
ADD data-preprocessing.ipynb /home/jovyan/work/
ADD RNAseq-synthesis-and-hypothesis-testing.ipynb /home/jovyan/work/

# Helper functions for plotting and linear stats.
ADD helper_functions.py /home/jovyan/work/

# Images for figures.
ADD operon.png /home/jovyan/work/
ADD araC-dag-structure.jpg /home/jovyan/work/

# Synthesized program files.
ADD synthesized-programs.clj /home/jovyan/work/

# Change permissions.
USER root
RUN chmod 777 /home/jovyan/start-here.ipynb
RUN chmod 777 /home/jovyan/work/data-preprocessing.ipynb
RUN chmod 777 /home/jovyan/work/RNAseq-synthesis-and-hypothesis-testing.ipynb

USER jovyan
