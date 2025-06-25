package DynamicProgramming.AdityaVermadp;

public class CountSubsetWithGivenDiff {
      

          public static int countSubsetsWithGivenDiff(int[] arr, int diff){
            int n= arr.length;
            int totalSum =0;
            for(int num:arr){
                  totalSum +=num;

            }
            // abhi dekh rahe (sum +diff) is even, varana retun 0
            if((totalSum + diff) %2 !=0){
                  return 0;
            }
            int target = (totalSum +diff)/2;
// dp tablle banate hai ham is sa se 
int[][]dp = new int[n+1][target+1];
            // Initialize
            for (int i = 0; i <= n; i++) {
                  dp[i][0]=1;

            }
            //fill the dp table
            for (int i = 1 ; i <= n; i++) {
                  for (int j = 0; j <= target; j++) {
                       if(arr[i-1] <=j){
                        dp[i][j] = dp[i-1][j]+ dp[i-1][j-arr[i-1]];
                       } else{
                        dp[i][j] = dp[i-1][j];
                       }
                  }
            }
            return dp[n][target];
          }
      
      public static void main(String[] args) {
            int[]arr = {1,1,2,3};
            int diff = 1;
            int count = countSubsetsWithGivenDiff(arr, diff);

            System.out.println("count the subset with give difference = "+ count);
      }
}
