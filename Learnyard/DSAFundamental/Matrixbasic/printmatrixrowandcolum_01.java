package Learnyard.DSAFundamental.Matrixbasic;

public class printmatrixrowandcolum_01 {
      public static void main(String[] args) {
          int[][] arr = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
};

//row waish
            int m =arr.length;
            int n =  arr[0].length;
            for(int i=0;i<m;i++){
                  for(int j=0;j<n;j++){
                        System.out.print(arr[i][j]+ " ");
                  }
                  System.out.println();
            }
            //colum wish 

             for(int i=0;i<n;i++){
                  for(int j=0;j<m;j++){
                        System.out.print(arr[i][j]+ " ");
                  }
                  System.out.println();
            }

      }

     
      
}
