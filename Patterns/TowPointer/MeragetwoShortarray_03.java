package Patterns.TowPointer;

public class MeragetwoShortarray_03 {

public static int[] mergearr(int[] arr1, int[] arr2) {

    int n = arr1.length;
    int m = arr2.length;

    int[] res = new int[n + m];

    int i = 0, j = 0, idx = 0;

    while (i < n && j < m) {
        if (arr1[i] <= arr2[j]) {
            res[idx] = arr1[i];
            i++;
        } else {
            res[idx] = arr2[j];
            j++;
        }
        idx++;
    }

    // remaining elements of arr1
    while (i < n) {
        res[idx++] = arr1[i++];
    }

    // remaining elements of arr2
    while (j < m) {
        res[idx++] = arr2[j++];
    }

    return res;
}




public static void main(String[] args) {
            int []arr1 = {1,3,5};
            int[]arr2  ={2,4,6};
      }
}
