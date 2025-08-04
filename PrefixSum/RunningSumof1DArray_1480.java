package PrefixSum;

public class RunningSumof1DArray_1480 {

         public static int[] runningSum(int[] arr) {
                  int n = arr.length;
                  int[] result = new int[n];
                  result[0] = arr[0];
                  for (int i = 1; i < n; i++) {
                      result[i] = result[i - 1] + arr[i];
                  }
                  return result;


                  // Method 2
//                     public static int[] runningSum(int[] arr) {
// //                  for (int i = 0; i < arr.length; i++) {
// //                   arr[i]  += arr[i-1];

// //                  }
// //                  return arr;
//     }
    }
      public static void main(String[] args) {
            
      }
}
