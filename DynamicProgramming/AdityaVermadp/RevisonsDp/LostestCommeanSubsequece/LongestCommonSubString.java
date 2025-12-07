package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece;

public class LongestCommonSubString {
       static int[][] dp = new int[1001][1001];
          public static int longestCommonSubstring(String s1, String s2, int i, int j){

            if(i==0 || j==0) return 0;

            if(dp[i][j]!=-1) return dp[i][j];

              // Characters match → substring continues

              if(s1.charAt(i-1) == s2.charAt(j-1)){
                  dp[i][j] = 1 + longestCommonSubstring(s1, s2, i-1, j-1);
                  return dp[i][j];
              }
              dp[i][j] =0;
              return 0;
          }

          public static void main(String[] args) {
            
          }
}
