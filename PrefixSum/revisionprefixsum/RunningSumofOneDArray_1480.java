package revisionprefixsum;

public class RunningSumofOneDArray_1480 {

      public static int[] runningSum(int[] arr){
            int n = arr.length;
            int[]pre = new int[n];
            pre[0] = arr[0];
            for(int i=1;i<n;i++){
                  pre[i] = pre[i-1] + arr[i];
            }
            return pre;
      }
      public static void main(String[] args) {
            
      }

}
