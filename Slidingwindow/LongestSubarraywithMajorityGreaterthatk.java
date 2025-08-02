package Slidingwindow;

import java.util.Map;

public class LongestSubarraywithMajorityGreaterthatk {
    public static int longestSubarray(int[] nums, int k) {
      //  int n  = nums.length;
      //  int res = 0;

      //  for (int i = 0; i < n; i++) {
      //       int cnt = 0;
      //       for(int j=i; j<n; j++){
      //             if(nums[j]>k){
      //                  cnt++;
      //             }
      //             else cnt--;
      //             if (cnt >0){
      //                      res = Math.max(res, j - i + 1);  
      //             }
      //       }
      //  }
      //  return res;
     
      int n = nums.length;
      Map<Integer, Integer> mp = new java.util.HashMap<>();
      int ans =0, sum = 0;
      for(int i=0; i<n;i++){
            if(nums[i]<=k) sum--;
            else sum++;

            if(sum > 0) ans = i +1;
            else {
                  if(mp.containsKey(sum - 1)) {
                        ans = Math.max(ans, i - mp.get(sum - 1));
                  }
            }
            if(!mp.containsKey(sum)){
                  mp.put(sum, i);
            }
      }

      return ans;
    }
    public static void main(String[] args) {
      
    }
}
