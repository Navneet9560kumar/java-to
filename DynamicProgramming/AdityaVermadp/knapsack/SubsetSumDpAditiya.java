package DynamicProgramming.AdityaVermadp.knapsack;

public class SubsetSumDpAditiya {


         public static boolean subset(int[] arr, int sum) {
        int n = arr.length;
        boolean[][] t = new boolean[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i <= n; i++) {
            t[i][0] = true; // sum = 0 is always possible with empty subset
        }

        for (int j = 1; j <= sum; j++) {
            t[0][j] = false; // with 0 elements, positive sum is not possible
        }

        // DP Table Filling
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;

        boolean result = subset(arr, sum);

        System.out.println("Is subset with sum " + sum + " possible? " + result);
    }
}