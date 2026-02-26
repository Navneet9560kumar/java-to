package Learnyard.DSAFundamental.MathBase;

import java.util.*;

public class Revese_03 {
      public static void main(String[] args) {
            //  Scanner sc = new Scanner(System.in);
            //  System.out.println("Enter the number ");
            //  int num= sc.nextInt();

            //  int ori =num;
            int num = 2345;
             int rev =0;

             while (num!=0) {
                  int digit = num%10;
                  rev= rev*10+digit;
                  num = num/10;
             }
             System.out.println("Reverse the number " + rev);
      }
}
