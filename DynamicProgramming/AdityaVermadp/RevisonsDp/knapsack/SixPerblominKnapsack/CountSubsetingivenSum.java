package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack.SixPerblominKnapsack;

public class CountSubsetingivenSum {

      public static int countSubsetSum(int[]arr, int target, int n){

            int[][]dp = new int[n+1][target+1];
            // base case : zero sum=> 1

            for(int i=0;i<=n;i++){
                  dp[i][0] =1;
            }
            // table ko fil karemnge 

            for(int i=1; i<=n;i++){
                  for(int j=1;j<=target;j++){
                        if(arr[i-1]<=j){
                              dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                        }else{
                              dp[i][j] = dp[i-1][j];
                        }
                  }
                        
            }
            return dp[n][target];
      
      }
      public static void main(String[] args) {
            
      }
}
