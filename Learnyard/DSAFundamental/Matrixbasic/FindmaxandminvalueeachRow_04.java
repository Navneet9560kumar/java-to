package Learnyard.DSAFundamental.Matrixbasic;

public class FindmaxandminvalueeachRow_04 {
      public static void main(String[] args) {
          int[][] arr = {
    {3,8,1},
    {4,6,9},
    {7,2,5}
};

int n = arr.length;
int m = arr[0].length;

for(int i = 0; i < n; i++){
    
    int min = arr[i][0];
    int max = arr[i][0];
    
    for(int j = 1; j < m; j++){
        if(arr[i][j] < min){
            min = arr[i][j];
        }
        if(arr[i][j] > max){
            max = arr[i][j];
        }
    }
    
    System.out.println("Row " + i + 
        " -> Min = " + min + 
        ", Max = " + max);
}
      }
}
