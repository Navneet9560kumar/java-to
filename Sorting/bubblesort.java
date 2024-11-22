package Sorting;

import TreePW.boolen;

public class bubblesort {
      public static void print(int[] arr) {
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {
            int[] arr = { 5, 1, 3, 4,2 };
            int n = arr.length;
      //       print(arr);
      //      for(int x=1;x<=3;x++){
      //       for (int i = 0; i < n - 1; i++) {
      //             if (arr[i] > arr[i + 1]) {
      //                   int temp = arr[i];
      //                   arr[i] = arr[i + 1];
      //                   arr[i + 1] = temp;
      //             }
      //       }
      //      }
      //     print(arr); this is a bubble sort 1

      // Bubble Sort 2

            // for(int x=0;x<n-1;x++){
            //       for (int i = 0; i < n - 1; i++) {
            //             if (arr[i] > arr[i + 1]) {
            //                   int temp = arr[i];
            //                   arr[i] = arr[i + 1];
            //                   arr[i + 1] = temp;
            //             }
            //       }
            //      }
            //bubble sort optimise
        

            for (int x = 0; x < n - 1; x++) {
                  boolean flag = true;
                  for (int i = 0; i < n - 1 - x; i++) { // Optimize inner loop with `n-1-x`
                        if (arr[i] > arr[i + 1]) { // Fix condition to check adjacent elements
                              int temp = arr[i];
                              arr[i] = arr[i + 1];
                              arr[i + 1] = temp;
                              flag = false;
                        }
                  }
                  if (flag) break; // Exit early if already sorted
            }

            print(arr);

      }
}
