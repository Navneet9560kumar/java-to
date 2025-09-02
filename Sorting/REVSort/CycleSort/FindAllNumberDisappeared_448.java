package Sorting.REVSort.CycleSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumberDisappeared_448 {

       public static void swap(int i, int j, int[]nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
      }

      
    public List<Integer> findDisappearedNumbers(int[] nums) {
           int n = nums.length;
           int i=0;
           while (i<n) {
             int ele = nums[i];
            if(nums[i]==i+1 || ele==nums[ele-1]) i++;
            else swap(i,ele-1, nums);
           }
            List<Integer> res = new ArrayList<>();
           for (int j= 0; j< nums.length; j++) {
               if(nums[j]!=j+1) res.add(j+1);
           }
           return res;
    }
      public static void main(String[] args) {
            
      }
}
