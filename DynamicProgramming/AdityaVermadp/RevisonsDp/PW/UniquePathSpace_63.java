package DynamicProgramming.AdityaVermadp.RevisonsDp.PW;

public class UniquePathSpace_63 {



      
       public int uniquePaths(int m, int n){ 
            int[][]dp = new int[2][n];
            for(int j=0;j<n;j++){
                  dp[0][j]=1;
                  dp[1][j]=0;
            }
            for(int i=1;i<=m-1;i++){
               //dp 
               for(int j=1;j<=n;j++){
                  dp[1][j] = dp[1][j-1] + dp[0][j];
               }
               //copy the frist row to zero row
               for(int j=1;j<n;j++){
                  dp[0][j] = dp[1][j];
                  dp[1][j]=0;
               }
            }
            return dp[1][n-1];
       }
      public static void main(String[] args) {
            
      }
}
