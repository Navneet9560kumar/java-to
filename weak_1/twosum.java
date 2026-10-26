package weak_1;

import java.util.*;

public class twosum {

      public static int []towSum(int []nums, int target){
            int n = nums.length;
            int i=0;
            int j= n-1;
            

            while(i<j){
                  int sum = nums[i] +nums[j];
                  if(sum==target){
                     return new int[]{i+1,j+1};  
                  }else if(sum<target){
                        i++;
                  }else{
                        j--;

                  }
            }
            return new int[]{-1,-1};
      }

public static boolean HashMapTwosum(int[]nums, int target){
      int n = nums.length;
      HashMap<Integer,Integer>st = new HashMap<>();
      for(int ele: nums){
            int rem = target-ele;
            if(st.containsKey(rem)){
                  return true;
            }
            st.put(ele,1);
      }
      return false;
}
      public static void main(String[]args){

      } 

}
