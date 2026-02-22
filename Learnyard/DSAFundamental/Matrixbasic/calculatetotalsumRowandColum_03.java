package Learnyard.DSAFundamental.Matrixbasic;

public class calculatetotalsumRowandColum_03 {
      public static void main(String[] args) {
            int[][] arr = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};

int m = arr.length;
int n = arr[0].length;

      for (int i = 0; i < m; i++) {
              int rowSum = 0;
            for (int j = 0; j < n; j++) {
                       rowSum += arr[i][j];
            }
      }
      for(int j = 0; j < m; j++){
    int colSum = 0;
    for(int i = 0; i < n; i++){
        colSum += arr[i][j];
    }
    System.out.println("Column " + j + " Sum = " + colSum);
}
      }
}
