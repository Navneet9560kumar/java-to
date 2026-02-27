package TSCNQT.ProblemonArray;

public class Reverse_03 {

      public static void reverse(int[]arr, int start, int end){
            // Base case
              if (start >= end) {
            return;
        }

                // Swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

           // Recursive Call
        reverse(arr, start + 1, end - 1);

      }
      public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};

            int start =0;
            int end = arr.length-1;

            while (start<end) {
                  int temp = arr[start];
                  arr[start] =arr[end];
                  arr[end] = temp;

                  start++;
                  end--;

            }
             System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
      }
}
