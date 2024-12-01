import java.util.*;



public class printIncreasing {
      
static int n;


public static void print(int x){
      if(x>n)return;// base case 
      System.out.print(x);//work
      print(x+1); // call 
}


      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n ");
             n = sc.nextInt();
            print(1);
      }
}
