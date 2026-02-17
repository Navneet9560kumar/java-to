import java.util.*;

public class TwoSumUnique {

    public static List<List<Integer>> twoSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(arr);   // Important for two-pointer
        
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
 
            int sum = arr[left] + arr[right];

            if (sum == target) {

                result.add(Arrays.asList(arr[left], arr[right]));

                left++;
                right--;

                // Skip duplicates from left
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }

                // Skip duplicates from right
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int target = 4;

        List<List<Integer>> ans = twoSum(arr, target);
        System.out.println(ans);
    }
}
