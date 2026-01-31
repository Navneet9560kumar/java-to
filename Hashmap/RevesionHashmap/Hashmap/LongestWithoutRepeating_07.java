package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

public class LongestWithoutRepeating_07 {

      
       public int lengthOfLongestSubstring(String s){
            int n = s.length();
            if(n<=1)return n;
            int maxlen = 0 ;
            int i=0, j=0;
            HashMap<Character, Integer> map = new HashMap<>();
            while (j<n) {
                  char ch  =s.charAt(j);
                  if(map.containsKey(ch) && map.get(ch)>=i){
                        int len = j-i;
                        maxlen = Math.max(maxlen, len);
                        // i ko leke jao ch ki purini pastion 
                        // se aage 
                        while (s.charAt(i)!=ch) {
                              map.remove(s.charAt(i));
                              i++;

                        }
                        i = map.get(ch)+1;
                  }
                   map.put(ch, j);
                  j++;
            }
            return maxlen;

       }
      public static void main(String[] args) {
            
      }
}
