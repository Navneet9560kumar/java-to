package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece.PalindromicSubsequence;

public class PrintshortestcommonSupersequence {
          public static String shortestCommonSupersequence(String s1, String s2){
            int m = s1.length();
            int n = s2.length();
            int [][]dp = new int[m+1][n+1];

            // step 1 dp banayenge 
            for(int i=0;i<=m;i++){
                  for(int j=0;j<=n;j++){
                        if(i==0)dp[i][j] =j;
                        else if(j==0)dp[i][j] =i;
                        else if(s1.charAt(i-1)==s2.charAt(j-1)) 
                              dp[i][j] = 1+ dp[i-1][j-1];
                        else dp[i][j] = 1+ Math.min(dp[i-1][j], dp[i][j-1]);
                              
                  }
            }
            //step 2 ;; ab backtracking karenge
            int i=m, j=n;
            StringBuilder sb = new StringBuilder();
            while (i>0 && j>0) {
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                        sb.append(s1.charAt(i-1));
                        i--;
                        j--;
                  }else if(dp[i-1][j]<dp[i][j-1]){
                        sb.append(s1.charAt(i-1));
                        i--;
                  }else{
                        sb.append(s2.charAt(j-1));
                        j--;
                  }
            }

            //add remaining characters of s1
            while (i>0) {
                 sb.append(s1.charAt(i-1));
                 i--; 
            }
            //add remaining characters of s2
              while (j > 0) {
            sb.append(s2.charAt(j - 1));
            j--;
        }
           // Since we added chars backwards, reverse the result
        return sb.reverse().toString();
          }
     public static void main(String[] args) {
        System.out.println(shortestCommonSupersequence("geek", "eke"));     // geeke
        System.out.println(shortestCommonSupersequence("AGGTAB", "GXTXAYB")); // AGXGTXAYB
    }
}
