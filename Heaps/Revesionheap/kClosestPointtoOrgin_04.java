package Heaps.Revesionheap;

import java.util.*;
public class kClosestPointtoOrgin_04 {
public class pair implements Comparable<pair> {
    int d;
    int x;
    int y;

    pair(int x, int y, int d){
        this.d=d;
        this.x = x;
        this.y = y;
    }
    public int compareTo(pair t){
        return this.d-t.d;
    }
}



       public int[][] kClosest(int[][] arr, int k){
             PriorityQueue<pair> pq= new PriorityQueue<>(Collections.reverseOrder());
             

             for(int i=0;i<arr.length;i++){
                  int x =arr[i][0], y =arr[i][1];
                  int d = x*x + y*y;
                  pq.add(new pair(d,x,y));
                  if(pq.size()>k)pq.remove();
             }
             int[][]ans = new int[k][2];
            for (int i = 0; i <k; i++) {
                  pair t = pq.remove();
                
                  ans[i][0] = t.x;
                  ans[i][1] = t.y;
            }
            return ans;

       }
      public static void main(String[] args) {
            
      }
}

// customCompater ka ka logi    
