package RrvisionArrya;

import java .util.ArrayList;

public class basicsofarrya {
      public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(0,10); // arr[0] =10;
            arr.add(1,20); // arr[1] =20;
            arr.add(2,30); // arr[2] =30; 
            arr.add(3,40); // arr[3] =40;
            arr.add(4,50); // arr[4] =50;
            arr.add(5,60); // arr[5] =60;
         System.out.println("The arrya is size of " +  arr);
         for (int i = 0; i < arr.size(); i++) {
               System.out.println("Element at index " + i + " is " + arr.get(i));
         }
         arr.add(90);
         
      }
}
