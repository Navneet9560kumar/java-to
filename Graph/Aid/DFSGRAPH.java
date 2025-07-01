package Aid;

import java.util.*;

public class DFSGRAPH {






      private static Map<Integer, List<Integer>> adjList = new HashMap<>();
      
    // Add edge (undirected)
    public static void addEbge(int u, int v){
            adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
             adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(v);
    }
    // dfs function
    public static void dfs(int start, Set<Integer> visited) {
        visited.add(start);
        System.out.print(start + " ");
        
        for (int neighbor : adjList.getOrDefault(start, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
      }
      public static void main(String[] args) {
          addEbge(1, 2);
          addEbge(1, 3);
          addEbge(2, 4);
          addEbge(2, 5);
          addEbge(3, 6);
          addEbge(3, 7);

          Set<Integer> visited = new HashSet<>();
          System.out.println("DFS Traversal:");
          dfs(1, visited);
      }

}
