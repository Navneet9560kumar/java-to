package Shorting.QickShort;

public class kthsmalleste_02 {
      static int ans;
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

      public static void quickselect(int[] arr, int lo, int hi, int k) {
            if (lo >= hi)return;

            if(lo== hi){
                  if(lo==k-1){
                        ans = arr[lo];
                        return;
                  }
            }
            int idx = partition(arr, lo, hi);
            if(idx == k-1){
                  ans = arr[idx];
                  return;
            }
            if(k-1 < idx )  quickselect(arr, lo, idx - 1, k);

            int pIdx = partition(arr, lo, hi);

            // left
          

            // right
            quickselect(arr, pIdx + 1, hi, k);
      }

      public static void main(String[] args) {
            int[] arr = { 4, 9, 1, 2, 6, 5, 8 };
            int n = arr.length;

            print(arr);
            int k =3;
            ans =-1;
            quickselect(arr, 0, n - 1, k +1);
            System.out.println(ans);
      }
}
