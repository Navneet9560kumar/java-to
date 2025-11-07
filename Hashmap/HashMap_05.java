package Hashmap;

import java.util.HashMap;

public class HashMap_05 {

      // map.put(key,value)
      // map.get(key)
      // map.containsKey(key)
      // map.remove(key)
      // map.size()
      // map.clear()
      // map.isEmpty()
      // map.keySet()
      //entrySet()
      public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Navneet", 21);
            map.put("Ankit", 22);
            map.put("Rohit", 20);
            map.put("Suman", 23);
            System.out.println(map);
            System.out.println(map +" " + map.size());
            System.out.println(map.containsKey("Navneet"));
            map.put("Navneet", 100);
            System.out.println(map);
            map.remove("Rohit");
            System.out.println(map);
      }
}
