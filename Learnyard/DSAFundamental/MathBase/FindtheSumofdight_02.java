package Learnyard.DSAFundamental.MathBase;

import java.util.*;

public class FindtheSumofdight_02 {
      public static void main(String[] args) {
            
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();

             n= Math.abs(n);
             int sum =0;

             while (n>0) {
                  int digit = n%10;
                  sum = sum+ digit;
                  n = n/10;
             }
             System.out.println("Sum of digit" + sum);
            
      }
}
