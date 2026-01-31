package Hashmap.RevesionHashmap.Hashmap;

import java.util.HashMap;

public class CheckifArraypairsDivisidebyK_09 {

         public boolean canArrange(int[] arr, int k){

            HashMap<Integer, Integer> map = new HashMap<>();
           for(int i=0;i<arr.length;i++){
             int ele = arr[i]%k;
                 if(map.containsKey(ele)){
                           int freq = map.get(ele);
                           map.put(ele, freq+1);
                    }
                    else map.put(ele, 1);
                 }
                 for(int key: map.keySet()){
                  int rem = k -key;
                  if(!map.containsKey(rem)) return false;
                  if(map.get(key) != map.get(rem))  return false;
                 }
                 return true;
           }
            
      public static void main(String[] args) {
            
      }
}
