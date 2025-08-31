package Sorting.Advance;

public class QuickSort_2 {

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

    public static int partitions(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pIdx = lo;
        int smallercount = 0;

        // count smaller elements
        for (int i = lo; i <= hi; i++) {
            if (arr[i] < pivot) {
                smallercount++;
            }
        }

        int correctIdx = pIdx + smallercount;

        // place pivot at its correct position
        swap(arr, pIdx, correctIdx);

        // partition around pivot
        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] < pivot) {
                i++;
            } else if (arr[j] >= pivot) {
                j--;
            } else { // swap wrong positions
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr, int lo, int high) {
        if (lo >= high) return; // ✅ base case

        int idx = partitions(arr, lo, high);

        quickSort(arr, lo, idx - 1);
        quickSort(arr, idx + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 5, 6, 5, 8};
        int n = arr.length;

        System.out.print("Original: ");
        print(arr);

        quickSort(arr, 0, n - 1);

        System.out.print("Sorted:   ");
        print(arr);
    }
}
