package Attack_Defence_Graph.org;

import java.nio.file.Path;

/**
 * Thi enumeration includes the value id for each graph problem we have
 */
public enum Graph {
    SCADA_rand, DER_rand, e_commerce_rand, VOIP_rand;

    /**
     * This method is used to retrieve the path of the graph problem
     * @return The path of the graph problem
     */
    public Path getPath() {
        String directory = System.getProperty("user.dir") + "\\Datasets";
        return switch (this) {
            case SCADA_rand -> Path.of(directory, "\\SCADA_rand.txt");
            case DER_rand -> Path.of(directory, "\\DER_rand.txt");
            case e_commerce_rand -> Path.of(directory, "\\e_commerce_rand.txt");
            case VOIP_rand -> Path.of(directory, "\\VOiP_rand.txt");
        };
    }
}
