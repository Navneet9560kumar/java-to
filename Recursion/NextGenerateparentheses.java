import java.util.*;

public class NextGenerateparentheses {

      public static void printParthense(int open , int close, int n, String s){
            if(s.length()==2*n){
                  System.out.println(s);
                  return;
            }
           if(open<n) printParthense(open+1, close, n, s+"(");
          if(close<open)  printParthense(open, close+1, n, s+")");
      }
      public static void main(String[] args) {
           
      
            Scanner sc =  new Scanner(System.in);
            int n = sc .nextInt();
             printParthense(0,0,n,"");
      }
}
