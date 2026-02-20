package revesion.Cycledection;
import java.util.*;

public class cycleDEctioninDfs_02 {

      static boolean ans;

      public boolean canFinish(int m, int[][] pre) {
        ans =true;
        int n = pre.length;
        List<List<Integer>>adj= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int a =pre[i][0], b=pre[i][1];
            adj.get(b).add(a);
        }
        boolean[]vis = new boolean[n];
        boolean[]path = new boolean[n];
          for(int i=0;i<n;i++){
            if(vis[i]==false)dfs(i, adj, vis, path);
          }
            return ans;

    }

    public static void dfs(int i,  List<List<Integer>>adj,boolean[]vis,boolean[]path){
      vis[i]=true;
      path[i]=true;
      for(int ele: adj.get(i)){
            if(path[ele]==true){
                  ans = false;
                  return;
            }
           if(vis[ele]==false) dfs(ele,adj,vis,path);
      }
      path[i]= false;
    }
      public static void main(String[] args) {
            
      }
}
