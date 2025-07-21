package Backtracking.PW;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> perm(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, List<Integer> perm, int[] nums, boolean[] used) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            perm.add(nums[i]);
            backtrack(res, perm, nums, used);
            perm.remove(perm.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = perm(nums);
        System.out.println(result);
    }
}
