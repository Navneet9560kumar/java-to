package MAPS;

import java.util.TreeSet;

public class Treeset {
      public static void main(String[] args) {
            TreeSet<Integer> set = new TreeSet<>();
            set.add(1);
            set.add(8);
            set.add(6);

            for(Integer key: set){
                 
                  System.out.println(key );
            }
            System.out.println(set + " " + set.size());
      }
}


/// ye kuch nahi karta bas short oder  mai print karta hai baki ye hashset jaisa hi hai
/// 
/// ye sorted order mai print karta hai
/// ye bhi fail fast iterator hai