package DynamicProgramming.AdityaVermadp.RevisonsDp.unboundedKnapsack;

public class unboundedKnapsack {

    public static int unboundedKnapsack(int[] wt, int[] val, int W, int n) {

        int[][] t = new int[n + 1][W + 1];

        // Build DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {

                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(
                        val[i - 1] + t[i][j - wt[i - 1]],   // take item (unbounded)
                        t[i - 1][j]                          // don't take
                    );
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][W];
    }

    public static void main(String[] args) {

        int[] wt = {4, 5, 1};
        int[] val = {1, 2, 3};
        int W = 4;
        int n = wt.length;

        System.out.println("Maximum Profit = " + unboundedKnapsack(wt, val, W, n));
    }
}
