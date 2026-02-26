package Learnyard.DSAFundamental.MathBase;

public class Palindrome_04 {



      public static void main(String[] args) {
            int n = 121;
                 int original = n; 
            int rev =0;
            boolean m = true;
            while (n!=0) {
                  int dig  = n%10;
                  rev = rev*10+dig;
                  n= n/10;

                  if(original == n){
                     System.out.println("This is a palidrom" + rev);
                  }else{
                        System.out.println("Not is not palidrom");
                  }

            }
      }
}
