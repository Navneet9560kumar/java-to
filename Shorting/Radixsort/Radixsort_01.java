package Shorting.Radixsort;

import java.util.Arrays;

public class Radixsort_01 {

      public static int getMax(int[]arr){
            int max = arr[0];
            for(int num:arr){
                  if(num>max)max=num;

            }
            return max;
      }

      // Step 2: Ek digit position ke liye Counting Sort karo
    // exp = 1 (ones), 10 (tens), 100 (hundreds) ...

    public static void  countingSort(int[]arr, int exp){
      int n = arr.length;
      int[] output = new int[n];// sorted result yahan aayega
      int[] count = new int[10];   // 0 se 9 tak — 10 buckets

      // Har number ka current digit nikalo aur count badhao

      for(int i=0; i<n;i++){
            int digit = (arr[i]/exp)%10;
            count[digit]++;
      }

      // Count ko cumulative banao (kahan rakhna hai position ke liye)
      for(int i=1;i<10;i++){
            count[i] += count[i-1];
      }

         // Peeche se jaao — stable sort ke liye
         for(int i=n-1;i>=0;i--){
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
         }
                 // Output wapas original array mein copy karo
        System.arraycopy(output, 0, arr, 0, n);



    }

    static void radixSort(int[] arr) {
        int max = getMax(arr);
 
        // Ones → Tens → Hundreds → ... jab tak max number cover na ho
        for (int exp = 1; max / exp > 0; exp *= 10) {
            System.out.println("Sorting by digit place: " + exp);
            countingSort(arr, exp);
            System.out.println("Array after this pass: " + Arrays.toString(arr));
        }
      }
    

      public static void main(String[] args) {
             int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
 
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("-----------------------------------");
 
        radixSort(arr);
 
        System.out.println("-----------------------------------");
        System.out.println("Final sorted array: " + Arrays.toString(arr));
      }
}
