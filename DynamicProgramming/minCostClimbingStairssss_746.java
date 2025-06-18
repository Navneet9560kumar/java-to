package DynamicProgramming;

public class minCostClimbingStairssss_746 {

       public static int minCost(int[] cost,int idx) {
            if(idx == 0 || idx==1) return cost[idx];
         return cost[idx] + Math.min(minCost(cost, idx-1), minCost(cost, idx-2));
    }

       public static int minCostClimbingStairs(int[] cost) {
        int n  = cost.length;
        return Math.min(minCost(cost, n-1), minCost(cost, n-2));
    }
 //this is a recuresion apporch ok anxd this the next one isa a  in this saluction come a TLE so we use a meno 
 

 //😎  this is a menoizations
  public static int minCost(int[] cost, int idx, int[] dp) {
        if (idx == 0 || idx == 1) return cost[idx];
        if (dp[idx] != -1) return dp[idx];

        return dp[idx] = cost[idx] + Math.min(minCost(cost, idx - 1, dp), minCost(cost, idx - 2, dp));
    }

    public static int minCostClimbingStairss(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = -1;

        return Math.min(minCost(cost, n - 1, dp), minCost(cost, n - 2, dp));
    }

    // yte copde jop hai vo ab tabulations per kaam kar raha hai ok thik hai 🐧🐧🐧🐧🐧🐧🐧 

       public static int minCostClimbingStairsss(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];dp[1]=cost[1];
        	for(int i=2;i<n;i++){
                dp[i]= cost[i] +Math.min(dp[i-2],dp[i-1]);
            }
        return Math.min(dp[n-2],dp[n-1]);
    }

      public static void main(String[] args) {
            
      }
}
