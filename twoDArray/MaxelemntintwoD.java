package twoDArray;

public class MaxelemntintwoD {
      public static void main(String[] args) {
            int[][]arr  = {{1,5,6},{2,-9,3},{5,10,3}};
            int mx = Integer.MIN_VALUE;
            int m = arr.length;
            int n = arr[0].length;
            int sum=0;
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j <n; j++) {
                        mx = Math.max(mx,arr[i][j]);// mx ke leye
                        sum +=arr[i][j];// sum nekalnw ke leye
                  }
                  
            }
            System.out.println(mx);
            System.out.println(sum);
      }
}
