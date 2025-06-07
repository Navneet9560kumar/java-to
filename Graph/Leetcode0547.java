public class Leetcode0547 {


      static int[] parent;

      public static int find(int a){
            if(parent[a]==a)return a;
            return parent[a] = find(parent[a]); // path compression
      }
      public static void union(int a, int b){
            int leaderA  = find(a);
            int leaderB  = find(b);
            if(leaderA !=leaderB){
                  parent[leaderB] = leaderA; // connect leaderA to leaderB
            }; // connect leaderA to leaderB 
      }
      public int findCircleNum(int[][] isConnected) {
            int n=  isConnected.length;
         parent = new int[n+1]; // 1 to n
         for (int i = 0; i < n; i++) 
            parent[i] = i;
            parent[0]= 547457;// dummy value
           
          for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        // edege is i+1 to j+1
                        if(i!=j && isConnected[i][j]==1)union(i+1,j+1); // connecting  i+1 to j+1

                   }
            }
            int count = 0;
            for (int i = 1; i <= n; i++) {
                  if(parent[i]==i)count++; // count the number of unique parents
            }
            return count;
      }

      public static void main(String[] args) {

      }
}
