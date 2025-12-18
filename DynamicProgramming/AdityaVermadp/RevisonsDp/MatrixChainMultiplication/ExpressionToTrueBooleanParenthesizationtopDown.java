package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

import java.util.Arrays;

public class ExpressionToTrueBooleanParenthesizationtopDown {
      static int[][][] memo;

    public int countWays(String s) {
        int n = s.length();
        memo = new int[n + 1][n + 1][2];
        for (int[][] row : memo) {
            for (int[] col : row) {
                Arrays.fill(col, -1);
            }
        }
        return solve(s, 0, n - 1, 1);
    }

    static int solve(String s, int i, int j, int isTrue) {
        // Base Case 1: Agar range invalid hai
        if (i > j) return 0;

        // Base Case 2: Agar sirf ek hi character bacha hai (T ya F)
        if (i == j) {
            if (isTrue == 1) {
                return (s.charAt(i) == 'T') ? 1 : 0;
            } else {
                return (s.charAt(i) == 'F') ? 1 : 0;
            }
        }

        // Memoization check
        if (memo[i][j][isTrue] != -1) {
            return memo[i][j][isTrue];
        }

        int ans = 0;

        // Operator hamesha i+1 se start hote hain aur +2 ke gap pe hote hain (T | F & T...)
        for (int k = i + 1; k <= j - 1; k = k + 2) {
            
            // Left side ke True/False counts
            int lT = solve(s, i, k - 1, 1);
            int lF = solve(s, i, k - 1, 0);
            
            // Right side ke True/False counts
            int rT = solve(s, k + 1, j, 1);
            int rF = solve(s, k + 1, j, 0);

            char operator = s.charAt(k);

            if (operator == '&') {
                if (isTrue == 1) ans += (lT * rT); // T & T = T
                else ans += (lT * rF) + (lF * rT) + (lF * rF);
            } 
            else if (operator == '|') {
                if (isTrue == 1) ans += (lT * rT) + (lT * rF) + (lF * rT);
                else ans += (lF * rF); // F | F = F
            } 
            else if (operator == '^') {
                if (isTrue == 1) ans += (lT * rF) + (lF * rT); // Different values for XOR = T
                else ans += (lT * rT) + (lF * rF); // Same values for XOR = F
            }
        }

        return memo[i][j][isTrue] = ans;
    }

    public static void main(String[] args) {
        ExpressionToTrueBooleanParenthesizationtopDown sol = new ExpressionToTrueBooleanParenthesizationtopDown();
        String s = "T|T&F^T";
        System.out.println("Total ways: " + sol.countWays(s));
    }
}
