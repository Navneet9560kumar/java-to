package DynamicProgramming.AdityaVermadp.LongCS;

public class Minimumnumberofinsertioninstringtomakeitapalindrome {

       public int minInsertions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int lcsLen = LCS(s, rev);

        return s.length() - lcsLen;
    }
      private static int LCS(String s1, String s2){
            int m= s1.length(), n=s2.length();
            int[][]dp = new int[m+1][n+1];
            //f ill the  table 
            for (int i = 1; i <= m; i++) {
                  for (int j = i; j <= n; j++) {
                        if(s1.charAt(i-1) == s2.charAt(j-1)){
                              dp[i][j] = 1+dp[i-1][j-1];
                        }else{
                              dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                        }
                  }
            }
            return dp[m][n];
      }
      public static void main(String[] args) {
             Minimumnumberofinsertioninstringtomakeitapalindrome sol = new Minimumnumberofinsertioninstringtomakeitapalindrome();
        System.out.println(sol.minInsertions("ab")); // Output: 1
        System.out.println(sol.minInsertions("aa")); // Output: 0
        System.out.println(sol.minInsertions("abcd")); // Output: 3
      }
}
