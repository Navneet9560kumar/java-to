import java.util.ArrayList;
import java.util.List;

public class DFSDirected {
    public static boolean hasCycle(List<List<Integer>> adj, boolean[] vis, boolean[] recStack, int node) {
        vis[node] = true;
        recStack[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                if (hasCycle(adj, vis, recStack, neighbor)) {
                    return true;
                }
            } else if (recStack[neighbor]) {
                return true; // If in recursion stack, cycle found
            }
        }

        recStack[node] = false; // Backtrack
        return false;
    }

    public static boolean isCycle(int V, List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (hasCycle(adj, vis, recStack, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>(); // ✅ Fixed line

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Creating a directed graph with a cycle
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // Cycle here

        if (isCycle(V, adj)) {
            System.out.println("Cycle detected in Directed Graph");
        } else {
            System.out.println("No cycle in Directed Graph");
        }
    }
}
