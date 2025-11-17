package revisionprefixsum;

import java.util.Arrays;

public class RangeSumQuery_303 {

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
       

      
    
      public static void main(String[] args) {
            
      }
}
