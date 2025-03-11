package MAPS;

import java.util.HashMap;
import java.util.HashSet;

public class unique {



      public static boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele:arr){
                  if(map.containsKey(ele)){
                        int freq = map.get(ele);
                        map.put(ele, freq+1);
                  }
                  else map.put(ele, 1);
            }
            HashSet<Integer> set = new HashSet<>();
            for(int key:map.keySet()){
                  int val = map.get(key);
                  set.add(val);
            }
            return map.size() == set.size();
      }
      public static void main(String[] args) {
            int[] arr1 = {1, 2, 2, 1, 1, 3};
            int[] arr2 = {1, 2, 3, 4, 5};
    
            System.out.println("Test 1: " + uniqueOccurrences(arr1));
            System.out.println("Test 2: " + uniqueOccurrences(arr2));
      }
}
