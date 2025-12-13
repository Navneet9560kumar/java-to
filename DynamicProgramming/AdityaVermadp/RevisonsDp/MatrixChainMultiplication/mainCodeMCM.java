package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

public class mainCodeMCM {

    public static int solve(int[] arr, int i, int j) {
        // base case: single matrix or invalid range
        if (i >= j) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        // try every possible partition
        for (int k = i; k < j; k++) {

            // calculate temp cost
            int tempAns = solve(arr, i, k)
                        + solve(arr, k + 1, j)
                        + arr[i - 1] * arr[k] * arr[j];

            // update minimum
            if (tempAns < min) {
                min = tempAns;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;

        int ans = solve(arr, 1, n - 1);
        System.out.println("Minimum number of multiplications: " + ans);
    }
}
