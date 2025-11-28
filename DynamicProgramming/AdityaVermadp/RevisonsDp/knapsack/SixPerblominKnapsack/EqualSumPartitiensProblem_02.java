package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack.SixPerblominKnapsack;

public class EqualSumPartitiensProblem_02 {

      public boolean equalsumpartitiens(int[]arr, int n){
            int sum =0;
            for(int num: arr){
                  sum += num;
            }

            if (sum % 2 != 0) {
            return false;
        }

        return subsetSum(arr, sum / 2, arr.length);
      }

       public static boolean subsetSum(int[] arr, int target, int n) {
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Base case: sum = 0 is always possible with empty subset
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        // Base case: with 0 elements, positive sum is not possible
        for (int j = 1; j <= target; j++) {
            dp[0][j] = false;
        }

        // DP table fill karte hain
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Final result: whether sum/2 subset possible or not
        return dp[n][target];
    }
      public static void main(String[] args) {
            
      }
}
