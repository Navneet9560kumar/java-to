package Revison;

import java.util.*;

public class PowwrLiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int a = sc.nextInt();
        System.out.println("Enter exponent : ");
        int b = sc.nextInt();
        System.out.println("Result: " + power2(a, b));
    }

//     private static int power(int a, int b) {
//        if(a==0 && b==0){
//             System.out.println("Not Defined");
//             return -1;
//        }
//         if (b == 0) return 1;
//         return a * power(a, b - 1);
//     }

      private static int power2(int a, int b) {
       if(b==0)return 1;
       int ans = power2(a,b/2);
       if(b%2==0)return ans *ans;
       else return ans *ans *a;
    }
}
