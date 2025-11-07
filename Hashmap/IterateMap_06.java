package Hashmap;

import java.util.HashMap;

public class IterateMap_06 {
      public static void main(String[] args) {
               HashMap<String, Integer> map = new HashMap<>();
            map.put("Navneet", 21);
            map.put("Ankit", 22);
            map.put("Rohit", 20);
            map.put("Suman", 23);
           for(String key: map.keySet()){
            int val = map.get(key);
                  System.out.println(key + " " + val);
           }
      
      }
}
