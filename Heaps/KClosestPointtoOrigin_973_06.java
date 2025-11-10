package Heaps;

import java.util.*;

public class KClosestPointtoOrigin_973_06 {

    public static class Triplet {
        int x, y, d;
        Triplet(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
        public int compareTo(Triplet t){
            return this.d - t.d;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        // maxheap
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0], y = points[i][1];
            int d = x * x + y * y;
            pq.add(new Triplet(x, y, d));
            if (pq.size() > k) pq.remove();
        }

        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            Triplet t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
    }

    public static void main(String[] args) {
        KClosestPointtoOrigin_973_06 obj = new KClosestPointtoOrigin_973_06();
        int[][] points = {{1,3},{-2,2}};
        int[][] res = obj.kClosest(points, 1);

        for (int[] p : res) {
            System.out.println(Arrays.toString(p));
        }
        
    }
}
