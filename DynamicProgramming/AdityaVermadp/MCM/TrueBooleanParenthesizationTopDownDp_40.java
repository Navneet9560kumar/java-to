package DynamicProgramming.AdityaVermadp.MCM;

public class TrueBooleanParenthesizationTopDownDp_40 {
    public static int countWays(String s) {
        int n = s.length();
        int[][][] dp = new int[n][n][2];

        // Initialize all with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][0] = dp[i][j][1] = -1;
            }
        }

        return countWaysUtil(s, 0, n - 1, true, dp);
    }

    public static int countWaysUtil(String s, int i, int j, boolean isTrue, int[][][] dp) {
        if (i > j)
            return 0;

        if (i == j) {
            if (isTrue)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        int boolIdx = isTrue ? 1 : 0;
        if (dp[i][j][boolIdx] != -1)
            return dp[i][j][boolIdx];

        int ways = 0;

        for (int k = i + 1; k <= j - 1; k += 2) {
            char op = s.charAt(k);

            int lt = countWaysUtil(s, i, k - 1, true, dp);
            int lf = countWaysUtil(s, i, k - 1, false, dp);
            int rt = countWaysUtil(s, k + 1, j, true, dp);
            int rf = countWaysUtil(s, k + 1, j, false, dp);

            if (op == '&') {
                ways += isTrue ? lt * rt : lf * rt + lt * rf + lf * rf;
            } else if (op == '|') {
                ways += isTrue ? lt * rt + lf * rt + lt * rf : lf * rf;
            } else if (op == '^') {
                ways += isTrue ? lt * rf + lf * rt : lt * rt + lf * rf;
            }
        }

        dp[i][j][boolIdx] = ways;
        return ways;
    }

    public static void main(String[] args) {
        String expr = "T|T&F^T";
        System.out.println("Ways to evaluate to true: " + countWays(expr)); // Output: 4
    }
}
