package BinarySearch.reversion;

public class sort_06 {
      public static int mySqrt(int x){
            int lo=0, hi = x;
            while(lo<=hi){
                  int mid = lo+ (hi-lo)/2;
                  if(mid*mid==x) return mid;
                  else if(mid*mid>x) hi = mid-1;
                  else if(mid*mid<x) lo = mid+1;
            }
            return lo-1;
      }
      public static  void main(String[]args){

      }

}
 