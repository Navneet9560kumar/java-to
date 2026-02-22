package Heaps.Revesionheap;

import java.util.PriorityQueue;

public class kthlargestelement_02 {
           public static int findKthLargest(int[] nums, int k){
            int n = nums.length;
            PriorityQueue<Integer>pq = new PriorityQueue<>();
            for(int ele: nums){
                  pq.add(ele);
                  if(pq.size()>k){
                        pq.remove();
                  }
            }
            return pq.peek();

           }
      public static void main(String[] args) {
            int[]arr = {3,2,1,5,6,4};
      }
}


// if largeset ,farwaste,bigeseted, most, higleste