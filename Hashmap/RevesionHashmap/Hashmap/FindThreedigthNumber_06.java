package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

public class FindThreedigthNumber_06 {


       public int[] findEvenNumbers(int[] arr){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int ele: arr){
                  if(map.containsKey(ele)){
                        int freq = map.get(ele);
                        map.put(ele, freq+1);
                  }
                  else map.put(ele, 1);// yaha per sare hashmap mai bhar deye gaye hai 
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=100;i<=999;i++){
                   int x = i;
                   int c = x%10; x/=10;
                   int b = x%10; x/=10;
                   int a = x%10;
                   if(map.containsKey(a)){
                       int aFreq = map.get(a);
                       map.put(a,aFreq-1);
                       if(aFreq==1) map.remove(a); 
                       if(map.containsKey(b)){
                        if(map.containsKey(c)){
                              ans.add(i);
                        }
                   }
                   map.put(a, aFreq);

                   
            }
       }
      public static void main(String[] args) {
            
      }
}
