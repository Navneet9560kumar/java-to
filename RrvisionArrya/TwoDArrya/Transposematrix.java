package RrvisionArrya.TwoDArrya;

public class Transposematrix {
      public static void main(String[] args) {
            // 1 2
            //3 4
            // 5 6
            int[][]arr = {{1,2},{3,4},{5,6}};
            int m = arr.length, n = arr[0].length;
            // for (int i = 0; i < m; i++) {
            //       for (int j = 0; j < n; j++) {
            //             System.out.print(arr[i][j] + " ");
            //       }
            //       // System.out.println(); // row wish printing hai 
            // }
               for (int j = 0; j < m; j++) {
                  for (int i = 0; i < n; i++) {
                        System.out.print(arr[i][j] + " ");// loop change karne se column wise printing ho raha hai
                  }
                  System.out.println(); // column wise printing hai


                  //storing 
                  int [][] tranpose = new int[n][m];
                  for (int i = 0; i < m; i++) {
                        for (int k = 0; k < n; k++) {
                              tranpose[k][i] = arr[i][k];
                              
                        }
                        
                  }
            }
      }
}
