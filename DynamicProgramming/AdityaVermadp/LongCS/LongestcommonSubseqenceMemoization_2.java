package DynamicProgramming.AdityaVermadp.LongCS;

import java.util.Arrays;

public class LongestcommonSubseqenceMemoization_2 {

    static int[][] t = new int[1001][1001];  // Assuming max length of string is 1000

    public static int LCSMEMO(String x, String y, int m, int n) {
        // Base Case
        if (m == 0 || n == 0) return 0;

        // Check memoization table
        if (t[m][n] != -1) return t[m][n];

        // If last characters match
        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            t[m][n] = 1 + LCSMEMO(x, y, m - 1, n - 1);
        } else {
            t[m][n] = Math.max(LCSMEMO(x, y, m - 1, n), LCSMEMO(x, y, m, n - 1));
        }

        return t[m][n];
    }

    public static void main(String[] args) {
        String x = "AGGTAB";
        String y = "GXTXAYB";
        int m = x.length();
        int n = y.length();

        // Initialize memo table with -1
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        System.out.println("Length of LCS using Memoization is: " + LCSMEMO(x, y, m, n));
    }
}
