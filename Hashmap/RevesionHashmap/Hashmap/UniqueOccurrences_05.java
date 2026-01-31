package Hashmap.RevesionHashmap.Hashmap;

import java.util.HashMap;
import java.util.HashSet;
 
public class UniqueOccurrences_05 {


         public boolean uniqueOccurrences(int[] arr){
            HashMap<Integer, Integer> map =  new HashMap<>();
            for (int ele : arr) {
                 if(map.containsKey(ele)){
                      int  freq =  map.get(ele);
                      map.put(ele, freq+1); 
                 }
                 else map.put(ele, 1);
            }
            HashSet<Integer> set = new HashSet<>();
            for(int key : map.keySet()){
                  int val = map.get(key);
                  set.add(val);

            }
            return (map.size()== set.size());
           
         }
      public static void main(String[] args) {
            
      }
}
