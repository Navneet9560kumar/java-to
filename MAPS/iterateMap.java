package MAPS;

import java.util.HashMap;

public class iterateMap {
      public static void main(String[] args) {
                HashMap<String,Integer> map = new HashMap<>();
            map.put("Navneet", 1);
            map.put("sumit", 2);
            map.put("Aadi", 3);
            for(String key:map.keySet()){
                  int value = map.get(key);
                  System.out.println(key + " " + value);
            }
      }
}
