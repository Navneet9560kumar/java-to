package Hashmap;

import java.util.*;
public class CheckIfArrayPairsAreDivisiblebyk_1497 {

        public boolean canArrange(int[] arr, int k){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<arr.length;i++){
                  int ele  =arr[i]%k;
                  if(map.containsKey(ele)){
                        int freq = map.get(ele);
                        map.put(ele, freq+1);
            }else map.put(ele, 1);
      }
      for(int key: map.keySet()){
            int rem = k -key;
            if(!map.containsKey(rem)) return false;
            int keyFreq = map.get(key);
            int remFreq = map.get(rem);
            if(keyFreq != remFreq)return false;
      }
      return true;
        }
      public static void main(String[] args) {
      
      }  
}
