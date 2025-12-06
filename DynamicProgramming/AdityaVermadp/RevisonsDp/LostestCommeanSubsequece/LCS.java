package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece;

public class LCS {

    static int t[][] = new int[1001][1001];

    public static int lcsBottomUp(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Step 1: Initialize first row & column with 0
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                if(i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }

        // Step 2: Fill DP table
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                } 
            }
        }

        return t[n][m]; // answer
    }

    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "abedfhr";

        int ans = lcsBottomUp(s1, s2);
        System.out.println("LCS Length = " + ans);
    }
}
