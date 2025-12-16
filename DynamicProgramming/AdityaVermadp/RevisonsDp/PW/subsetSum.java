package DynamicProgramming.AdityaVermadp.RevisonsDp.PW;

public class subsetSum {
      
      public static void main(String[] args) {
            int[]arr = {2,3,5,6,8,10};
            int target = 10;
            int[][] dp= new int[arr.length+1][target+1];
            for(int i=0;i<=arr.length;i++){
                  for(int j=0;j<=target;j++){
                        dp[i][j]=-1;
                  }
            }
            System.out.println(subset(0,0,arr,target,dp));
      }

      public static boolean subset(int i, int sum, int[]arr, int target, int[][] dp) {
            if(i==arr.length){
                   if(sum == target) return true;
            else return false;
            }
            if(dp[i][target]!=-1){
                  return dp[i][target]==1?true:false;
            }
            boolean ans= false;
            boolean skip = subset(i+1, sum, arr, target, dp);
           if(target-arr[i]<0) {
                  ans = skip;
           }
           boolean pick =  subset(i+1, sum+arr[i], arr, target,dp);
       
             return pick || skip;
      }
}
