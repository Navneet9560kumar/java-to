package BinarySearch.reversion;

public class lowerbound {
      public static void main(String[] args) {
            int[]arr ={10,23,46,91,97,97,140,264};
            int n = arr.length;
            int target= 50;
            int lb =n;
            int lo =0,hi = n-1;
            while (lo<=hi) {
                  int mid = lo+ (hi-lo)/2;
                  // upper bounnd ke leye ye or fir if(arr[mid]> target) bas ye hee karna hota hai dddd
                  if(arr[mid]>=target){
                        lb =  Math.min(lb,mid);
                        hi = mid-1;
                  }
                  else lo = mid+1;
            }
            System.out.println(lb);
      }
}
