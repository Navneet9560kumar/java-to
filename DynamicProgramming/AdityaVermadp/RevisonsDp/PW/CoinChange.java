package DynamicProgramming.AdityaVermadp.RevisonsDp.PW;

public class CoinChange {

    public long cointCount(int i, int[] coins, int amount, long[][] dp) {
        if (i == coins.length) {
            if (amount == 0) return 0;
            return Integer.MAX_VALUE;
        }

        if (dp[i][amount] != -1) return dp[i][amount];

        long skip = cointCount(i + 1, coins, amount, dp);

        long pick = Integer.MAX_VALUE;
        if (amount - coins[i] >= 0) {
            long res = cointCount(i, coins, amount - coins[i], dp);
            if (res != Integer.MAX_VALUE) pick = 1 + res;
        }

        dp[i][amount] = Math.min(skip, pick);
        return dp[i][amount];
    }

    public int coinChange(int[] coins, int amount) {
        long[][] dp = new long[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                dp[i][j] = -1;
            }
        }

        long ans = cointCount(0, coins, amount, dp);
        if (ans == Integer.MAX_VALUE) return -1;
        return (int) ans;
    }

    public static void main(String[] args) {

    }
}
