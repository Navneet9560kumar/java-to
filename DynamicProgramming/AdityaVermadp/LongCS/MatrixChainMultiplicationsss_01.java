package DynamicProgramming.AdityaVermadp.LongCS;

public class MatrixChainMultiplicationsss_01 {

      // ye mera resuction function 
      public static int solve(int[]arr,int i,int j){
            if(i>=j)return 0;

            int mincoast = Integer.MAX_VALUE;

            for(int k=i;k<j;k++){
                  int cost = solve(arr,i,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];

                  if(cost<mincoast){
                        mincoast =cost;
                  }
            }
            return mincoast;
      }
      
      public static void main(String[] args) {
            int[]arr= {40,20,30,10,30};
            int n = arr.length;

             int res  = solve(arr,1, n-1);
             System.out.println("Minmum multiplaction" + res);
      }
}
