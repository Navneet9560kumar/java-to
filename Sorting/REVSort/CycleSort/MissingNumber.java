package Sorting.REVSort.CycleSort;

public class MissingNumber {

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int findMissing(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[i] != nums[correctIndex]) {
                swap(i, correctIndex, nums);
            } else {
                i++;
            }
        }

        // Check missing number
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // If all present, then missing number is n+1
        return n + 1;
    }

    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        int[] nums = {3, 4, -1, 1};
        System.out.println(obj.findMissing(nums)); // Output: 2
    }
}
