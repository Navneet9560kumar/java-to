package Shorting.QickShort;

public class quickShort_01 {

      public static void print(int[] arr) {
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }

      public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
      }

      // returns pivot index after placing correctly
      public static int partition(int[] arr, int lo, int hi) {

            int pivot = arr[lo];
            int smallerCount = 0;

            // count elements <= pivot
            for (int i = lo + 1; i <= hi; i++) {
                  if (arr[i] <= pivot)
                        smallerCount++;
            }

            int correctIdx = lo + smallerCount;

            // place pivot to correct position
            swap(arr, lo, correctIdx);

            // now fix left and right part
            int i = lo, j = hi;

            while (i < correctIdx && j > correctIdx) {

                  if (arr[i] <= pivot)
                        i++;
                  else if (arr[j] > pivot)
                        j--;
                  else {
                        swap(arr, i, j);
                        i++;
                        j--;
                  }
            }

            return correctIdx;
      }

      public static void quickshort(int[] arr, int lo, int hi) {
            if (lo >= hi)
                  return;

            int pIdx = partition(arr, lo, hi);

            // left
            quickshort(arr, lo, pIdx - 1);

            // right
            quickshort(arr, pIdx + 1, hi);
      }

      public static void main(String[] args) {
            int[] arr = { 4, 9, 7, 1, 2, 3, 6, 5, 8 };
            int n = arr.length;

            print(arr);
            quickshort(arr, 0, n - 1);
            print(arr);
      }
}