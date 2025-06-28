package Aid;

public class implementGraphs {

    public static class GraphMatrix {
        private int[][] adjMatrix;
        private int numVertices;
        //The first numVertices is the number of rows.
            //The second numVertices is the number of columns.

        public GraphMatrix(int numVertices) {
            this.numVertices = numVertices;
            adjMatrix = new int[numVertices][numVertices];
        }

        // Add edge
        public void addEdge(int i, int j) {
            adjMatrix[i][j] = 1;
            adjMatrix[j][i] = 1; // Remove this line for a directed graph
        }

        // Remove edge
        public void removeEdge(int i, int j) {
            adjMatrix[i][j] = 0;
            adjMatrix[j][i] = 0;
        }

        // Print matrix
        public void printMatrix() {
            System.out.println("Adjacency Matrix:");
            for (int[] row : adjMatrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printMatrix();
    }
}
