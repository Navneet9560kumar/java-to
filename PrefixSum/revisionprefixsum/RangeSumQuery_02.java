 package revisionprefixsum;

import java.util.Arrays;

public class RangeSumQuery_02 {

// static int[]arr;
//       public static void NumArray(int[]nums){
//             arr = nums;
//       }

//       public int sumRange(int left, int right) {
//         int sum =0;
//         for (int i = left; i <= right; i++) {
//             sum  += arr[i];

//         }
//         return sum;

      
//     }


static int[]arr;
      public static void NumArray(int[]nums){
            arr = Arrays.copyOf(nums, nums.length);
            for (int i = 1; i < nums.length; i++) {
                  arr[i] += arr[i-1];
            }
      }

      public int sumRange(int left, int right) {
            if(left ==0){
                  return arr[right];
                
            }
       return arr[right] -arr[left-1];

        }
       
//    public long[] findPrefixScore(int[] nums) {
//         int n= nums.length;
//        long[] ans = new long[n];
        
//        long maxSoFar = 0;
//     long runningScore = 0;
//          for (int i = 0; i < n; i++) {
//         maxSoFar = Math.max(maxSoFar, nums[i]);
//         long conversion = nums[i] + maxSoFar;
//         runningScore += conversion;
//         ans[i] = runningScore;
//     }

//     return ans;
//       }
      
    
      public static void main(String[] args) {
            
      }
}
