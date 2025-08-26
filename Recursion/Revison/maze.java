package Revison;
import java.util.*;
public class maze {

      public static int maze(int row, int col, int n, int m){
            if(row==m || col==n) return 1;
            // if(row==m && col==n) return 1;
            // if(row>m || col>n)return 0;
            int rigthmaze = maze(row, col+1,n,m);
            int downWays = maze(row+1,col, m,n);
            return rigthmaze + downWays;
      }


      public static void main(String[] args) {
                 Scanner sc = new Scanner(System.in);
            System.out.println("Enter n :");
       
            int n =  sc.nextInt();
                System.out.println("Enter m :");
            int  m=  sc.nextInt();
              
            System.out.println(maze(1,1,m,n));
      }
}
