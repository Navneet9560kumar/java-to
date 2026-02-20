package Patterns.TowPointer;

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

       public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>>res = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n-2; i++) {
            //skip duplicate
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right =n-1;

            while (left<right) {
                int sum = nums[i] + nums[left]+ nums[right];

                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    // skip duplicate left
                    while (left<right && nums[left]==nums[left-1]) {
                        left++;
                    }
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            
        }
        return res;
       }

    
    public static void main(String[] args) {
       int[] arr = {-1, 0, 1, 2, -1, -4};
        int target = 4;

        List<List<Integer>> ans = threeSum(arr);
    for(List<Integer>triplet:ans){
        System.out.println(triplet);
    }

    }
}
