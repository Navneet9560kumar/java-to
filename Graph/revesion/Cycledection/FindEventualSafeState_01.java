package revesion.Cycledection;

import java.util.*;

public class FindEventualSafeState_01 {

        public List<Integer> eventualSafeNodes(int[][] arr){
                  int n = arr.length;
                  List<List<Integer>> adj = new ArrayList<>();
                  for (int i = 0; i < n; i++)adj.add(new ArrayList<>());
                     int []indeger = new int[n];
                  for (int i = 0; i <n; i++) {
                     
                       for(int ele: arr[i]){
                        // in orginal graph , edge is from i -> ele
                        // in reverse graph , it will  be ele -> i
                        adj.get(ele).add(i);
                        indeger[i]++;
                       } 
                  }
                  // apply khana algo 

                  Queue<Integer> q = new LinkedList<>();
                  List<Integer> ans = new ArrayList<>();
                  for(int i=0;i<n;i++){
                        if(indeger[i]==0)q.add(i);
                  }
                  while (q.size()>0) {
                        int front = q.remove();
                        ans.add(front);
                        for(int ele: adj.get(front)){
                              indeger[ele]--;
                              if(indeger[ele]==0) q.add(ele);
                        }
                  }
                 return ans;
                  }

        
      public static void main(String[] args) {
            
      }
}
