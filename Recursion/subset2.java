import java.util.*;

public class subset2 {

    static List<List<Integer>> arr;

    public static void helper(int i, int[] nums, List<Integer> ans) {
        if (i == nums.length) {
            arr.add(new ArrayList<>(ans)); // Add a copy of ans to arr
            return;
        }
        // Not take
        helper(i + 1, nums, ans);
        // Take
        ans.add(nums[i]);
        helper(i + 1, nums, ans);
        ans.remove(ans.size() - 1); // Backtrack
    }

    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, nums, ans);
        return arr;
    }

    public static void main(String[] args) {
        subset2 obj = new subset2();
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = obj.subsets(nums);
        System.out.println(result);
    }
}
