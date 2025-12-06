package DynamicProgramming.AdityaVermadp.RevisonsDp.PW;

public class CountSquareSubmatrices_1277 {
      
          public int countSquares(int[][] arr){
            int m = arr.length, n = arr[0].length, count=0;
            for(int i=0;i<m;i++){
                  for(int j=0;j<n;j++){
                        if(arr[i][j]==0) continue;
                        if(i>0 && j>0){
                              if(arr[i][j] == 1){
                                    arr[i][j] += Math.min(arr[i-1][j], Math.min(arr[i][j-1], arr[i-1][j-1]));
                              }
                              
                        }
                  }
            }
            return count;
          }

          public static int min(int a, int b, int c){
                return Math.min(a, Math.min(b,c));
          }
      
      
      public static void main(String[] args) {
            
      }
}
