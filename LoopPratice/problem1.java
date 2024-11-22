package LoopPratice;

import java.util.Scanner;

public class problem1 {

public static void problem2(){
      int num;
      long product=1L;
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      product = (num == 0 ? 0 : 1L);
      
      while (num != 0) {
            // Multiply product by the last digit of num (using modulo 10)
            product *= num % 10;

            // Remove the last digit from num by dividing it by 10
            num /= 10;
        }

        // Output the result
        System.out.println("Product of digits = " + product);



}


public static void problem3(){
      int n, num, rev = 0;

      Scanner sc = new Scanner(System.in);

      n= sc.nextInt();
      num=n;

      while (n!=0) {
            rev = (rev *10) + (n%10);

            n/=10;
            if(rev ==num){
                  System.out.println(num + "is a palidrom");
            }else {
                  System.out.println(num + "is not a palidrom");
            }
      }
}
    public static void main(String[] args) {
      //   int num, sum = 0, firstD, lastD;
      //   Scanner sc = new Scanner(System.in);
        
      //   num = sc.nextInt();

      //   lastD = num % 10;

      //   firstD = num;

      //   while (num >= 10) {
      //       num = num / 10;
      //   }
      //   firstD = num;
      //   sum = firstD + lastD;
      //   System.out.println("Sum of the first and last digit = " + sum);
      // problem2();
      problem3();

    }
}
