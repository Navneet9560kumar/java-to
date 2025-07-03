package DynamicProgramming.AdityaVermadp.LongCS;

public class Longestrepeatingsubsequence {

      public static int LRS(String s1, String s2){
            int n= s1.length();
            int m = s2.length();
            int [] [] dp = new int[n+1][m+1];
            // fill tha table
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        // ye i != j wala se ham repeting wala nekal sakte hai  LSG jasa ghee tha ye pok
                        if (s1.charAt(i) == s2.charAt(j) && i != j) {
                              dp[i+1][j+1] = dp[i][j] + 1;
                        } else {
                              dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]);
                        }
                  }
            }
            return dp[n][m];
      }
      public static void main(String[] args) {
            String s1 = "AABEBCDD";
            String s2 = "AABDCC";
            System.out.println("Length of Longest Repeating Subsequence is: " + LRS(s1, s2));
      }
      
}
