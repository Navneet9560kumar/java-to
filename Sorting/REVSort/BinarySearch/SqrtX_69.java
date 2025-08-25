package Sorting.REVSort.BinarySearch;

public class SqrtX_69 {
          public int mySqrt(int x){
            // return (int)(Math.sqrt(x));
            if (x < 2) return x;
            int lo = 1, hi = x / 2, ans = 0;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                if (mid == x / mid) {
                    return mid;
                } else if (mid < x / mid) {
                    lo = mid + 1;
                    ans = mid;
                } else {
                    hi = mid - 1;
                }
            }
            return ans;
          }

          public static void main(String[] args) {
            
          }
}
