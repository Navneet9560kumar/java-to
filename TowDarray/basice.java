 package TowDarray;

import java.util.Scanner; 

public class basice {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[3][4];
         //input number 
            for(int i=0;i<4;i++){
                  for(int j=0;j<2;j++){
                       arr[i][j] = sc.nextInt();
                  }
           }
    //output of 2D arry 
            for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 2; j++) {
                        System.out.print(arr[i][j] + " ");
                  }
                  System.out.println();
            }

           
      }
}
