package Hashmap.RevesionHashmap;

import java.util.HashSet;

public class findMaximumNumberofStringpairs_02 {

       public static String reverse(String str){
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
       }

       public int maximumNumberOfStringPairs(String[] arr){
            HashSet<String> set = new HashSet<>();
            int count =0;
           for (int i = 0; i < arr.length; i++) {
                  String rev = reverse(arr[i]);
                  if(set.contains(rev)){
                        count++;
                  }else set.add(arr[i]);
           }
             return count;

       }

      
      public static void main(String[] args) {
           
      }
}


// hashmap mai ye kiuch tarha ke hote hai to frist ye hai ke 
// put krte time agar key already exist krti hai to wo overwrite kr deta hai
// agr key exist nhi krti to wo nayi key value pair add kr deta hai
// get krte time agr key exist krti hai to wo uski value return kr deta hai
// agr key exist nhi krti to wo null return kr deta hai
// remove krte time agr key exist krti hai to wo us key value pair ko remove kr deta hai
//size() method se hume hashmap ki size mil jati hai
// containsKey() method se hume pata chalta hai ke koi key hashmap mai exist krti hai ya nhi
// containsValue() method se hume pata chalta hai ke koi value hashmap mai exist krti hai ya nhi
// clear() method se hum hashmap ko empty kr sakte hai
// keySet() method se hume hashmap ki sari keys mil jati hai