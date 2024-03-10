# Paper Tiltle: AARA-PR: Asset-Aware PageRank-based Security Resource Allocation Method for Attack Graphs

# abstract

Interdependent systems face rising cybersecurity risks. This paper introduces a security decision-making framework managed by a single defender. We use cyber attack graphs to model vulnerabilities and prioritize critical assets using the PageRank algorithm. Our approach demonstrates resilience to concurrent attacks and outperforms existing algorithms in resource allocation across four real-world scenarios, supported by statistical tests. The full implementation is available for further research exploration

# Framework

Our proposed framework, AARA-PR addresses resource allocation challenges in interconnected systems. Our approach leverages attack graphs, considering both entry nodes (used by attackers) and critical asset nodes (defender’s targets). Using a Genetic Algorithm (GA), we generate potential attack paths, encoding them to prevent revisiting nodes. These paths are evaluated based on asset loss, guiding decisions on path survival or replacement. Next, the defender allocates her security budget across these paths, each corresponding to an attack route from an entry node to a critical asset. Our resource allocation strategy integrates a modified PageRank algorithm, assessing asset importance by considering the attack graph and estimated financial losses tied to critical assets. In summary, our framework optimizes security investments by strategically safeguarding critical assets in interdependent systems .

![Picture2](https://github.com/Mohammed-Ryiad-Eiadeh/Resource-Allocation-via-Attack-Graph-with-Incorporating-the-Asset-Losses/assets/93108547/77502246-2ad5-4c41-8e48-033c8d05c04b)


