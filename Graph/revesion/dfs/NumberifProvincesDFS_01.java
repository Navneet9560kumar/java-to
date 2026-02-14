package revesionssss.dfs;

import java.util.*;

public class NumberifProvincesDFS_01 {

      public void dfs(int i, boolean[]vis,int[][]adj){
            int n = adj.length;
            vis[i] = true;
                  for(int j =0;j<n;j++){
                        if(adj[i][j] == 1 && vis[j]==false){
                             dfs(j,vis,adj);
                        }
                  }
                 
            


      }

       public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count =0;
        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited,adj);
                count++;
            }
        }
        return count;
    }
      public static void main(String[] args) {
            
      }
}
