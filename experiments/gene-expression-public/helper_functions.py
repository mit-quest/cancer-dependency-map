import matplotlib.pyplot as plt
import networkx as nx
import numpy as np
import os
import pandas as pd
from scipy.stats import linregress
from scipy.stats import pearsonr
from scipy.stats import ttest_ind
from scipy import linalg

import seaborn as sns
sns.set_style("white")

def load_synthesized_code(_, n_models=1):
    """Stub. We synthesized the Metaprob programs with a
    pre-alpha prototype that we can't hand over yet. For this demo, we simply load previously
    synthesized files from disk."""
    with open('synthesized-programs.clj',"r") as f:
        all_code = f.read()
    if n_models < 30:
        return all_code.split('(define data-generating-process-model-{}'.format(n_models))[0]
    return all_code

def plot_virtual_data(df_select, df_sim, xlim=None, ylim=None):
    fig, ax = plt.subplots()
    alpha = 0.9
    size =5
    x = df_select.columns.values[0]
    y = df_select.columns.values[1]
    ax.scatter(df_sim[x].values, df_sim[y].values, alpha=alpha, s=size, color='blue')
    ax.scatter(df_select[x].values, df_select[y].values, color='red', alpha=alpha, s=size)
    ax.scatter([], [], color='blue', label='Synthetic data')
    ax.scatter([], [], color='red', label='Observed data')
    if xlim is not None:
        ax.set_xlim(xlim)
    if ylim is not None:
        ax.set_ylim(ylim)
    ax.legend()
    ax.set_xlabel(x)
    ax.set_ylabel(y)
    ax.grid(True)
    fig.set_size_inches(8, 7)
    ax.set_title('Observed vs synthetic data ')
    plt.tight_layout()
    return fig, ax


def get_model_code(id, code):
    start  = '(define data-generating-process-model-{}'.format(id)
    # What a hack:
    end_rna = '[araC araB araA araD arabinose glucose]'
    end_nyt = '[percent_married_children percent_black percent_college per_capita_income]'
    if end_rna in code:
        end = end_rna
    else:
        end = end_nyt
    return code.split(start)[1].split(end)[0]

def get_cluster(line):
    return [s.replace(' (', '') for s in line.split('-')[3::]]

def get_dependence_from_code(model_id, code):
    model_code = get_model_code(model_id, code)
    return [
        get_cluster(line_of_code)
        for line_of_code in model_code.split("\n")
        if 'define cluster-id' in line_of_code
    ]

def render_dependence(clustering):
    g = nx.DiGraph()
    pos_counter = 0
    flat_list = [item for sublist in clustering for item in sublist]
    max_number_latents=len(flat_list)
    if 'per_capita_income' in flat_list:
        node_scale=3
    else:
        node_scale=1
    for i,cluster in enumerate(clustering):
        cluster_pos = pos_counter + (len(cluster)-1)/2.
        g.add_node('hidden var {}'.format(i + 1), pos=(cluster_pos, max_number_latents),)
        for var in cluster:
            g.add_node(var, pos=(pos_counter, 1))
            pos_counter+=1
            g.add_edge('hidden var {}'.format(i + 1),var)
    pos=nx.get_node_attributes(g,'pos')
    nx.draw(g, pos, with_labels=True, node_size=node_scale*5000, node_color='white')


def corr_plots(x, y, data, xlims=None, ymax=None):
    fig, ax = plt.subplots()
    ax.scatter(data[x].values, data[y].values, color='black', s=5, label='Observed data')
    if xlims is not None:
        xmin, xmax = xlims
        slope, intercept, r_value, p_value, std_err = linregress(data[x].values, data[y].values)
        r_s, _ = pearsonr(data[x].values, data[y].values)
        xs = np.linspace(xmin, xmax, 100)
        ax.plot(xs, intercept + slope * xs, color='red', label='Regression line')
        ax.legend()
        ax.set_title('Pearson r^2: %.2f' % (r_s**2,))
    ax.grid(True)
    ax.set_xlim(xlims)
    if ymax is not None:
        ax.set_ylim([0, ymax])
    ax.set_xlabel(x)
    ax.set_ylabel(y)
    return fig, ax


# Taken from here https://stats.stackexchange.com/questions/288273/partial-correlation-in-panda-dataframe-python
def partial_correlation(C):
    """
    Returns the sample linear partial correlation coefficients between pairs of variables in C, controlling 
    for the remaining variables in C.
    Parameters
    ----------
    C : array-like, shape (n, p)
        Array with the different variables. Each column of C is taken as a variable
    Returns
    -------
    P : array-like, shape (p, p)
        P[i, j] contains the partial correlation of C[:, i] and C[:, j] controlling
        for the remaining variables in C.
    """

    C = np.asarray(C)
    p = C.shape[1]
    P_corr = np.zeros((p, p), dtype=np.float)
    for i in range(p):
        P_corr[i, i] = 1
        for j in range(i+1, p):
            idx = np.ones(p, dtype=np.bool)
            idx[i] = False
            idx[j] = False
            beta_i = linalg.lstsq(C[:, idx], C[:, j])[0]
            beta_j = linalg.lstsq(C[:, idx], C[:, i])[0]

            res_j = C[:, j] - C[:, idx].dot( beta_i)
            res_i = C[:, i] - C[:, idx].dot(beta_j)

            corr = pearsonr(res_i, res_j)[0]
            P_corr[i, j] = corr
            P_corr[j, i] = corr
    # Hack: only return x,y given z as a dataframe:
    return pd.DataFrame({'r':[P_corr[0,1]**2]})

def plot_information_flow(mi_estimates, mi_names):
    fig, axes = plt.subplots(ncols=4, nrows=1)
    for i,ax in enumerate(axes):
        plot_density(mi_estimates[i], mi_names[i], ax)
    fig.set_size_inches(15, 3)

def plot_density(mi, title, ax):
    ax = sns.distplot(mi, hist=False, rug=True, ax=ax, color='black')
    ax.get_yaxis().set_visible(False)
    ax.set_xlabel('MI')
    ax.set_ylabel('Pr[MI]')
    ax.set_xlim(-0.1,  0.6)
    ax.set_title(title)
