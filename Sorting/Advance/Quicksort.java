package Sorting.Advance;

public class Quicksort {

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

      public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo]; // Choose the first element as the pivot
        int pIdx = lo;
        int smallCount = 0;

        // Count elements smaller than or equal to pivot
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot)
                smallCount++;
        }

        int correctIdx = lo + smallCount; // Pivot's correct position
        swap(arr, pIdx, correctIdx); // Move pivot to its correct position

        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) {
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else {
                swap(arr, i, j);
            }
        }

        return correctIdx; // Return pivot's position
    }

      public static void quickSort(int[] arr, int lo, int hi) {
            // piviot(arr[lo] ko sahi jagah rakho)
            // & left part me <=pivot
            if (lo >= hi)
                  return;
            int idx = partition(arr, lo, hi);
            quickSort(arr, lo, idx - 1);
            quickSort(arr, idx + 1, hi);

      }

      public static void main(String[] args) {
            int[] arr = { 4, 9, 7, 1, 2, 3, 6, 5, 8 };
            int n = arr.length;
            print(arr);
            quickSort(arr, 0, n - 1);
            print(arr);
      }
}

// quick short is working is like
// arr = [4,9,7,1,3,2,6,5,8]; arrya ko likho or usko dubara likho or usko pehle
// frist number ko pure arrya se compare karege or fir uske frist number ko pure
// traves karke small se swap kar denge or fir jase 4 ke 4 left mai 4 se chhote
// or fir 4 ke right mai 4 se badhe huee right mai daal dege
// stpe 2 is [1,9,7,4,3,2,6,5,8] to tow poniter lenge or fir i ko 4 se compare
// karege or dekhege ke vo 4 se chhota hai ke nahi nahi to i ko aage badha dena
// or j ko dekhge ke vo 5 se badha hai ha to j ko peeche badha dnge fir 5 ko
// compare karge 4 se vo bhi badha hai to peeche badho ab 2 ko 4 se compare
// karege to per ab 4 se chhota hai to to fir current i se j jo ke 2 per hai
// usko swap kar dnge fir aage badh adnge to vo 3 per aa jayega or fir i 7 per
// to 4 se badha to hai 7 per 3 chhota hai right to swap kar do 3 or 7 ko swap
// kar do [1,3,2,4,7,9,6,5,8] or jase ior j same pos per aa jayege to breck ho
// jayega
