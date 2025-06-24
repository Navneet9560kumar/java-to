package DynamicProgramming.AdityaVermadp;

public class MinSubsetSumDifference {

         public static int findMinDifference(int[] arr){
            int n= arr.length;
            int sumtotale = 0;

            for(int num:arr){
                  sumtotale += num;
            }
            boolean[][]dp = new boolean[n+1][sumtotale+1];

            //Initialization
            for (int i = 0; i <= n; i++) {
                  dp[i][0] = true;

            }
            //fill the subset-sum dp table
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= sumtotale; j++) {
                        if(arr[i-1]<=j){
                              dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];

                        }     else{
                              dp[i][j]= dp[i-1][j];
                        }                   
                  }
            }

            //ab min difference pata karege 
            int minDiff = Integer.MAX_VALUE;
            for(int j=0;j<=sumtotale;j++){
                  if(dp[n][j]){
                        int s1 =j;
                        int s2 = sumtotale - j;
                        minDiff = Math.min(minDiff,Math.abs(s1-s2));
                  }
            }
            return minDiff;
         }




      public static void main(String[] args) {
             int[] arr1 = {1, 6, 11, 5};
        int[] arr2 = {1, 5, 11, 5};

        System.out.println("Minimum difference for arr1: " + findMinDifference(arr1)); // Output: 1
        System.out.println("Minimum difference for arr2: " + findMinDifference(arr2)); // Output: 0
      }
}
