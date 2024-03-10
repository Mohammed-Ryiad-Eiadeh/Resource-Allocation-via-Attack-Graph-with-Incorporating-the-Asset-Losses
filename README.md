# Paper Tiltle: AARA-PR: Asset-Aware PageRank-based Security Resource Allocation Method for Attack Graphs

# abstract

Interdependent systems face rising cybersecurity risks. This paper introduces a security decision-making framework managed by a single defender. We use cyber attack graphs to model vulnerabilities and prioritize critical assets using the PageRank algorithm. Our approach demonstrates resilience to concurrent attacks and outperforms existing algorithms in resource allocation across four real-world scenarios, supported by statistical tests. The full implementation is available for further research exploration

# Framework

Our proposed framework, AARA-PR addresses resource allocation challenges in interconnected systems. Our approach leverages attack graphs, considering both entry nodes (used by attackers) and critical asset nodes (defender’s targets). Using a Genetic Algorithm (GA), we generate potential attack paths, encoding them to prevent revisiting nodes. These paths are evaluated based on asset loss, guiding decisions on path survival or replacement. Next, the defender allocates her security budget across these paths, each corresponding to an attack route from an entry node to a critical asset. Our resource allocation strategy integrates a modified PageRank algorithm, assessing asset importance by considering the attack graph and estimated financial losses tied to critical assets. In summary, our framework optimizes security investments by strategically safeguarding critical assets in interdependent systems .

![Picture2](https://github.com/Mohammed-Ryiad-Eiadeh/Resource-Allocation-via-Attack-Graph-with-Incorporating-the-Asset-Losses/assets/93108547/77502246-2ad5-4c41-8e48-033c8d05c04b)

# Fitness Function

$F_2(P) = \max_{P \in P_m} \big(\exp\big(-\sum_{(v_i,v_j)\in P} {x_{i,j}}\big) + Wf\sum_{v_m\in P} L_m\big).$
   
   $P$ is the given attack path.

   $P_m$ is a set of attack paths.

   $v_i,v_j$ are the nodes in $P$.

   $L_m$ is the loss corresponding to node $v_m$

   $Wf$ is the weight factor lies in [0,1]
   
This function accounts for the total asset loss that the system will lose if the attack is occured successfully.

# Our Contribution

1) We propose a method for security resource allocation in interdependent systems, where assets are interlinked. Our approach impacts decision-making processes related to system security, and we quantify the enhancement achieved through our allocation method.
2) We use the Genetic Algorithm (GA) to identify likely attack paths from entry nodes to critical assets. The GA determines the attack paths for each potential entry node, considering the total estimated financial loss associated with specific attack paths.
3) We adapt the popular PageRank algorithm to consider assets's losses when doing ranking of the importance of different system's critical assets.
4) We evaluate AARA-PR on four systems. We compare it against two baseline resource allocation methods.

# Datasets We Used In Our Work

For our assessment, we used ten distinct attack graphs, each symbolizing a different interdependent system and network structure. We divided these datasets into three groups. The first group contains four attack graphs from real-world interconnected systems, namely DER.1, SCADA, E-commerce, and VOIP. Signifies an attack step, and we consider every edge to be bidirectional. The second group consists of two graph typologies, referred to as HG1 and HG2, which were introduced in earlier studies. The third group includes four datasets from a renowned interactive scientific graph data repository, named aves-sparrow-social-2009 (ASC2009), aves-sparrowlyon-flock-season3 (ASFS3), aves-weaver-social-03 (AWS03), and aves-barn-swallow-non-physical (ABSNP). This repository is a network data collection produced by top-tier US niversities. 

| System | # Nodes | # Edges | # Critical Assets | Graph Type |
| --- | --- | --- | --- | --- |
| SCADA [12] | 13 | 20 | 6 | Directed |
| DER.1 [13] | 22 | 32 | 6 | Directed |
| E-Commerce [14] | 20 | 32 | 4 | Directed |
| VOIP [14] | 22 | 35 | 6 | Directed |

Note: all of these datasets are stored in the project directory and is called dynamically so no need to set up their paths.

# Parameter Configuration of Our Experiments

We specify the primary hyperparameters used in our framework components. For the GA, parameters include: maximum iterations ($M=500$), population size ($N=2000$), mating probability ($m_p=0.2$), mutation rate ($m_r=0.2$), and weight factor ($Wf=0.001$) for the fitness function. The defender's security budget is set at $S=20$, and the PR algorithm parameters include maximum iterations ($PR_{iter}=100$) and epsilon ($\epsilon=0.0001$). We employed different values for $Wf_1$ (weight factor in our modified PageRank algorithm). We emphasize that our defense strategies' benefits are applicable across different security budgets. For the behavioral defender baseline~\cite{Abdallah2020}, we set the behavioral level ($a$) at 0.5. It is also worth noting that initial weights on the edges were randomly generated with values between 0 and 1.

# Comparison of GeniGraph and baseline systems on all datasets

The row "Measurements" show the relative difference of the expected cost $CR$ for all defense scenarios. The larger $CR$, the better the defense method with significance level equals 0.05 for the Friedman test.

In the following table, $Wf=0.01$ for AARA-PR. The null hypothesis is rejected and AARA-PR is ranked the best.
| **System**                           | **\name**   | **Defense in Depth** | **Behavioral Defender** |
|-------------------------------------|-------------|---------------------------|-------------------------------|
| SCADA [12]                         | **89.519**  | 63.212                    | 68.397                        |
| DER.1 [13]                         | **89.870**  | 46.474                    | 45.731                        |
| E-Commerce [14]                    | **73.530**  | 46.474                    | 45.731                        |
| VOIP [14]                          | **66.723**  | 43.528                    | 45.294                        |
| **Rank First**                      | **4**       | 0                         | 0                             |
| **Sum of Ranks**                    | **12**      | 6                         | 6                             |
| **Mean Rank**                       | **3**       | 1.5                       | 1.5                           |

In the following table, $Wf=0.9$ for AARA-PR. The null hypothesis is rejected and AARA-PR is ranked the best.
| **System**                           | **\name**   | **Defense in Depth** | **Behavioral Defender** |
|-------------------------------------|-------------|---------------------------|-------------------------------|
| SCADA [12]                         | **88.250**  | 63.212                    | 68.397                        |
| DER.1 [13]                         | 92.745  | 46.474                    | 45.731                        |
| E-Commerce [14]                     | **95.527**  | 46.474                    | 45.731                        |
| VOIP [14]                          | **52.897**  | 43.528                    | 45.294                        |
| **Rank First**                      | **4**       | 0                         | 0                             |
| **Sum of Ranks**                    | **12**      | 6                         | 6                             |
| **Mean Rank**                       | **3**       | 1.5                       | 1.5                           |

# Conclusion

This study introduced a new defensive resource allocation strategy to assess decision-making's impact on interdependent system security. We started by using attack graphs to model systems and vulnerabilities. We then proposed a resource allocation method, prioritizing edges using in-Degree Defense. We adapted the PageRank algorithm to prioritize critical assets based on connectivity and assets' losses. Our method has low sensitivity to varying attacks, aiding decision-makers in enhancing system security. We extensively evaluated our approach across four real-world systems, confirming its effectiveness. We also compared our method with two existing resource allocation techniques, demonstrating its efficacy. Our findings suggests that \name is a viable security allocation method (specially when loss values of critical assets are heterogeneous), significantly strengthening system security. Additionally, we offer an open-source implementation of our framework for further exploration and customization.

# How To Run The Code (read carefully please)

1) Download intellIJ IDEA latest version
2) Dounload JDK 17 or higher
3) Set up the environment variable for the bin folder of the JDK 17+
4) Open the IDEA
5) Open the project
6) Make sure you are connected to the internet
7) Wait while the IDEA download all the libraries that are included as dependencies in the pom XML file
8) Go to the main file (here you will get 3 files that are executable (have "psvm" method)) so these files are as follows:

   a) BehavioralDefenderMain: this class is used to run a behavioral defender based on prospect theory for allocating the resourcess.

   b) DefenseInDepthMain: this class is used to allocate the resourcess equally over all edges of the given graph.

   c) PageRankWithInDegreeMain: this class is used to run AARA-PR which uses PageRank to rank the assets considering the losess and propagating the resourcess on the in-degree edges of each asset.

9) Set up the desired hyperparameters
10) Run the file to see the results.
   
# References

[12] A. R. Hota, A. Clements, S. Sundaram, and S. Bagchi. 2016. Optimal and game-theoretic deployment of security investments in interdependent assets. In International Conference on Decision and Game Theory for Security. 101–113.

[13] S. Jauhar, B. Chen, W. G. Temple, X. Dong, Z. Kalbarczyk, W. H. Sanders, and D. M. Nicol. 2015. Model-based cybersecurity assessment with nescor smart grid failure scenarios. In Dependable Computing (PRDC), 2015 IEEE 21st Pacific Rim International Symposium on. IEEE, 319–324.

[14] G. Modelo-Howard, S. Bagchi, and G. Lebanon. 2008. Determining placement of intrusion detectors for a distributed application through bayesian network modeling. In International Workshop on Recent Advances in Intrusion Detection. Springer, 271–290.
