package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

public class MatrixChainMultiplsionResu {

    public static int slove(int[] arr, int i, int j) {

        // Base condition
        if (i >= j) return 0;

        int min = Integer.MAX_VALUE;

        // Try all possible partitions
        for (int k = i; k <= j - 1; k++) {
            int temp = slove(arr, i, k)
                     + slove(arr, k + 1, j)
                     + arr[i - 1] * arr[k] * arr[j];

            min = Math.min(min, temp);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(slove(arr, 1, arr.length - 1));
    }
}
