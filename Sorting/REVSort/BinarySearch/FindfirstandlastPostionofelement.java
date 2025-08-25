package Sorting.REVSort.BinarySearch;

public class FindfirstandlastPostionofelement {
       public int[] searchRange(int[] arr, int target){
             int n = arr.length;
            int[]ans = {-1, -1};
             
            int lo =0, hi = n-1;
            boolean flag = false;
            while (lo<=hi) {
                  int mid = lo + (hi-lo)/2;
                  if(arr[mid]==target){
                    flag = true;
                    break;
                  }else if(arr[mid]>target) hi = mid -1;
                  else if (arr[mid]<target) lo = mid +1;
              
            }
            if(flag==false)return ans;
            lo = 0; hi = n - 1;
              int lb =n;
             lo =0; hi = n-1;
            while (lo<=hi) {
                  int mid = lo + (hi-lo)/2;
                  if(arr[mid]>target){
                        lb = Math.min(lb, mid);
                        hi = mid-1;
                  }else  lo = mid +1;
            }
             ans[0] = lb;
         return ans;


       }
}
