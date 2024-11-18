package Sorting;

public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 9, 12};
        int n = arr.length;
        boolean flag = true;
        
        for (int i = 0; i < n - 1; i++) {  // Loop until n - 1
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        
        if (flag) 
            System.out.println("Sorted");
        else 
            System.out.println("Unsorted");
    }
}
