package Pattern;

import java.util.Scanner;

public class specila {

      public static void starpre() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n : ");
            int n = sc.nextInt();
            int mid = n / 2 + 1;
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= n; j++) {
                        if (i == mid || j == mid) {
                              System.out.print("*" + " ");
                        } else {
                              System.out.print(" " + " ");
                        }
                  }
                  // Move to the next line after each row
                  System.out.println();
            }

      }

      public static void crouse() {
            // method body
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n : ");
            int n = sc.nextInt();
            int mid = n / 2 + 1;
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= n; j++) {
                        if (i == j || i + j == n + 1) {
                              System.out.print("*" + " ");
                        } else {
                              System.out.print(" " + " ");
                        }
                  }
                  // Move to the next line after each row
                  System.out.println();
            }

      }

      public static void ZeroOne() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n : ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= i; j++) {
                   if(i%2==1){
                    if(j%2==1) System.out.print(1+ " ");
                    else System.out.print(0+ " ");
                   }
                   else {
                        if(j%2==0)System.out.print(1 + " ");
                        else System.out.print(0 + " ");
                   }
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter n : ");
            // int n = sc.nextInt();
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(2*j-1 + " ");
            // }
            // System.out.println();
            // }
            // starpre();
            // crouse();
            ZeroOne();
      }
}
