package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

public class TwoSum_04 {

       public int[] twoSum(int[] nums, int target){
        
            int []ans  = {-1,-1};
              HashMap<Integer, Integer> map = new HashMap<>();
              for (int i = 0; i < nums.length; i++) {
                  int rem  = target -nums[i];
                  if(map.containsKey(rem)){
                  ans[0] =i;
                  ans[1]= map.get(rem);
                  break;
                  }else map.put(nums[i],i);
              }
              return ans;
            
       }
      public static void main(String[] args) {
            
      }
}
