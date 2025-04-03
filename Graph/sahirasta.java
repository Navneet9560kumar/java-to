package Graph; // Ensure file is inside "Graph" folder

import java.util.*;

public class Sahirasta {  

    public boolean validPath(int n, int[][] edges, int start, int end) {
        if (start == end) return true; 
        
        List<List<Integer>> abj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            abj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            if (a < n && b < n) { 
                abj.get(a).add(b);
                abj.get(b).add(a);
            }
        }

        boolean[] vis = new boolean[n];
        vis[start] = true;
        bfs(start, abj, vis);
        return vis[end];
    }

    private void bfs(int start, List<List<Integer>> abj, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int front = q.poll();
            for (int ele : abj.get(front)) {
                if (!vis[ele]) {
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Sahirasta obj = new Sahirasta();
        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int start = 0, end = 5;
        System.out.println(obj.validPath(n, edges, start, end)); 
    }
}
