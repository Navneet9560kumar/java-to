package Heaps;

import java.util.*;

public class BasicHeapCF {
      public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(2);
            System.out.println(pq);
            pq.add(3);
            System.out.println(pq);
            pq.add(3);
            System.out.println(pq);
            pq.remove();
            System.out.println(pq);
            pq.add(0);
            System.out.println(pq);
      }
}
