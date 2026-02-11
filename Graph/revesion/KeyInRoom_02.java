package revesion;

import java.util.*;
import java.util.Queue;

public class KeyInRoom_02 {


      public static void bfs(int i, boolean[]vis,List<List<Integer>> adj){
           Queue<Integer> q = new LinkedList<>();
             q.add(i);
             while (q.size()>0) {
                  int fornt = q.remove();
                  for(int ele: adj.get(fornt)){
                        if(vis[ele]==false){
                              q.add(ele);
                              vis[ele] = true;
                         
                        }
                  }
             }
            }

        public static boolean canVisitAllRooms(List<List<Integer>> adj){
             int n = adj.size();
                  boolean[] vis = new boolean[n];
                  vis[0] = true;
                  bfs(0,vis,adj);
                  for (int i = 0; i < n; i++) {
                        if(vis[i]==false){
                              return false;
                        }
                  }
                  return true;
        }
      public static void main(String[] args) {
            
      }
}
