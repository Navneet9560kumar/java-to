package Slidingwindow.revisinonslidingwindow;

public class minsubArrayLenn_03 {

      public int minSubArrLen(int target, int[]arr){
             int n = arr.length, minLen = Integer.MAX_VALUE;
             int i=0, j=0, sum=0;
             while (j<n && sum<target) {// frist window
                  sum += arr[j++];
             } 
             j--;

             while (j<n) {
                  int len = j-i+1;
                  minLen = Math.min(minLen,len);
                  i++;
                  while (j<n && sum<target) {
                        sum += arr[j++];
                  }
                  j--; 
             }
             if(minLen== Integer.MAX_VALUE)return 0;
             return minLen;
             
      }
      public static void main(String[] args) {
            
      }
}
