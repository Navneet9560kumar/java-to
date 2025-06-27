package DynamicProgramming.AdityaVermadp.knapsack;

public class TargetSumWays_12 {

      
    public static int findTargetSumWays(int[] nums, int target) {
      int totalsum =0;
      for(int num:nums){
            totalsum += num;
 
      }
      // dekho ke (target+totalSum) is valied (even and non-negative)
      if((target +totalsum)%2 !=0|| target>totalsum ||target< -totalsum){
            return 0;
      }
      int subsetsum= (target +totalsum)/2;
      return countSubsets(nums, subsetsum);

      
    }

    public static int countSubsets(int[]nums,int sum){
      int n = nums.length;
      int[][]dp = new int[n+1][sum+1];

      //base case : 
      for (int i = 0; i <=n; i++) {
            dp[i][0] =1;
      }

      //fill dp table
      for (int i = 1; i <=n; i++) {
            for (int j = 0; j <= sum; j++) {
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
              int[] arr = {1, 1, 2, 3};
        int target = 1;

        int ways = findTargetSumWays(arr, target);
        System.out.println("Number of ways to reach target using + and - signs: " + ways);
      }
}
