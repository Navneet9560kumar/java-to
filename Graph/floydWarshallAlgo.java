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
        int[][] dis = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dis[i][j] = Integer.MAX_VALUE;
            //     for (int i = 0; i < edges.length; i++) {
            //       int u = edges[i][0];
            //       int v = edges[i][1];
            //       int wt= edges[i][2];
            //       dis[u][v] = wt;
            //       dis[v][u] = wt;
                  
            //     } isko bhi rah sakte hai ham ok per ek way karne ka kaam 

            for(int []arr: edges){
                int u = arr[0];
                int v = arr[1];
                int wt = arr[2];
                dis[u][v] = wt;
                dis[v][u] = wt;
                
            }
            // floyd warshall algo
            for(int k=0;k<n;k++){// through all the nodes 
                  for (int i = 0; i < n; i++) {
                  for(int j=0;j<n;j++)
                  if( j==k){
                        if(dis[i][k] != Integer.MAX_VALUE && dis[k][j] != Integer.MAX_VALUE){
                              dis[i][j] = Math.min(dis[i][j],dis[i][k]+dis[k][j]);
                          }
                        
                  }
                        

                  }
            }
        }
}
      public static void main(String[] args) {
            
      }
}
