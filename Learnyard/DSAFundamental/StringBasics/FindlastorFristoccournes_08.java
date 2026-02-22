package Learnyard.DSAFundamental.StringBasics;

import java.util.*;

public class FindlastorFristoccournes_08 {

       public static void lastandfristOccurrence(String str){
                  int n= str.length();
                  HashMap<Character,List<Integer>> map = new HashMap<>();
                  for(int i =0;i<n; i++){
                         char ch = str.charAt(i);
                          if (!map.containsKey(ch)) {
                map.put(ch, new ArrayList<>());
            }
            map.get(ch).add(i);
                  }
                  // Print characters with frequency >= 2
     for (Map.Entry<Character, List<Integer>> entry : map.entrySet()){
      if(entry.getValue().size()>=2){
            if(entry.getValue().size()>=2){
                                  List<Integer> indexes = entry.getValue();

                                                  System.out.println("Character: " + entry.getKey());
                System.out.println("First Index: " + indexes.get(0));
                System.out.println("Last Index: " + indexes.get(indexes.size() - 1));
                System.out.println();

            }
      }
     }
            }
      public static void main(String[] args) {
               String str = "programming";
        lastandfristOccurrence(str);
      }
}
