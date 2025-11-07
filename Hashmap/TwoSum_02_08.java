package Hashmap;

import java.util.*;

public class TwoSum_02_08 {
      public static int[] twoSum(int[] nums, int target) {
            int[] ans = { -1, -1 };
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                  int rem = target - nums[i];
                  if (map.containsKey(rem)) {
                        int j = map.get(rem);
                        ans[0] = i;
                        ans[1] = map.get(rem);
                        break;
                  }
            }
            return ans;
      }

      public static void main(String[] args) {
            int[] nums = { 2, 7, 11, 15 };
            int target = 9;
            int[] result = twoSum(nums, target);
            if (result != null) {
                  System.out.println("Indices: " + result[0] + ", " + result[1]);
            } else {
                  System.out.println("No two sum solution found.");
            }
      }
}
