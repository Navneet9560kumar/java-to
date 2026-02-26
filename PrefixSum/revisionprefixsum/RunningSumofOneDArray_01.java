package revisionprefixsum;

public class RunningSumofOneDArray_01 {

      public static int[] runningSum(int[] arr){
            int n = arr.length;
            int[]pre = new int[n];
            pre[0] = arr[0];
            // for(int i=1;i<n;i++){
            //       pre[i] = pre[i-1] + arr[i];
            // }
            // return pre;

             for(int i=1;i<n;i++){
                  arr[i] += arr[i-1];
            }
            return arr;
      }
      public static void main(String[] args) {
            
      }

}
