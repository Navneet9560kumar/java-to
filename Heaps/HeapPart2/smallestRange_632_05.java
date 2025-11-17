package Heaps.HeapPart2;

import java.util.List;
import java.util.PriorityQueue;

import Heaps.KClosestPointtoOrigin_973_06.Triplet;

public class smallestRange_632_05 {


      public class Triplet{
            int ele;
            int row;
            int col;
            Triplet(int ele, int row, int col){
                this.ele = ele;
                this.row = row;
                this.col = col;
            }
      }

       public int[] smallestRange(List<List<Integer>> nums) {
        int[] ans  {0, Integer.MAX_VALUE};
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int  k = nums.size();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(max, ele);

        }

        while (true) {
            Triplet rem = pq.poll();
            int min = rem.ele;
            if (max - min < ans[1] - ans[0]) {
                ans[0] = min;
                ans[1] = max;
            }

            if (rem.col + 1 < nums.get(rem.row).size()) {
                int ele = nums.get(rem.row).get(rem.col + 1);
                pq.add(new Triplet(ele, rem.row, rem.col + 1));
                if (ele > max) {
                    max = ele;
                }
            } else {
                break;
            }     
        }
        return ans;
    }
       
      public static void main(String[] args) {
            
      }

}
