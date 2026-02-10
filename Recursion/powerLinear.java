import java.util.Scanner;

public class powerLinear {

public static void print(int n){
      if(n==0) return;
      System.out.println( "Enter the number");
      print(n-1);
      System.out.println("n");

}

public static int  pow(int a, int b){
      if(a==0 || b==0){ 
      System.out.println("Not Defined");
      return -1;
      }
      if(b==0) return 1;
     return a * pow(a,b-1);

}

public static int  pow2(int a, int b){
      if(b==0) return 1;
      int ans = pow2(a,b/2);
      if(b%2==0)return ans;
      else return ans*ans;
   

}

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the base : ");
            int a = sc.nextInt();
            System.out.println("Enter power ");
            int b = sc.nextInt();
            System.out.println("Enter the number of b "+ " is" + pow2(a,b));
      }
}
