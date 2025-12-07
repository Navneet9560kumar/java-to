package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece;

public class LCSTopDownDP {
       static int[][] dp = new int[1001][1001];
       

        public static int lcs(String s1, String s2, int i, int j) {
            // base case
            if(i==0 || j==0) return 0;

            // Already computed → return memoized value
            if(dp[i][j] != -1) return dp[i][j];

            //Match case
            if(s1.charAt(i-1)== s2.charAt(j-1)){
                  return dp[i][j] = 1 + lcs(s1, s2, i-1, j-1);
            }
             return dp[i][j] = Math.max(
                lcs(s1, s2, i - 1, j),
                lcs(s1, s2, i, j - 1)
        );
        }

        public static void main(String[] args) {
            String s1 = "abcdgh";
        String s2 = "abedfhr";

        // Initialize dp with -1
        for(int x = 0; x < 1001; x++) {
            for(int y = 0; y < 1001; y++) {
                dp[x][y] = -1;
            }
        }

        int ans = lcs(s1, s2, s1.length(), s2.length());
        System.out.println("LCS Length = " + ans);
        }
}
