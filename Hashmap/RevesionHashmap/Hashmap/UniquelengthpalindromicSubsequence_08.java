package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

public class UniquelengthpalindromicSubsequence_08 {
         public  static int countPalindromicSubsequence(String s){
            HashMap<Character,Integer> fristmap = new HashMap<>();
             HashMap<Character,Integer> lastMap = new HashMap<>();

             for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);
                    if(!fristmap.containsKey(ch)) fristmap.put(ch, i);
                    lastMap.put(ch, i);

             }
             int count =0;
             for(char ch : fristmap.keySet()){
                  int fristidx = fristmap.get(ch);
                    int lastidx = fristmap.get(ch);
                  Set<Character> set = new HashSet<>();
                    for (int i = fristidx; i <= lastidx-1; i++) {
                        set.add(s.charAt(i));
                    }
                    count += set.size();
             }
             return count;
         }
      public static void main(String[] args) {
            
      }
}
