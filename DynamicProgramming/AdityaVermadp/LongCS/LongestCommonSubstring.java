package DynamicProgramming.AdityaVermadp.LongCS;

public class LongestCommonSubstring {

    public static int longestCommonSubstring(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int maxLen = 0;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);  // ye ku aayi ?
                    //Because we don't know where the longest substring will occur in the grid.
// It could be anywhere in the dp table.
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        
        String s1 = "GeeksforGeeks";
        String s2 = "GeeksQuiz";
        System.out.println("Example 1:");
        System.out.println("Length of Longest Common Substring: " + longestCommonSubstring(s1, s2)); // Output: 5 ("Geeks")

        // Example 2
        s1 = "abcdef";
        s2 = "agcdhf";
        System.out.println("\nExample 2:");
        System.out.println("Length of Longest Common Substring: " + longestCommonSubstring(s1, s2)); // Output: 4 ("abcd")

        // // Example 3
        // s1 = "abc";
        // s2 = "";
        // System.out.println("\nExample 3:");
        // System.out.println("Length of Longest Common Substring: " + longestCommonSubstring(s1, s2)); // Output: 0
    }
}
