package DynamicProgramming.AdityaVermadp.unboundedKnapsack;

public class CoinechageproblemTWO_16 {

    public static int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] t = new int[n + 1][amount + 1];

        // Initialize first row with INT_MAX - 1
        for (int j = 1; j <= amount; j++) {
            t[0][j] = Integer.MAX_VALUE - 1;
        }

        // Initialize first column with 0
        for (int i = 0; i <= n; i++) {
            t[i][0] = 0;
        }

        // Initialize second row (i = 1) - only using first coin
        for (int j = 1; j <= amount; j++) {
            if (j % coins[0] == 0) {
                t[1][j] = j / coins[0];
            } else {
                t[1][j] = Integer.MAX_VALUE - 1;
            }
        }

        // Fill the rest of the table
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    t[i][j] = Math.min(1 + t[i][j - coins[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][amount] == Integer.MAX_VALUE - 1 ? -1 : t[n][amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = coinChange(coins, amount);
        System.out.println("Minimum number of coins: " + result); // Output: 3 (5 + 5 + 1)
    }
}
