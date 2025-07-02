package DynamicProgramming.AdityaVermadp.LongCS;

import Doit.revress;

public class minimumNumberofDeletion {

          public static int longestPalindromicSubseq(String s) {
        String rev = new StringBuilder(s).reverse().toString();

            int n = s.length();
            int [][]dp = new int[n+1][n+1];
            // fill dp table
            for (int i = 1; i < n; i++) {
                  for (int j = 1; j <n; j++) {
                      if(s.charAt(i-1)== rev.charAt(j-1)){
                        dp[i][j] = 1+ dp[i-1][j-1];
                      }  else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                      }
                  }
            }
            return dp[n][n];

          }
           public static int minDeletionsToPalindrome(String s) {
        int lps = longestPalindromicSubseq(s);
        return s.length() - lps;
        
    }
      public static void main(String[] args) {
            String s = "abca";
            System.out.println("Minimum deletions to make palindrome: " + minDeletionsToPalindrome(s));
      }
}
