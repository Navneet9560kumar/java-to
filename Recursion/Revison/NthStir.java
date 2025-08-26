package Revison;

import java.util.*;
public class NthStir {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n :");
            int n =  sc.nextInt();
            System.out.println(stare(n));
      }

      private static int stare(int n) {
            if(n<=2) return n;
           return stare(n-1) + stare(n-2);
      }
}
