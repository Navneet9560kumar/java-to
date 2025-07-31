public class MaximumsumSubarraysizek {
    public static void main(String[] args) {
        int[] arr = {10, 20, 1, 3, -40, 80, 10};
        int k = 2;
        int n = arr.length;

        if (k <= 0 || k > n) {
            System.out.println("Invalid value of k.");
            return;
        }

        int i = 0, j = k - 1, sum = 0;

        // First window
        for (int a = i; a <= j; a++) {
            sum += arr[a];
        }

        int maxSum = sum;

        // Slide the window
        i++;
        j++;
        while (j < n) {
            sum = sum - arr[i - 1] + arr[j];
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }
}
