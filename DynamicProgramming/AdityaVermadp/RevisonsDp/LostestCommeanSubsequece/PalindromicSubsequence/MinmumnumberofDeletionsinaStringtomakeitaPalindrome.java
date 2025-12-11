package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece.PalindromicSubsequence;

public class MinmumnumberofDeletionsinaStringtomakeitaPalindrome {


      public static int lcs(String s1, String s2){
            int m = s1.length();
            int n = s2.length();
            int [][]dp = new int[m+1][n+1];

            for(int i=1;i<=m;i++){
                  for(int j=1;j<=n;j++){
                        if(s1.charAt(i-1)==s2.charAt(j-1)){
                              dp[i][j] = 1+ dp[i-1][j-1];
                        }else{
                              dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                        }

                  }
            }
            return dp[m][n];
      }

      // minimum deletion karne ka kaam karna hai

      public static int minDelection(String s){
            String rev = new StringBuilder(s).reverse().toString();
            int lps = lcs(s, rev);
            return s.length() - lps;
      }
      public static void main(String[] args) {
               System.out.println(minDelection("aebcbda"));  // 
        System.out.println(minDelection("aba")); 
      }
} 
