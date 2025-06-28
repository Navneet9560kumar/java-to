package DynamicProgramming.AdityaVermadp.unboundedKnapsack;

public class Coinechageproblem_15 {

      
    public static int countWays(int[] coins, int N) {
      // base case 
    int n= coins.length;
    int[][]t = new int[n+1][N+1];

    // Base condision Initializations
    for (int i = 0; i <n; i++) {
      t[i][0]=1;
    }
      for(int i=1;i<=n;i++){
            for(int j=1;j<=N;j++){
                  if(coins[i-1]<=j){
                   t[i][j] = t[i][j - coins[i - 1]] + t[i - 1][j];

                  }else{
                        t[i][j] = t[i-1][j];
                  }
            }
      }
      return t[n][N];
    }
      public static void main(String[] args) {
            int[] coins = {1, 2, 3, 4,5,6};
        int sum = 5;

        int ways = countWays(coins, sum);
        System.out.println("Number of ways to make change: " + ways); // Output: 4
      }
}
