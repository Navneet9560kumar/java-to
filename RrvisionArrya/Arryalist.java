package RrvisionArrya;

import java.util.Arrays;

public class Arryalist {
      public static void main(String[] args) {
            int[]arr  ={30,10,40,23,89,64};
            for(int x: arr){
                  System.out.print(x + " ");
            }
            Arrays.sort(arr);
            System.out.println();
            for (int x: arr) {
                  System.out.print(x+ " ");
            }
      }
}
