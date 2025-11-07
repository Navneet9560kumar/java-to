package Hashmap;

import java.util.*;

public class FindMaximumNumberofStringPairs {
          public static int maximumNumberOfStringPairs(String[] words){
            int count =0;
            HashSet<String>set = new HashSet<>();
            for (int i = 0; i < words.length; i++) {
                  String rev = reverse(words[i]);
                  if(set.contains(rev)){
                        count++;
                  }else set.add(words[i]);
            }
            return count;
          }

          public static String reverse(String str){
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            return sb.toString();
          }
      public static void main(String[] args) {
            
      }
}
