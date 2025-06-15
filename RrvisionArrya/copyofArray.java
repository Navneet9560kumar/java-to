package RrvisionArrya;

import java.util.Arrays;

public class copyofArray {
      public static void main(String[] args) {
               int[]arr  ={30,10,40,23,89,64};
               for(int ele: arr){
                  System.out.print(ele + " ");
               }
               System.out.println();
               int[] nums = arr;
               nums[0] = 100; // Changing the first element of nums will also change the first element of arr
              int[]brr = Arrays.copyOf(arr, arr.length); // This creates a new array brr that is a copy of arr
               for(int ele: arr){
                  System.out.print(ele + " ");
               }
      }
}
