package Slidingwindow.revisinonslidingwindow;

public class MaximumSumSubarraySizeK {
      public static void main(String[] args) {
            int[] arr = {10, 20, 1, 3, -40, 80, 10};
            int k=2;
            int n = arr.length;
            int maxSum =0;
            // for (int i = 0; i < n-k+1; i++) {
            //       int sum =0;
            //       for(int j=i;j<=i+k-1;j++){
            //             sum+=arr[j];
            //       }
            //       maxSum = Math.max(maxSum, sum);
            // }

            int i=0, j=k-1, sum=0;
            for(int a =0;a<=k-1;a++){
                  sum += arr[a];
            }
            i++; j++;
            while (j<n) {
                  
                  sum = sum - arr[i-1] + arr[j];//  important line 
                  maxSum = Math.max(maxSum, sum);
                  i++; j++;
            }
            System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
      }
}


// do mthod hai hamare jo kaam kae rae hia ke frist wale mai tc is a o(n^2) hoga aur dusre wale mai o(n) hoga or secod wale mai ham sliding window technique ka use kar rahe hia jisme hum frist window ka sum nikalte hia or uske bad har bar ek element ko remove karte hia or ek element ko add karte hia or max sum nikalte hia