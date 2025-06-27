package DynamicProgramming.AdityaVermadp.knapsack;

public class EqualsumpartitationAditya {

           public static boolean canPartition(int[] arr) {
        // Step 1: pehle ek sum variable bana lete hain
        int sum = 0;

        // Step 2: loop laga ke total sum nikal lete hain
        for (int num : arr) {  
            sum += num;
        }

        // Step 3: Check karte hain agar sum odd hai to return false
        if (sum % 2 != 0) {
            return false;
        }

        // Step 4: Agar sum even hai, to subset sum check karenge with target = sum/2
        return subsetSum(arr, sum / 2, arr.length);
    }

    // Subset Sum problem using DP
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
        int[] arr1 = {1, 5, 11, 5};
        System.out.println("Output: " + canPartition(arr1)); // true

        int[] arr2 = {1, 5, 3};
        System.out.println("Output: " + canPartition(arr2)); // false
    }
}