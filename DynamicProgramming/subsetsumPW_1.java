package DynamicProgramming;

import TreePW.boolen;

public class subsetsumPW_1 {
      public static void main(String[] args) {
            int []arr = {8,5,2,4};
            int target = 9;
             int[][]dp = new int[arr.length+1][target+1];
             for (int i = 0; i < dp.length; i++) {
                  for (int j = 0; j < dp.length; j++) dp[i][j] =-1;

                  System.out.println(subset(0, i, arr, target));
                        
                  
                  }

             }
           
      

      private static boolean subset(int i, int sum, int[] arr, int target) {
            
            if(i==arr.length){
                  if(i==arr.length && sum==target) return true;
                 else return false;
            }
            boolean pick = subset(i+1, sum+ arr[i], arr, target);
            if(sum+arr[i]>target) return pick; // If picking exceeds target, skip further checks(agr negative number de rakhe ho to is ko nahi karna hai  + hoga to hee lena hai / )
            boolean notPick = subset(i+1, sum, arr, target);
            return pick || notPick;
      }
}
