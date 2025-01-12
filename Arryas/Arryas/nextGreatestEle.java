package Arryas;

public class nextGreatestEle {
    public static void main(String[] args) {
        int[] arr = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n = arr.length;
        int[] ans = new int[n];
        
        // The last element will always have -1 as there is no next element
      //   ans[n - 1] = -1;

        // Loop to find the next greatest element
        // Method 1 : Brute Force 
      //   for (int i = 0; i < n - 1; i++) {
      //       int mx = Integer.MIN_VALUE;
      //       for (int j = i + 1; j < n; j++) {
      //           mx = Math.max(mx, arr[j]);
      //       }
      //       ans[i] = mx;
      //   }

        // Print original array
        System.out.println("Original array:");
        //Method 2 : Optimised 
        int nge = arr[n - 1];  // Start from the last element
        ans[n - 1] = -1;  // The last element should always be -1, as there is no greater element
        
        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        // Print original array
        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        // Print next greatest elements array
        System.out.println("Next greatest elements:");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
