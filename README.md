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

| System | # Nodes | # Edges | # Critical Assets | $v_s$ / $v_m$ | Graph Type |
| --- | --- | --- | --- | --- | --- | --- | --- |
| SCADA [12] | 13 | 20 | 6 | 1 / 13 | Directed |
| DER.1 [13] | 22 | 32 | 6 | 1 / 22 | Directed |
| E-Commerce [14] | 20 | 32 | 4 | 1 / 20 | Directed |
| VOIP [14] | 22 | 35 | 6 | 1 / 22 | Directed |
