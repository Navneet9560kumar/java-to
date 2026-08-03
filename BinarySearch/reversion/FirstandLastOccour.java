package BinarySearch.reversion;

public class FirstandLastOccour {

      public int [] searchRange(in t[]arr, int target){
            int n = arr.length;
            int[]ans =  new int[2];

            // first postions 
             int fp =-1;
             int lo=0, hi = n-1;
             while(lo<=hi){
                  int mid  = lo + (hi-lo)/2;
                  if(arr[mid]== target){
                        if(arr[mid]==arr[mid-1])hi = mid-1;
                        else{
                              fp = mid;
                              break;
                        } 
             }else if(arr[mid]<target) lo = mid +1;
             else if(arr[mid]>target)hi = mid-1;
            }
             
      }
      public static void main(String[] args) {
            int[]arr ={10,23,46,91,97,97,140,264};
            int target =8;
            int n = arr.length;
            int start =0, end =n-1;

            while (start<=end) {
                  int mid = start+ (end -  start)/2;

                  if(arr[mid]>=target){
                        start = Math.min(start, mid);
                        end = mid-1;
                  }else if(arr[mid]> target){
                        start =  Math.min(start, mid);
                        end = mid-1;
                  }
                  else start = mid+1;
            }
            System.out.println(start);


      }
}
