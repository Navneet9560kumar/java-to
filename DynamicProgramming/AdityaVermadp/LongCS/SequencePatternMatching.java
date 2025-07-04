package DynamicProgramming.AdityaVermadp.LongCS;

public class SequencePatternMatching {
      //     public static boolean isSubsequence(String s, String t){
      //       int m = s.length(), n= t.length();

      //       int[][]dp = new int[m+1][n+1];

      //       for (int i = 1; i <= m; i++) {
      //             for (int j = 1; j <=n ; j++) {
      //                   if(s.charAt(i-1)==t.charAt(j-1)){
      //                         dp[i][j] = 1+ dp[i-1][j-1];
      //                   }else{
      //                         dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
      //                   }
      //             }
                  
      //       }
      //        return dp[m][n] == m;
      //     }
      //seedha methoda hai ye to 

        public boolean isSubsequence(String s, String t) {
        int lcsLength = LCS(s, t); // LCS function call

        // If all characters of 's' appear in order in 't', it's a subsequence
        if (lcsLength == s.length()) {
            return true;
        } else {
            return false;
        }
    }

    // Function to calculate LCS length
    public int LCS(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];

        // Fill DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n]; // Length of LCS
    }
      public static void main(String[] args) {
            SequencePatternMatching sol = new SequencePatternMatching();

        System.out.println(sol.isSubsequence("abc", "ahbgdc")); // true
        System.out.println(sol.isSubsequence("axc", "ahbgdc")); // false
      }
}
