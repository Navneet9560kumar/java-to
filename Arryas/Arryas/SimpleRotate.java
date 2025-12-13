package Arryas;

public class SimpleRotate {
      // public static void main(String[] args) {
      //       int[]arr = {5,10,3,20,15};
      //       int n = arr.length;
      //       int temp = arr[0];
      //       for(int i=0;i<n-1;i++){
      //             arr[i] = arr[i+1];
      //       }
      //       arr[n-1]=temp;
      //       for(int i=0;i<n;i++){
      //             System.out.print(" " + arr[i]);
      //       } 
      // }
      //Rotate array left by k positions

       public static void main(String[] args) {
        int[] arr = {5, 10, 3, 20, 15};
        int k = 2;
        int n = arr.length;

        k = k % n;

        for (int r = 0; r < k; r++) {
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
