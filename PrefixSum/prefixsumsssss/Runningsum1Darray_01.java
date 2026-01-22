package prefixsumsssss;

import java.util.*;

public class Runningsum1Darray_01 {

          public static int[] runningSum(int[] arr){
            int n = arr.length;

            for(int i=1;i<n;i++){
                  arr[i] += arr[i-1];
            }
            return arr;
          }
      
      
      public static void main(String[] args) {
            int[]arr = {1,2,3,4};
            System.out.println("The prifix sum"  + Arrays.toString(runningSum(arr)));
            runningSum(arr);
      }
      
}
