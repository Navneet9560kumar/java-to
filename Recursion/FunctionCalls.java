import java.util.*;

public class FunctionCalls {


      // public static void Mango() {
      //       System.out.println("Hi i am in Mango ");
      // }



      // public static void banana() {
      //       System.out.println("Hi i am in banana ");
      //       Mango();
      // }



      // public static void apple() {
      //       banana();
      //       System.out.println("Hi i am in apple ");
      //       Mango();
            
      // }
      public static int fact(int n){
            if(n==1)return 1;// base case 
            int ans  =  n * fact(n-1);// call 
            return ans;
      }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n= sc.nextInt();
          System.out.println(fact(n));
      }
}
