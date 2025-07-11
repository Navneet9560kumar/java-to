package DynamicProgramming.AdityaVermadp.LongCS;

public class PalindromePartitioningRecurisive {

   public static boolean isPalindrome(String s, int i, int j){
      while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
      }
      return true;
   }
       public static int solve(String s, int i, int j) {
            if(i>=j || isPalindrome(s, i, j))return 0;

            int ans = Integer.MAX_VALUE;
            for(int k=i;k<j;k++){
                  int temp = solve(s, i, k)+ solve(s, k+1, j)+1;
                  ans = Math.min(ans, temp);
            }
            return ans;
       }

      public static void main(String[] args) {
                 String s = "Navneet";
        System.out.println("Min cuts = " + solve(s, 0, s.length() - 1));
      }

}
