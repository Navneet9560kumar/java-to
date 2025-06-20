package DynamicProgramming;

import java.util.*;


public class FriendPairingProblom {


      // you are given a  number 'n' desting that there are n friend Find out the number of ways in du  persion can either pairuo or st ay single


      public static void main(String[] args) {
            Scanner sc = new  Scanner(System.in);
            int n= sc.nextInt();
            int[]dp = new int[n+1];
            Arrays.fill(dp,-1);
            System.out.println(pair(n, dp));

            System.out.println(friend(n));
      }
      

      private static int friend(int n) {
            int []dp = new int[n+1];
            dp[1] = 1;
          if(n>1)  dp[2] = 2;
            for (int i = 0; i < n; i++) {
                  dp[i] = dp[i-1]+dp[i+2];

            }
                  return dp[n];
      }


      private static int pair(int n , int[]dp) {
            if(n <= 2) return n;
            if(dp[n]!=-1)return dp[n];
            return pair(n - 1,dp) + (n - 1) * pair(n - 2,dp);
      }
}


// count Derangement perblom slove karni hai ok 
// leetcode  70 doit  Rercusion Tabulations 