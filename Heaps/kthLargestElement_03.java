package Heaps;

import java.util.*;

public class kthLargestElement_03 {
        public int findKthLargest(int[] nums, int k){
 PriorityQueue<Integer>q=new PriorityQueue<>();
 for(int ele:nums){
      q.add(ele);
      if(q.size()>k){
           q.remove();
 }
 
}
 return q.peek();
        }
        public static void main(String[] args) {
            int[] nums = {3, 2, 1, 5, 6, 4};
            int k = 2;
            kthLargestElement_03 obj = new kthLargestElement_03();
            System.out.println(obj.findKthLargest(nums, k));
        }
}
