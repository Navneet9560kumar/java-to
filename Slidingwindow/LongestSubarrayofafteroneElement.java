package Slidingwindow;

public class LongestSubarrayofafteroneElement {
      public static int longestSubarray(int[] arr) {
        int n = arr.length, i=0,j=0;
         int z =0;
         for(int ele :arr){
            if(ele==0)z++;
         }
         if(z==0) return n-1;

        int zeroes =0,maxLen =0;
        while ( i<n && arr[i]==0) {
            i++;
        }
        j=i;
        while (j<n) {
            if(arr[j]==1) j++;
            else{
                  if(zeroes==0){
                        j++;
                        zeroes++;
                  }else{
                        int len =j-i-1;
                        maxLen  =Math.max(maxLen,len);
                        j++;
                        while (i<n &&arr[i]==1) {
                              i++;
                        }
                  }
            }
            if(zeroes==1){
                  int len =j-i-1;
                        maxLen  =Math.max(maxLen,len);
            }
          
        }
        return maxLen;

    } 
      public static void main(String[] args) {
            
      }
}
