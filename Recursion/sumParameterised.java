import java.util.*;;

public class sumParameterised {
      public static void print(int n){
            if(n==0) return;
            System.out.println(n);
            print(n-1);
            System.out.println(n);
      }

      public static void sum(int n, int s  ){
            if(n==0){
                  System.out.println(s);
                  return;
            }
            sum(n-1,s+n);
      }

      public static void main(String[] args) {
            Scanner sc  =new Scanner(System.in);
            System.out.println("Enter the number in ");
            int n = sc.nextInt();
           sum(n,0);
            
      }
}



// mera ek function hai to sum naam ka (5,0) 0 is sum (calcute sum ) , n= number of n 
// ab second mai sum (4,5) 1 se lekar 5 aaye or 
//so sum(3,9) to kay huaa  per 3 ko call keya or 4 mai 5 add deya bas 
//same process har jagaha hoga jase (2,12) , => (1,14),=> (0,15);
// ab 0 hote hee base case ho gaya 