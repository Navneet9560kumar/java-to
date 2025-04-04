
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class DFSgrPh {


      
      public static int findCircleNum(int[][] adj) {
            int n = adj.length;
            int count = 0;
            boolean[] vis = new boolean[n]; // har node ke leye vissbile hai ke nahi hai vo is leye ban rahe hai ham
            for (int i = 0; i < adj.length; i++) {
                  if (!vis[i]) {
                        dfs(adj, vis, i);
                        count++;
                  }
            }
            return count;
      }

      private static void dfs(int[][] adj, boolean[] vis, int i) {
            int n = adj.length;
            int count =0;
            vis[i] = true;
       for (int j = 0; j < n; j++) {
                  if (adj[i][j] == 1 && !vis[j]) {
                        dfs(adj, vis, j); 
                  }
            }
           
      }

       

      public static void main(String[] args) {
            // Example adjacency matrix
            int[][] adj = {
                  {1, 1, 0},
                  {1, 1, 0},
                  {0, 0, 1}
            };

            int result = findCircleNum(adj);
            System.out.println("Number of connected components: " + result);
      }
}
