import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class leetcodeseveneightseven {
   public static class Pair {
        int node, cost;
        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    public static class Triplet implements Comparable<Triplet> {
        int node, cost, stops;
        Triplet(int node, int cost, int stops) {
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }

        @Override
        public int compareTo(Triplet other) {
            if (this.cost == other.cost) {
                return Integer.compare(this.stops, other.stops);
            }
            return Integer.compare(this.cost, other.cost);
        }
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < flights.length; i++) {
            int from = flights[i][0], to = flights[i][1], price = flights[i][2];
            adj.get(from).add(new Pair(to, price));
        }
        
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(src, 0, 0));  // <- fix here

        while (pq.size() > 0) {
            Triplet top = pq.poll();
            int node = top.node, cost = top.cost, stops = top.stops;
            if (node == dst) return cost;
            if (stops == k + 1) continue;
            for (Pair p : adj.get(node)) {
                int totalCost = cost + p.cost;
                if (totalCost < ans[p.node]) {
                    ans[p.node] = totalCost;
                    pq.add(new Triplet(p.node, totalCost, stops + 1));
                }
            }
        }
        return ans[dst] == Integer.MAX_VALUE ? -1 : ans[dst];
    } 


    public static void main(String[] args) {
        System.out.println("hii baby");
    }
}
