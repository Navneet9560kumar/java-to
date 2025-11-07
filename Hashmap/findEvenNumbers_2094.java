package Hashmap;

import java.util.*;

public class findEvenNumbers_2094 {

          public int[] findEvenNumbers(int[] digits){
            HashMap<Integer, Boolean> map = new HashMap<>();
            for(int ele:arr){
                  if(map.containsKey(ele)){
                        int freq = map.get(ele);
                        map.put(ele, freq+1);
                  }else map.put(ele, 1);
            }
            for (int i = 100; i <=999; i++) {
                  int x =i;
                  int c = x%10; x = x/10;
                  int b = x%10; x = x/10;
                  int a = x%10;
                  if(map.containsKey(a)){
                        int
                  }
            }
          }
      public static void main(String[] args) {
            
      }
}
