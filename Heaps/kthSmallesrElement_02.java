package Heaps;
import java.util.*;
public class kthSmallesrElement_02 {
      
      public static void main(String[] args) {
            int []arr  ={10,2,8,3,-6,-2,9,-12};
            int k=6;
            //min heap
            // PriorityQueue<Integer> pq = new PriorityQueue<>();
            //max heap
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele : arr){
                  pq.add(ele);
                  if(pq.size()>k){
                        pq.remove();
                  }
            }
            
            System.out.println(pq.peek());
      }
}
