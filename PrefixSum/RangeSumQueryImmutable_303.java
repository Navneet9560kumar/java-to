package PrefixSum;

import java.util.Arrays;

public class RangeSumQueryImmutable_303 {

             static int[]arr ; // ye hoti hia shalo copy hoti hai 

          public static void NumArray(int[] nums) { // Constructor
            arr = Arrays.copyOf(nums, nums.length);
            for (int i = 0; i < nums.length; i++) {
                  arr[i] += arr[i-1];
            }
        
    }
    
    public int sumRange(int left, int right) {
      if(left ==0) return arr[right];
       return arr[right] - arr[left -1];
    }
      public static void main(String[] args) {
            
      }
}


//  two type of sumission in the code dekho leetcode 303