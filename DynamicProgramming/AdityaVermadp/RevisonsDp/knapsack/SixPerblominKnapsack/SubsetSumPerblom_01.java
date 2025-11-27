package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack.SixPerblominKnapsack;

public class SubsetSumPerblom_01 {

      public static boolean subset(int[]arr, int sum){
            int n = arr.length;

            boolean[][]t = new boolean[n+1][sum+1];

            for(int i=0;i<=n;i++){
                  t[i][0] = true;
            }
            for(int j=1; j<=sum;j++){
                  t[0][j] = false;

            }
            for(int i=1;i<=n;){
                  for(int j=1; j<=sum; j++){

                        if(arr[i-1]<=j){
                              t[i][j] = t[i-1][j] || t[i-1][j-arr[i-1]];
                        }else{
                              t[i][j] = t[i-1][j];
                        }
                  }
            }
            return t[n][sum];
      }
      public static void main(String[] args) {
             int[] arr = {3, 34, 4, 12, 5, 2};

        int sum1 = 9;
        int sum2 = 30;

        System.out.println("Subset with sum " + sum1 + ": " + subset(arr, sum1));
        System.out.println("Subset with sum " + sum2 + ": " + subset(arr, sum2));
      }
}
