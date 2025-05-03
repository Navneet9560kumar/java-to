import java.util.ArrayList;
import java.util.List; 

public class graphmodul5lacOne {

   class Pair {
            int node;
            int cost;
            
            Pair(int node, int cost) {
                  this.node = node;
                  this.cost = cost;
            }

      public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            List<List<Pair>> adj = new ArrayList<>();
            for(int i=0;i<n;i++){
                  adj.add(new ArrayList<>());
            }
            for(int i=0;i<flights.length;i++){
                  int from = flights[i][0], to = flights[i][1], price = flights[i][2];
                  adj.get(from).add(new Pair(to, price));
            }
      }
      public static void main(String[] args) {
            
      }
}
}
