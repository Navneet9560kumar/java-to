package Greedy;

import java.util.Arrays;

public class maxSumarry {
        public int largestSumAfterKNegations(int[] nums, int k){
            Arrays.sort(nums);
            int i=0;
            while (i<nums.length && nums[i]<0 && k>0) {
                  nums[i] *= -1;
                  i++;
                  k--;
            }
            int sum =0;
            for(int s : nums){
                  sum += s;
            }
            return sum;
        }
      public static void main(String[] args) {
            
      }
}
