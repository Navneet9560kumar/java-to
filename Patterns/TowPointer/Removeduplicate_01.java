package Patterns.TowPointer;

import java.util.*;

public class Removeduplicate_01 {

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {1,};

        int newLength = removeDuplicates(arr);

        int[] result = Arrays.copyOf(arr, newLength);

        System.out.println(Arrays.toString(result));
    }
}
