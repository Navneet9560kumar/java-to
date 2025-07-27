package Slidingwindow;

public class MaximumsumSubarraysizek {
      public static void main(String[] args) {
            int[] arr= {10,20,1,3,-40,80,10};
            int k=2;
            int n = arr.length;
            // int maxsum=0;
            // for (int i = 0; i < n-k+1; i++) {
            //       int sum =0;
            //       for (int j = i; j < i+k; j++) {
            //             sum +=arr[j];
            //       }
            //       maxsum = Math.max(maxsum,sum);
            // }
            // System.out.println(maxsum);
            int i=0,j= k-1, sum=0;
            for(int  a=i;a<=j;a++){
                  sum += arr[a];
            }
            i++;j++;
            while (j<n) {
                  sum = sum - arr[i-1] + arr[i];
            }
            System.out.println();
      }
}
