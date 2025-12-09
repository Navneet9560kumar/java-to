package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece;

public class ShortestCommonSuperSequence {
      public static int[][] lcsDP(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();

    int[][] dp = new int[m + 1][n + 1];

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1))
                dp[i][j] = 1 + dp[i - 1][j - 1];
            else
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }
    }
    return dp;
}

public static String shortestCommonSupersequence(String s1, String s2) {
    int m = s1.length();
    int n = s2.length();

    int[][] dp = lcsDP(s1, s2);

    StringBuilder sb = new StringBuilder();

    int i = m, j = n;

    while (i > 0 && j > 0) {
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            sb.append(s1.charAt(i - 1));
            i--;
            j--;
        } else {
            if (dp[i - 1][j] > dp[i][j - 1]) {
                sb.append(s1.charAt(i - 1));
                i--;
            } else {
                sb.append(s2.charAt(j - 1));
                j--;
            }
        }
    }

    // Add remaining characters
    while (i > 0) sb.append(s1.charAt(i-- - 1));
    while (j > 0) sb.append(s2.charAt(j-- - 1));

    return sb.reverse().toString();
}


   public static void main(String[] args) {
    String s1 = "geek";
    String s2 = "eke";

    String scs = shortestCommonSupersequence(s1, s2);
    System.out.println("SCS = " + scs);
}

}
