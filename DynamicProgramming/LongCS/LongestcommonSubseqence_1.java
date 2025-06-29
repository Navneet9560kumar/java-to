package DynamicProgramming.LongCS;

public class LongestcommonSubseqence_1 {

    public static int LCS(String x, String y, int m, int n) {
        if (m == 0 || n == 0) return 0;

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return 1 + LCS(x, y, m - 1, n - 1);
        } else {
            return Math.max(LCS(x, y, m, n - 1), LCS(x, y, m - 1, n));
        }
    }

    public static void main(String[] args) {
        String x = "AGGTAB";
        String y = "GXTXAYB";
        int m = x.length();
        int n = y.length();
        System.out.println("Length of LCS is " + LCS(x, y, m, n));
    }
}
