package Hashmap.RevesionHashmap;

import java.util.HashSet;

public class findMaximumNumberofStringpairs_02 {

       public static String reverse(String str){
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
       }

       public int maximumNumberOfStringPairs(String[] arr){
            HashSet<String> set = new HashSet<>();
            int count =0;
           for (int i = 0; i < arr.length; i++) {
                  String rev = reverse(arr[i]);
                  if(set.contains(rev)){
                        count++;
                  }else set.add(arr[i]);
           }
             return count;

       }

      
      public static void main(String[] args) {
           
      }
}
