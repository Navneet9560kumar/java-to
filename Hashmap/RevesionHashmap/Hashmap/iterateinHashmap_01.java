package Hashmap.RevesionHashmap.Hashmap;

import java.util.HashMap;

public class iterateinHashmap_01 {
      public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("Navneet", 2);
            map.put("Ankit", 3);
            map.put("Rohit", 5);    
             map.put("Rohit", 5);    
            // iterate using for each loop
            for(String ele: map.keySet()){
                  System.out.println("Key: " + ele + ", Value: " + map.get(ele)); 
            }
            System.out.println();
            // iterate using entry set 

      }
}
