package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

public class MatrixChainMultiplsionBottemUPDP {

      
     public static int mcmBottomUp(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];

        // len = chain length
        for (int len = 2; len < n; len++) {
            for (int i = 1; i + len - 1 < n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {
                    int cost = dp[i][k]
                             + dp[k + 1][j]
                             + arr[i - 1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(mcmBottomUp(arr));
    }

}
