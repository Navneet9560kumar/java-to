package RrvisionArrya;

public class Twosum {
         public static int[] twoSum(int[] nums, int target){
            int[]arr = new int[2];
            for (int i = 0; i < nums.length; i++) {
                 for (int j = i+1; j < nums.length; j++) {
                  if(nums[i]+nums[j]==target){
                        arr[0]=i;arr[1]=j;
                       break;
                        
                  }
                 } 
            }
            return null; // If no solution is found
         } 
      public static void main(String[] args) {
            int[] nums = {2, 7, 11, 15};
            int target = 9; 

            Twosum ts = new Twosum();
            int[] result = ts.twoSum(nums, target);

            if (result != null) {
                System.out.println("Indices found: " + result[0] + ", " + result[1]);
            } else {
                System.out.println("No two sum solution found.");
            }
      }
}
