package Sorting;

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
            print(arr);
           for(int x=1;x<=3;x++){
            for (int i = 0; i < n - 1; i++) {
                  if (arr[i] > arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                  }
            }
           }
          print(arr);
      }
}
