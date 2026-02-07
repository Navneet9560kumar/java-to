package BinarySearch;

public class SqrtX_03 {


       public static int mySqrt(int x){
                  int lo =0, hi=x;
                  while (lo<=hi) {
                       int mid = lo + (hi - lo) / 2;
                       if(mid*mid==x)return mid;
                       else if(mid*mid>x)hi = mid-1;
                           else if(mid*mid<x)lo = mid+1; 
                  }
                  return hi;
       }
      public static void main(String[] args) {
            
      }
}
