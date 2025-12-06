package DynamicProgramming.AdityaVermadp.RevisonsDp.unboundedKnapsack;

public class RobCuttingProblom {
      public static int robCutting(int[]len, int[]price, int n){
            int[][] t = new int[n + 1][n + 1];

            // Build DP table
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= n; j++) {

                        if (len[i - 1] <= j) {
                              t[i][j] = Math.max(
                                          price[i - 1] + t[i][j - len[i - 1]], // take item (unbounded)
                                          t[i - 1][j] // don't take
                              );
                        } else {
                              t[i][j] = t[i - 1][j];
                        }
                  }
            }

            return t[n][n]; 
      }
      public static void main(String[] args) {
            
      }
}
