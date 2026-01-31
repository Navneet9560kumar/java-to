package Learnyard.DSAFundamental.ControlFlow;

public class HollowMirroredRightTriangleStarPattern_07 {
      public static void main(String[] args) {
            int n= 5;
             for(int i=0; i<n;i++){
                  for(int j=0;j<n-i-1;j++){
                        System.out.print(" ");
                  }
                  for(int j=0;j<=i;j++){
                        System.out.print(j==0 || j==i || i==n-1 ? "*" : " ");
                  }
                  System.out.println();

             
            
            }
      }
}
