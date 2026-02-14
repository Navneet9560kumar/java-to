package revesionssss.dfs;

import java.util.*;

public class FindifpathExitsinGraph_04 {

    public static boolean validPath(int n, int[][] edges, int start, int end) {

        if (start == end) return true;

        boolean[] vis = new boolean[n];

        List<List<Integer>> adj = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int[] ele : edges) {
            int a = ele[0];
            int b = ele[1];

            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        return dfs(start, end, adj, vis);
    }

    public static boolean dfs(int node, int end, List<List<Integer>> adj, boolean[] vis) {

        if (node == end) return true;

        vis[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                if (dfs(neighbor, end, adj, vis))
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        System.out.println(validPath(n, edges, 0, 2));
    }
}
