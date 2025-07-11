package DynamicProgramming.AdityaVermadp.LongCS;

import Pattern.star;

public class PalindromePartitioningTopDownP {

      static int[][] dp;

      public static boolean isPalindrome(String s, int i, int j){
            while (i<j) {
                  if(s.charAt(i) != s.charAt(j)) return false;
                  i++;j--;
                  
            }
            return true;
      }

      public static int solve(String s,int i, int j){
            if(i>=j || isPalindrome(s, i, j)) return 0;

            if(dp[i][j] != -1) return dp[i][j];

            int ans = Integer.MAX_VALUE;
            for(int k=i;k<j;k++){
                  int left = dp[i][k] != -1 ? dp[i][k] : solve(s, i, k);
                  int right = dp[k+1][j] != -1 ? dp[k+1][j]: solve(s, k+1, j);

                  dp[i][k] = left;
                  dp[k+1][j] = right;

                  int temp  =  left + right +1;
                  ans = Math.min(ans, temp);
            }
            dp[i][j] =ans;
            return ans;
      }

         
      public static void main(String[] args) {
             String s = "aab";
        int n = s.length();
        dp = new int[n][n];

        // Initialize dp with -1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Minimum Cuts = " + solve(s, 0, n - 1));
      }
}
