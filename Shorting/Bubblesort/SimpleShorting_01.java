package Shorting.Bubblesort;

public class SimpleShorting_01 {
      public static void main(String[] args) {
            int[] arr = { 10, 1, 2, 18, 4, 5 };
            int n = arr.length;
            boolean flag = true;

            for (int i = 0; i < n - 1; i++) {
                  if (arr[i] > arr[i + 1]) {
                        flag = false;// false is unshorted
                        break;
                  }
            }
            if (flag == true)
                  System.out.println("Sorted");
            else System.out.println("Unsorted");
      }
}
