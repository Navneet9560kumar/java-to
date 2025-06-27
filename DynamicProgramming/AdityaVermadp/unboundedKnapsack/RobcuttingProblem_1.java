package DynamicProgramming.AdityaVermadp.unboundedKnapsack;

public class RobcuttingProblem_1 {

      public static int cutRod(int[] price, int[] len, int n) {
            int[][] dp = new int[len.length + 1][n + 1];

            for (int i = 1; i <= len.length; i++) {
                  for (int j = 1; j <= n; j++) {
                        if (len[i - 1] <= j) {
                              dp[i][j] = Math.max(
                                          price[i - 1] + dp[i][j - len[i - 1]], // take the same item again (unbounded)
                                          dp[i - 1][j] // don't take the item
                              );
                        } else {
                              dp[i][j] = dp[i - 1][j]; // cannot take the item
                        }
                  }
            }

            return dp[len.length][n];
      }

      public static void main(String[] args) {
            int[] len = { 1, 2, 3, 4, 5, 6, 7, 8 };
            int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
            int n = 8;

            int maxProfit = cutRod(price, len, n);
            System.out.println("Maximum Obtainable Value: " + maxProfit);
      }
}
