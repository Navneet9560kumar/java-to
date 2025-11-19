package revisionprefixsum;

public class MinimumPenaltyforShop {

      public int bestClosingTime(String str) {
        
            int n = str.length();   
            int [] pre = new int[n+1];
            for(int i=1;i<=n;i++){
                  pre[i] = pre[i-1];
                  if(str.charAt(i-1)=='N')pre[i] += 1;

            }
            int [] suf = new int[n+1];
            for(int i=n-1;i>=0;i--){
                  suf[i] = suf[i+1];
                  if(str.charAt(i)=='Y')suf[i] += 1;
            }
            int[]prnalty = new int[n+1];
            for(int i=0;i<=n;i++){
                  prnalty[i] = pre[i] + suf[i];
            }
    }
      public static void main(String[] args) {
            
      }
}
