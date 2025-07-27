package Slidingwindow;

public class MinimumSizeSubarryasum_209 {
//        public int minSubArrayLen(int target, int[] arr) {
//       int n = arr.length, minLen = Integer.MAX_VALUE;
//       for (int i = 0; i < n  ; i++) {
//             int sum =0, j=1;
//             while (j<n &&sum<target) {
//                   sum+=arr[j++];
//             }
//             j--;
//            int len = j-i+1;
//            if(sum>=target)minLen = Math.min(minLen,len);
//       }

//       if(minLen==Integer.MAX_VALUE) return 0;
//       return minLen;
//     }// this is a brout froce saluction

    public int minSubArrayLen(int target, int[] arr){
       int n = arr.length, minLen = Integer.MAX_VALUE;
       int i=0, j=0,sum =0;
       while (j<n && sum<target) {// frist window
            sum += arr[j++];
       }
       i--;

       //sliding windown 
       while (j<n) {
            int len = j-i+1;
            minLen = Math.min(minLen,len);
            sum -= arr[i];
            i++;
            while (j<n && sum<target) {// frist window
            sum -= arr[i];
            i++;

               while (j<n && sum<target) {// frist window
            sum += arr[j++];
          }
          j--;
       }
        if(minLen==Integer.MAX_VALUE) return 0;
        return minLen;
       }

    }
    public static void main(String[] args) {
      
    }
}
