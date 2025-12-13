package DynamicProgramming.AdityaVermadp.RevisonsDp.PW;

public class ZeroOneKnapsack {

      // public static int profit(int i, int[] wet, int[] val, int c) {
      //       if(i==wet.length) return 0;
      //       int skip = profit(i+1,wet,val,c);
      //       if(wet[i]>c) return skip;

      //             int pick = val[i] + profit(i+1,wet, val,c -wet[i]);

      //             return Math.max(pick, skip);
      // }
      // public static void main(String[] args) {
      //       int[]val= {5,3,7,16};
      //       int[]wet= {1,2,8,10};
      //       int c=10;
      //       int n = val.length;

      //       System.out.println(profit(0,wet,val,c));
      // }
// this iis a memorization code
     

    public static int profit(int i, int[] wt, int[] val, int c, int[][] dp) {
        if (i == wt.length || c == 0)
            return 0;

        if (dp[i][c] != -1)
            return dp[i][c];

        int skip = profit(i + 1, wt, val, c, dp);

        if (wt[i] > c)
            return dp[i][c] = skip;

        int pick = val[i] + profit(i + 1, wt, val, c - wt[i], dp);

        return dp[i][c] = Math.max(pick, skip);
    }

    public static void main(String[] args) {
        int[] val = {5, 3, 7, 16};
        int[] wt  = {1, 2, 8, 10};
        int c = 10;

        int n = val.length;
        int[][] dp = new int[n][c + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= c; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(profit(0, wt, val, c, dp));
    }
}
