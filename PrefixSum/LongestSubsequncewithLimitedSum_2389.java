package PrefixSum;

import java.util.*;

public class LongestSubsequncewithLimitedSum_2389 {
      



        public int[] answerQueries(int[] arr, int[] queries) {
            Arrays.sort(arr);
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  arr[i]  += arr[i-1];
            }

            int[]ans = new int[queries.length];
            for (int i = 0; i < ans.length; i++) {
                  int lo=0, hi =n-1;
                  while (lo<=hi) {
                       int mid = lo + (hi- lo)/2;
                       if(arr[mid]>queries[i]) hi = mid -1;
                       else{
                        queries[i] = Math.max(ans[i],mid+1);
                        lo = mid +1;
                       } 
                  }
            }
            return ans;

            
    }
      public static void main(String[] args) {
            
      }
}
