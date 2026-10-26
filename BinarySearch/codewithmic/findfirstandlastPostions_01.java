package BinarySearch.codewithmic;
import java.util.*;

public class findfirstandlastPostions_01 {


      public static int[] searchRange(int[] arr, int target){
            int n = arr.length;
           

            int lo=0, hi = n-1;
            while (lo<=hi) {
                  int mid = lo  + (hi -lo)/2;
                  if(arr[mid]==target){
                        if(arr[mid-1] ==target)
                              return (arr[mid]);
                        else if(arr);
                  }

            }
      }
      public static void main(String[] args) {
            int [] arr = {5,7,7,8,8,10};
            int target =8;
      }
}
