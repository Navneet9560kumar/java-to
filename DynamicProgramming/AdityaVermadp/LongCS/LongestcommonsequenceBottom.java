package DynamicProgramming.AdityaVermadp.LongCS;

public class LongestcommonsequenceBottom {
      // isame ham pure sietinr return kar rahe hai kay commen hai kay nahi 

         public static String getLCS(String s1, String s2){
            int m= s1.length();
            int n= s2.length();
            int[][] dp = new int[m + 1][n + 1];

            // fill the dp table
            for (int i = 1; i <=m; i++) {
                  for (int j = 1; j <n; j++) {
                      if(s1.charAt(i-1)==s2.charAt(j-1)){
                        dp[i][j] = 1 + dp[i-1][j-1];
                      }else{
                        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                      }  
                  } 
            }
            // reconstruct the LCS from the dp table
            int i=m;int j = n;
            StringBuilder lcs = new StringBuilder();
            while (i>0 && j>0) {
                  if(s1.charAt(i-1)==s2.charAt(j-1)){
                        lcs.append(s1.charAt(i-1));
                        i--;
                        j--;
                  }else{
                        if(dp[i-1][j]>dp[i][j-1]){
                              i--;
                        }else{
                              j--;
                        }
                  }
                  
            }
            return lcs.reverse().toString();
         }
      public static void main(String[] args) {
            String s1  = "ABCDGH";
            String s2 = "AEDFHR";
            String lcs = getLCS(s1, s2);
            System.out.println("Longest Common Subsequence is: " + lcs);
            System.out.println("Length of LCS is: " + lcs.length());
      }
}
