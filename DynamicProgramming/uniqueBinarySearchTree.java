package DynamicProgramming;

public class uniqueBinarySearchTree {

     public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(numTrees(n));
    }
}

// to hamo ek node de rakhi hia or ham search karege or n numbeer de raha ho or usko use karke banana binary tree hamko jase maan lo n=4 hai to kitae tarha se tree bana sakte 4 nodes ka use karke ok  