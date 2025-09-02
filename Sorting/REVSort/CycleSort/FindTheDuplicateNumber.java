package Sorting.REVSort.CycleSort;

public class FindTheDuplicateNumber {

      public static void swap(int i, int j, int[]nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
      }

        public static int findDuplicate(int[] nums){
           while (true) {
            int ele = nums[0];
            if(nums[ele]==ele) return ele;
            swap(0,ele,nums);
           }
        }
      public static void main(String[] args) {
            
      }
}
