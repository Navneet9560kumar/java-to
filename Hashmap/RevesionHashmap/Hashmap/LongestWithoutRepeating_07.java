package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

public class LongestWithoutRepeating_07 {

      
       public int lengthOfLongestSubstring(String s){
            int n = s.length();
             if(n<=1) return n;
             int maxLen =0;
             int i=0, j=0;
             HashMap<Character,Integer>map =new HashMap<>();
             while (j<n) {
                  char ch =  s.charAt(j);
                  if(map.containsKey(ch) && map.get(ch)>=i){
                        int len = j-i;
                        maxLen = Math.max(maxLen,len);
                        // i ko lekar jaoo purani postion se ek aage 
                        while (s.charAt(i)!=ch) i++;
                        i++;
                        
                  } map.put(ch, j);
                  j++;
             }
              int len = j-i;
                        maxLen = Math.max(maxLen,len);
                        return maxLen;
       }
      public static void main(String[] args) {
            
      }
}
