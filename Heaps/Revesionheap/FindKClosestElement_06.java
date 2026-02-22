package Heaps.Revesionheap;

import java.util.*;

public class FindKClosestElement_06 {

    public static class Pair implements Comparable<Pair> {
        int ele;
        int diff;

        Pair(int ele, int diff) {
            this.ele = ele;
            this.diff = diff;
        }

        @Override
        public int compareTo(Pair p) {
            if (this.diff == p.diff) {
                return this.ele - p.ele;
            }
            return this.diff - p.diff;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele : arr) {
            int diff = Math.abs(x - ele);
            pq.add(new Pair(ele, diff));

            if (pq.size() > k)
                pq.poll();
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            ans.add(p.ele);
        }

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

    }
}