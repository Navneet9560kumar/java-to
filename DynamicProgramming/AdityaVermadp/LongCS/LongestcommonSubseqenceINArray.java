package DynamicProgramming.AdityaVermadp.LongCS;
import java.util.*;

public class LongestcommonSubseqenceINArray {
       public static int findLHS(int[] nums){
            Map<Integer,Integer> map = new HashMap<>();
            int result =0;
            for(int num : nums){
                  map.put(num, map.getOrDefault(num, 0) + 1);
            }     
                  // Check for harmonious subsequences
                  for(int num: nums){
                        int minNum = num;
                        int maxNum = num + 1;
                        if(map.containsKey(maxNum)){
                              return Math.max(result, map.get(minNum) + map.get(maxNum));
                        }
                  }
                  return result;
       }
      public static void main(String[] args) {
            
      }
}
