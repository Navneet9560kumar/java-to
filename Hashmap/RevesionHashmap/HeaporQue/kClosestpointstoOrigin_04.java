package Hashmap.RevesionHashmap.HeaporQue;

import java.util.*;


public class kClosestpointstoOrigin_04 {


      public class pair{
            int x ;
            int y;
            pair(int x, int y){
                  this.x = x;
                  this.y = y;
            }
      }



      public int [][] kClosestes(int[][]points, int k){
            PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
            HashMap<Integer, pair>map = new HashMap<>();
            for(int i=0;i<points.length;i++){
                  int x = points[i][0], y = points[i][1];
                  int d2 = x*x + y*y;
                  pq.add(d2);
                  map.put(d2, new pair(x,y));
                  if(pq.size()>k){
                        int removed = pq.remove();
                        map.remove(removed);
                  }
            }
            int [][]ans = new int[k][2];
            for(int i=0;i<k;i++){ {
                  int dist = pq.remove();
                  pair p = map.get(dist);
                  ans[i][0] = p.x;
                  ans[i][1] = p.y;
            }
      }
            return ans;
      }
      public static void main(String[] args) {
            
      }
}
