public class SplitArray {

      public static int waysToSplitArray(int[] nums) {
          int n = nums.length;
          
          // Calculate the total sum of the array
          int totalSum = 0;
          for (int num : nums) {
              totalSum += num;
          }
  
          // Initialize variables to track left sum and count of valid splits
          int leftSum = 0;
          int count = 0;
  
          // Loop through the array to check each potential split point
          for (int i = 0; i < n - 1; i++) {  // We need at least one element in both parts
              leftSum += nums[i];
              int rightSum = totalSum - leftSum;
              
              if (leftSum >= rightSum) {
                  count++;
              }
          }
          
          return count;  // Return the total number of valid splits
      }
  
      public static void main(String[] args) {
          // Sample input for the method
          int[] nums = {10,4,-8,7};  // Example array
  
          int result = waysToSplitArray(nums);
          System.out.println("Number of ways to split the array: " + result);
      }
  }
  