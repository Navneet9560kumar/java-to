package DynamicProgramming.AdityaVermadp.knapsack;

public class subsetSumcount {

    public static int countSubsets(int[] arr, int sum){
        int n = arr.length;
        int[][] dp = new int[n + 1][sum + 1];

        // Base Case: sum == 0 ke liye har i pe ek empty subset possible hai
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    // Include + Exclude
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    // Exclude only
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8, 10};
        int sum = 10;

        int count = countSubsets(arr, sum);
        System.out.println("Number of subsets with sum " + sum + ": " + count);
    }
}
   