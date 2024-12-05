// the question is [Generate all binary string of length n without consecutive 1S]

import java.util.*;

public class Gbinarystring {

public static void printString(String s, int n){
      int m = s.length();
      if(m==n){
            System.out.println(s);
            return;
      } if(m==0 ||s.charAt(m-1)=='0'){
            printString(s+0, n);
            printString(s+1, n);
      }
      else printString(s+0, n);
}


      public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            int n = sc .nextInt();
            printString("",n);
      }
}
