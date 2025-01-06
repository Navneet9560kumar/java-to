package Arryas;

public class mergeTwoSorted {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71};
        int[] b = {26, 54, 69, 81};

        int m = a.length;
        int n = b.length;
        
        int[] c = new int[m + n];
        int i = 0, j = 0, k = 0;
        
        // Merging two sorted arrays
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        
        // Copy remaining elements from array 'a', if any
        while (i < m) {
            c[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from array 'b', if any
        while (j < n) {
            c[k] = b[j];
            j++;
            k++;
        }

        // Print the merged array
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }
}
