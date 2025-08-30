package Revison;

import java.util.List;
import java.util.Scanner; 

public class GenerateParentheses {


      public static  void generateParenthesis(int open, int close, int n, String s) {
            if(s.length()==2*n){
                  System.out.println(s);
                  return;
            }
       if(open<n)generateParenthesis(open+1, close, n, s+ "(");
       if(close<open)generateParenthesis(open, close+1, n, s+ ")");
    }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            generateParenthesis(0,0,n,"");
      }
}
