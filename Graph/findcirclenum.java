package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class findcirclenum {

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
            vis[i] = true;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            while (!q.isEmpty()) {
                  int front = q.remove();
                  for (int j = 0; j < adj.length; j++) {
                        if (adj[front][j] == 1 && !vis[j]) {
                              q.add(j);
                              vis[j] = true;
                        }
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
