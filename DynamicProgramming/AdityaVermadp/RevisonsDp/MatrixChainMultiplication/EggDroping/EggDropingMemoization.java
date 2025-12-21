package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication.EggDroping;

public class EggDropingMemoization {

    public static int eggMemo(int e, int f, int[][] dp) {

        if (f == 0 || f == 1) return f;
        if (e == 1) return f;

        if (dp[e][f] != -1) return dp[e][f];

        int min = Integer.MAX_VALUE;

        for (int k = 1; k <= f; k++) {
            int temp = 1 + Math.max(
                    eggMemo(e - 1, k - 1, dp),
                    eggMemo(e, f - k, dp)
            );
            min = Math.min(min, temp);
        }

        dp[e][f] = min;
        return min;
    }

    public static void main(String[] args) {

        int eggs = 2;
        int floors = 4;

        int[][] dp = new int[eggs + 1][floors + 1];
        for (int i = 0; i <= eggs; i++) {
            for (int j = 0; j <= floors; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(
                "Number of trials when number of eggs is " + eggs +
                " and number of floors is " + floors + ": " +
                eggMemo(eggs, floors, dp)
        );
    }
}
