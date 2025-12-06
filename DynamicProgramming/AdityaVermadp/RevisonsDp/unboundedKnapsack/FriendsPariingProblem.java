package DynamicProgramming.AdityaVermadp.RevisonsDp.unboundedKnapsack;

import java.util.*;

public class FriendsPariingProblem {
      public static void main(String[] args) {
              Scanner  sc =  new Scanner(System.in);
              int n = sc.nextInt();
              int[] dp = new int[n+1];
            
              Arrays.fill(dp,-1);
              System.out.println(pair(n,dp));
             System.out.println(friend(n));
      }

      public static int friend(int n){
            int[]dp= new int[n+1];
            dp[1] = 1;
           if(n>1) dp[2] = 2;
           for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
           }
           return dp[n];
      }      
      public static int pair(int n, int[]dp){
            if(n<=2){
                  return n;
            } 
            return dp[n] =  pair(n-1,dp) + (n-1)*pair(n-2,dp); 
            
      }
             public static int Paths(int row, int col, Integer m , Integer n, int[][]dp){
                        if(row>=m ||  col>=n)return 1;
                        if(row==m-1 && col==n-1)return 1;
                        if(dp[row][col]!=-1)return dp[row][col];
                        int rightWays = Paths(row, col+1, m, n, dp);
                        int downWays = Paths(row+1, col, m, n, dp);
                        return dp[row][col] = rightWays + downWays;

             }
                 public static int uniquePaths(int m, int n){
                        int[][]dp = new int[m][n];
                        for(int[] row : dp)
                            Arrays.fill(row,-1);
                        return Paths(0,0,m,n,dp

                        );
                 }


                     public static int uniquePathstub(int m, int n){
                        int[][]dp = new int[m][n];
                        for(int i=0;i<m;i++){
                              for(int j=0;j<n;j++){
                                    if(i==0  || j==0) dp[i][j] =1;
                                    else dp[i][j] = dp[i-1][j] + dp[i][j-1];
                              }
                        }
                        return dp[m-1][n-1];
                 }

                  // this method in tabulation form
}

// count derangement of friends such that they can remain single or can be paired up.


// \(D(n)=(n-1)[D(n-1)+D(n-2)]\)
// formula  = n * [pair(n-1)]+ (n-1) * pair(n-2)