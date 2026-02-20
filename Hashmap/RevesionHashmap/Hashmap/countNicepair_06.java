package Hashmap.RevesionHashmap.Hashmap;

import java.util.HashMap;

public class countNicepair_06 {

      public static int  countNicePairs(int[]nums){
            int n = nums.length;
            int count = 0;
            for (int i = 0; i < n-1; i++) {
                  for(int j=i+1;j<n;j++){
                        if(nums[i]+rev(nums[j])==nums[j]+rev(nums[i]))count++;
                  }
            }
            return count;
            
      }

      public static int  countNicePairss(int[]nums){
            int n = nums.length;
            int count = 0;
            HashMap<Integer,Integer>map = new HashMap<>(); 
            for (int i = 0; i < n; i++) {
                 int ele = nums[i] -  rev(nums[i]);
                 if(map.containsKey(ele)){
                  int freq = map.get(ele);
                  count += freq;
                  map.put(ele, freq+1);
                 }
                 else map.put(ele, 1);
                  
            }
            return count;
            
      }



      

      public static int rev (int  n){
            int r=0;
            while (n!=0) {
                  r = r*10 + n%10;
                  n /=10;
            }
            return r;
      }
      public static void main(String[] args) {
            
      }
}
