package MAPS;

import java.util.HashMap;

public class mapbase {
      public static void main(String[] args) {
            HashMap<String,Integer> map = new HashMap<>();
            map.put("Navneet", 1);
            map.put("sumit", 2);
            map.put("Aadi", 3);
            System.out.println(map + " " + map.size());
            System.out.println(map.containsKey("Navneet"));
         System.out.println(   map.get(1));
         System.out.println(map + " " + map.size());
      }
}


// in hashmap there can be duplicate values but not duplicate keys
// hashmap is not synchronized so it is not thread safe
// hashmap is faster than hashtable because it is not synchronized 
// hashmap allows one null key and multiple null values
// hashmap is fail fast iterator
// hashmap is non synchronized
