package Hashmap.RevesionHashmap.HeaporQue;

import java.util.Collections;
import java.util.*;

public class Klargestelemnt_02 {

      
      public static void main(String[] args) {
             int []arr = {10,2,8,3,-6,-2,9,-12};
            int k =5;
            // minheap 
            PriorityQueue<Integer>pq = new PriorityQu eue<>();
            for(int ele: arr){
                  pq.add(ele);
                  if(pq.size()>k){
                        pq.remove();
                  }
            }
            System.out.println(pq.peek());
      }
}
