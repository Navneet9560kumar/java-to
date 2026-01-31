package Learnyard.DSAFundamental.ControlFlow;

public class HollowSquareStarPatternWithDiagonal {
      public static void main(String[] args) {
            int n = 5; // Size of the square
            for(int i =0; i<n;i++){
                  for(int j=0;j<n;j++){
                   if(i==0 || i ==n-1||j==0 || j==n-1 || i==j || j==(n-1-i)){
                              System.out.print("*");
                        }else{
                              System.out.print(" ");
                        }
                  }
                  System.out.println();
            }
      }
}
