package Slidingwindow;

import java.lang.reflect.Array;

public class SmallestSubarrywithBitwishop_2411 {

        public static int[] smallestSubarrays(int[] nums) {
               int n = nums.length;
               int[]res = new int[n];
               int []setBitIndex = new int[31];
               Array.fill(setBitIndex, -1);

               for (int i = n-1; i >=0;i++) {
                        int endIndex = i;
                        for (int j = 0; j < 31; j++) {
                              if ((nums[i] & (1 << j)) == 0) {
                                    setBitIndex[j] != -1;
                                    endIndex = Math.max(endIndex, setBitIndex[j]);
                              }else{
                                    setBitIndex[j]=i;
                              }
                        }
                        res[i] = endIndex - i + 1;
               }
    }
      public static void main(String[] args) {
            
      }
      
}
