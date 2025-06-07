import java.util.Arrays;

public class Proprimes {

      private static final int INF = Integer.MAX_VALUE;

      public static void primMST(int[][]graph){
            int v = graph.length;
            int[]key = new int[v];
            boolean[] mstSet = new boolean[v];
            int[]parent = new int[v];

            Arrays.fill(key, INF);
            key[0] =0;
            parent[0] = -1;

            for(int count =0;count<v-1;count++){
                   int u = minKey(key, mstSet, v);
                        mstSet[u] = true;

                        // for update  key and parent index of adjcent verticle
                        for (int V = 0; V < v; V++) {
                              if(graph[u][V] != 0 && !mstSet[V] && graph[u][V] < key[V]) {
                                    parent[V] = u;
                                    key[V] = graph[u][V];
                              }
                        }

            }
                // Print the constructed MST
        printMST(parent, graph);
      }


      private static int minKey(int[] key, boolean[] mstSet, int V) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < V; v++) {
            if (!mstSet[v] && key[v] < min) {
                min = key[v];
                minIndex = v;
            }
        }
        return minIndex;
    }  private static void printMST(int[] parent, int[][] graph) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < graph.length; i++)
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]);
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        primMST(graph);
    }
}