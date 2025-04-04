// cycle detection in a Undirected  graph using DFS

import java.util.ArrayList;
import java.util.List;

public class DFSNumberland {
       public static boolean hasCycle(List<List<Integer>> adj, boolean[] vis, int node, int parent) {
        vis[node] = true; // Mark the node as visited

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                if (hasCycle(adj, vis, neighbor, node)) {
                    return true; // Cycle detected
                }
            } else if (neighbor != parent) {
                return true; // If visited and not parent, cycle found
            }
        }
        return false;
    }

    public static boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (hasCycle(adj, vis, i, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Creating an undirected graph
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);
        // Creating a cycle
        adj.get(4).add(1);
        adj.get(1).add(4);

        if (isCycle(V, adj)) {
            System.out.println("Cycle detected in Undirected Graph");
        } else {
            System.out.println("No cycle in Undirected Graph");
        }
    }

}
