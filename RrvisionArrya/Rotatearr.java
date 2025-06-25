package RrvisionArrya;

public class Rotatearr {

      public static void print(int[]arr){
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }
      public static void main(String[] args) {
            int[]arr = {2,3,4,7,9,11,13,17};
            int n = arr.length;
            print(arr);
            int i=0, j= n-1;
            while (i<j) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                  i++; 
                  j--;
            }

            // agr K elemnt se rotate karna ho to aase karege 

//              public void rotate(int[] nums, int k) {
//          int n = nums.length;
//     k = k % n; // In case k > n

//     // Step 1: Reverse entire array
//     reverse(nums, 0, n - 1);

//     // Step 2: Reverse first k elements
//     reverse(nums, 0, k - 1);

//     // Step 3: Reverse remaining elements
//     reverse(nums, k, n - 1); 
//     }

//     private void reverse(int[] nums, int start, int end) {
//     while (start < end) {
//         int temp = nums[start];
//         nums[start] = nums[end];
//         nums[end] = temp;
//         start++;
//         end--;
//     }
//     }

      }
}
