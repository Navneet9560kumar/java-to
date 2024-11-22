package Sorting;

public class transformArryay {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {40, 12, 78, 34, 100, 57, 23};
        int n = arr.length;
        int x = n; // Declare and initialize x to the size of the array

        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) { // Corrected condition
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x; // Assign x to the minimum index
            x--; // Decrease x
        }

        print(arr); // Print the final array
    }
}
 