package Revison;

import java.util.*;

public class LeetCodeSubset {
       static List<List<Integer>>arr;
      public static void helper(int i, int[] nums, ArrayList<Integer> ans){
            if(i==nums.length){
                  arr.add(ans);
                  return;
            }
            helper(i+1, nums, ans);
            ans.add(nums[i]);
            helper(i+1, nums, ans);
      }



       public static List<List<Integer>> subsets(int[] nums){
           arr=   new ArrayList<>();
            ArrayList<Integer>ans = new ArrayList<>();
           helper(0,nums,ans);
           return arr;
       }
      public static void main(String[] args) {
            
      }
}
