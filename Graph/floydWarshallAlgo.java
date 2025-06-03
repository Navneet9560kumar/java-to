import java.util.Arrays;

public class floydWarshallAlgo {




//       public int findTheCity(int n, int[][] edges, int distanceThreshold) {
//      int[][] distance = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             Arrays.fill(distance[i], Integer.MAX_VALUE);
//             distance[i][i] = 0;  // distance to itself is 0
//         }

//         // The distance between nodes which are connected temporary distance between them
//         for (int[] edge : edges) {
//             int node1 = edge[0], node2 = edge[1], dist = edge[2];
//             distance[node1][node2] = dist;
//             distance[node2][node1] = dist;
//         }

//         for (int midle = 0; midle < n; midle++) {
//             for (int source = 0; source < n; source++) {
//                 for (int destination = 0; destination < n; destination++) {
//                     if (distance[source][midle] < Integer.MAX_VALUE && distance[midle][destination] < Integer.MAX_VALUE) {
//                         distance[source][destination] = Math.min(
//                             distance[source][destination], distance[source][midle] + distance[midle][destination]
//                         );  // the minimum distance is either current value or new value with path that goes through midle
//                     }
//                 }
//             }
//         }

//         int minimum_number = n;
//         int res = -1;

//         for (int source = 0; source < n; source++) {
//             int source_count = 0;
//             for (int destination = 0; destination < n; destination++) {
//                 if (distance[source][destination] <= distanceThreshold) {
//                     source_count++;
//                 }
//             }

//             if (source_count <= minimum_number) {  // as in dijkstra when number equal we choose greater node
//                 minimum_number = source_count;
//                 res = source;
//             }
//         }

//         return res;
//     }



public int findTheCity(int n, int[][] edges, int Threshold) {
      int[][] dis = new int[n][n];
      
      // Step 1: Initialize the distance matrix
      for (int i = 0; i < n; i++) {
          Arrays.fill(dis[i], Integer.MAX_VALUE);
          dis[i][i] = 0; // distance to self is 0
      }

      // Step 2: Fill initial direct edge distances
      for (int[] arr : edges) {
          int u = arr[0];
          int v = arr[1];
          int wt = arr[2];
          dis[u][v] = wt;
          dis[v][u] = wt;
      }

      // Step 3: Apply Floyd Warshall Algorithm
      for (int k = 0; k < n; k++) { // intermediate
          for (int i = 0; i < n; i++) { // source
              for (int j = 0; j < n; j++) { // destination
                  if (dis[i][k] != Integer.MAX_VALUE && dis[k][j] != Integer.MAX_VALUE) {
                      dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
                  }
              }
          }
      }

      // Step 4: Find the city with minimum reachable cities
      int minCity = -1;
      int minCount = n;

      for (int i = 0; i < n; i++) {
          int count = 0;
          for (int j = 0; j < n; j++) {
              if (i != j && dis[i][j] <= Threshold) {
                  count++;
              }
          }
          if (count <= minCount) {
              minCount = count;
              minCity = i;
          }
      }

      return minCity;
  }

  public static void main(String[] args) {
      floydWarshallAlgo obj = new floydWarshallAlgo();
      
      int n = 4;
      int[][] edges = {
          {0, 1, 3},
          {1, 2, 1},
          {1, 3, 4},
          {2, 3, 1}
      };
      int threshold = 4;
      
      System.out.println(obj.findTheCity(n, edges, threshold)); // Output will be correct now
  }
}