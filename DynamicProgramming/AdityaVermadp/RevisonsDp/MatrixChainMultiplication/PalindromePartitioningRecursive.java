package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

public class PalindromePartitioningRecursive {

    public static int PalindromePartitioning(String str, int i, int j) {

        // Base case 
        if (i >= j) return 0;

        // If substring is already palindrome
        if (isPalindrome(str, i, j)) return 0;

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = PalindromePartitioning(str, i, k)
                     + PalindromePartitioning(str, k + 1, j)
                     + 1;

            min = Math.min(min, temp);
        }

        return min;
    }

    private static boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "ababbbabbababa";
        int result = PalindromePartitioning(str, 0, str.length() - 1);
        System.out.println("Minimum partitions: " + result);
    }
}
