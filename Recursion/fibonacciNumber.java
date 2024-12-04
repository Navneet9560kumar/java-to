import java.util.Scanner;

public class fibonacciNumber {

      public static int fibo(int n) {
            if (n <= 1)
                  return n;
            return fibo(n - 1) + fibo(n - 2);
      }



      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the base : ");
            int n = sc.nextInt();
            System.out.println(fibo(n));
      }
}


// so the thing is a ham fab nkela rahe hai ok  to iske kaam karte hai 