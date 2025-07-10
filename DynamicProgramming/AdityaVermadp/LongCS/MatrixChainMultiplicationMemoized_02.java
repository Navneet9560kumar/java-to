package DynamicProgramming.AdityaVermadp.LongCS;

import java.util.Arrays;

public class MatrixChainMultiplicationMemoized_02 {


       static int[][] dp;
       static int[][] bracket;

       // Memoized function 

       public static   int slove(int[]arr,int i, int j){
            if(i==j) return 0;
            if(dp[i][j] != -1) return dp[i][j];

            int mincost = Integer.MAX_VALUE;

            for(int k=i;k<j;k++){
                  int cost = slove(arr,i,k)+slove(arr, k+1, j)+ arr[i+1]*arr[j];

                  if(cost< mincost){
                        mincost =cost;
                        bracket[i][j] = k;
                  }
            }
            return dp[i][j] = mincost;
       }
            
       // Recursive function to build parenthesis string
    static void printOptimalParenthesis(int i, int j, int[][] bracket, char[] name, StringBuilder sb) {
        if (i == j) {
            sb.append(name[i - 1]);
            return;
        }

        sb.append("(");
        printOptimalParenthesis(i, bracket[i][j], bracket, name, sb);
        printOptimalParenthesis(bracket[i][j] + 1, j, bracket, name, sb);
        sb.append(")");
    }


      public static void main(String[] args) {
              int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;

        dp = new int[n][n];
        bracket = new int[n][n];

        for (int[] row : dp) Arrays.fill(row, -1);

        int minCost = slove(arr, 1, n - 1);
        System.out.println("Minimum multiplication cost: " + minCost);

        // A, B, C, D,...
        char[] name = new char[n - 1];
        for (int i = 0; i < n - 1; i++) {
            name[i] = (char) ('A' + i);
        }

        StringBuilder sb = new StringBuilder();
        printOptimalParenthesis(1, n - 1, bracket, name, sb);

        System.out.println("Optimal order: " + sb.toString());
      }
}
