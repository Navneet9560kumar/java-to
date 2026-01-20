package twoDArray;

public class AddTwoMatrix_02 {
      public static void main(String[] args) {
            int[][]arr  = {{1,5,6},{2,-9,3},{5,10,3}};
            int[][]ars  = {{1,5,6},{2,-9,3},{5,10,3}};
            int m= arr.length;
            int n = ars[0].length;
            int[][] res = new int[m][n];

            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                        res[i][j] = arr[i][j] + ars[i][j];
                  }
                  
            }
            for (int i = 0; i < m; i++) {
                  for (int j = 0; j < n; j++) {
                       System.out.println([i][j]+" "); 
                  }
                  System.out.println();
            }
      }
}
