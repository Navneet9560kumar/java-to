package DynamicProgramming.AdityaVermadp.RevisonsDp.PW;

public class PerfectSquares_279 {


       public static boolean isperfect(int n){
                        int sqrt = (int)Math.sqrt(n);
                        return (sqrt*sqrt)==n;
                  }   

       public static int numSquares(int n){
                  // if(n<0) n = -n;

                  // int res =n;
                  // for(int i=1;i<n;i++)
                  //       res +=n;
                  //       return res;

                 
                  if(isperfect(n)) return 1;
                  int min = Integer.MAX_VALUE;
                  for(int i=1;i<=n/2;i++){
                        int count = numSquares(i)+ numSquares(n-i);
                        min = Math.min(min,count);
                  }
                  return min;      
                        
       }
       // second approach
       public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;   // negative numbers perfect square nahi hote

        int root = (int)Math.sqrt(n);
        return root * root == n;
    }
      public static void main(String[] args) {
             for (int n = 1; n <= 5; n++)
            System.out.println("n = " + n
                               + ", n^2 = " + numSquares(n));
      }
}
