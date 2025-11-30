package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack.SixPerblominKnapsack;

public class Targetsum_148 {

      public static int findTargetSumWays(int[] nums, int target) {
            int totalsum=0;
            for(int num: nums){
                  totalsum += num;
            }
            if((target + totalsum) % 2 != 0 ||  target > totalsum || target < -totalsum){
                  return 0;
            }
            int subsetSum = (target + totalsum)/2;
            return countSubsets(nums, subsetSum);
      }

      
    public static int countSubsets(int[]nums,int sum){
      int n = nums.length;
      int[][]dp = new int[n+1][sum+1];

      //base case

      for(int i=1; i<=n; i++){
            for(int j=0;j<=sum;j++){
                  if(nums[i-1]<=j){
                           dp[i][j] =dp[i-1][j]+dp[i-1][j-nums[i-1]];
                  }else{
                        dp[i][j] = dp[i-1][j];
                  }
            }
            
      }
      return dp[n][sum];
    }
      public static void main(String[] args) {
            
      }
}
