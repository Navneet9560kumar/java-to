package Revison;
import java.util.*;
public class preInPost {

      public static void pip(int n){
            if(n==0) return ;
            System.out.println(n);
            pip(n-1);
            System.out.println(n);
            pip(n-1);
            System.out.println(n);
      }
      public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
            System.out.println("Enter n :");
       
            int n =  sc.nextInt();
            
              
           pip(3);
      }
}
