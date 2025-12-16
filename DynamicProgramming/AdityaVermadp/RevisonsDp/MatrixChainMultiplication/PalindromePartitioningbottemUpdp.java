package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

public class PalindromePartitioningbottemUpdp {

      public static int palindromePartitioningBottomUp(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        // gap represents the length of the substring - 1
        for (int gap = 1; gap < n; gap++) {
            for (int i = 0, j = gap; j < n; i++, j++) {

                // If substring is already a palindrome
                if (isPalindrome(str, i, j)) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;

                    for (int k = i; k < j; k++) {
                        int temp = dp[i][k] + dp[k + 1][j] + 1;
                        dp[i][j] = Math.min(dp[i][j], temp);
                    }
                }
            }
        }

        return dp[0][n - 1];
      }

       private static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

      public static void main(String[] args) {
             
      }
}
