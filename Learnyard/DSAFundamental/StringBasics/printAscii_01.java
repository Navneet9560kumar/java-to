package Learnyard.DSAFundamental.StringBasics;

import java.util.*;
public class printAscii_01 {

       public static void printAscii(String str){
            int sum=0;
            int n = str.length();
            for(int i=0;i<n;i++){
                  char ch = str.charAt(i);
                  int ascii = (int)ch;
                  sum += ascii;
                  System.out.println(ch + "->" + ascii);
                    
            }
             System.out.println("sum of asice is" + sum);
       }

       public static void upperlowercase(String str){
            int n = str.length();
            for(int i=0; i<n;i++){
                   char ch = str.charAt(i);
                  int ascii = (int)ch;
                  if(ascii<=96) {
                        System.out.println("This is a uppper case ");
                  }else {
                        System.out.println("This is a lower case");
                  }
            }
       }
  public static String convertupperlowercase(String str){
      int n= str.length();
             StringBuilder sb = new StringBuilder();
             for(int i=0;i<n;i++){
                  char ch = str.charAt(i);

                  if(ch>= 'a' && ch <='z'){
                        ch = (char)(ch-32);
                  }
                   sb.append(ch);
             }
              return sb.toString();
  }

      public static void main(String[] args) {
            String str = "Navneet";
            // printAscii(str);
            upperlowercase(str);
      }
}
