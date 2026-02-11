package Patterns.TowPointer;
import java.util.*;
public class Allowtworemovepratic {

     

       public static int removeDuplicates(int[] arr, int k) {

        if (arr.length <= k) return arr.length;

        int i = k;

        for (int j = k; j < arr.length; j++) {

            if (arr[j] != arr[i - k]) {
                arr[i] = arr[j];
                i++;
            }
        }

        return i;
    }
      public static void main(String[] args) {
            int[]arr = {1,1,1,1,1,1,2,2,2,2,3};

            int k =3;
            int newLength = removeDuplicates(arr,k);
            int[] result = Arrays.copyOf(arr, newLength);

        System.out.println(Arrays.toString(result));
      }
}
