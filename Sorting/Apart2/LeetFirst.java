package Sorting.Apart2;

public class LeetFirst {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        boolean[] b = new boolean[n + 1];
        // Mark the presence of each number in the boolean array
        for (int ele : nums) {
            b[ele] = true;
        }
        // Find the missing number
        for (int i = 0; i <= n; i++) {
            if (!b[i]) {
                return i; // Return the missing number
            }
        }
        return -1; // This should never be reached
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1}; // Example input
        int missing = missingNumber(nums);
        System.out.println("The missing number is: " + missing);
    }
}
