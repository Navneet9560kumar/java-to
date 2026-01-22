package prefixsumsssss;

import java.util.Arrays;

public class RangesumQuery_02 {

    static int[] arr;

    // Constructor
    public RangesumQuery_02(int[] nums) {
        arr = Arrays.copyOf(nums, nums.length);
    }

    public static int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        RangesumQuery_02 obj = new RangesumQuery_02(nums);

        System.out.println(obj.sumRange(1, 3)); // 2+3+4 = 9
    }
}
