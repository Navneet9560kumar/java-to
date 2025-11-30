package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack.SixPerblominKnapsack;

public class CountTheNumberofsubset {

    public static int countSubsetsWithGivenDiff(int[] arr, int diff) {
        int n = arr.length;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        // Check if S1 is integer
        if ((sum + diff) % 2 != 0) return 0;

        int target = (sum + diff) / 2;

        return countSubsetSum(arr, target);
    }

    public static int countSubsetSum(int[] arr, int target) {
        int n = arr.length;

        int[][] dp = new int[n + 1][target + 1];

        // Base case: one way to make sum 0
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3};
        int diff = 1;
        System.out.println(countSubsetsWithGivenDiff(arr, diff));  // Output: 3
    }
}
 