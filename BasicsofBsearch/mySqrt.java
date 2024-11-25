public class mySqrt {

      // public static void mySqrtsss(){
      // int[] x ={1,2,3,4,5,6,7,8,90};
      // // return (int)(Math.sqrt(x));// ye ho jata hai per isko use nahi karege ham
      // or to or new method se karege aaram se (Newton raphson method)
      // // int lo=0, int hi=x;
      // // while(lo<=hi){
      // // int mid = lo+(hi-lo)/2; yen ham nahi kar sakte hai ab sabke isake badale
      // ham ab
      // // int mid = (lo + hi)/2;
      // // if(mid*mid==x) return mid;

      // }
      // }

      public int bs(int[] arr, int lo, int hi, int target) {
            while (lo <= hi) {
                  int mid = lo + (hi - lo) / 2;
                  if (arr[mid] == target)
                        return mid;
                  else if (arr[mid] > target)
                        hi = mid - 1;
                  else
                        lo = mid + 1;
            }
            return -1;
      }

      public int search(int[] arr, int target) {
            int n = arr.length;
            if (n <= 2) {
                  for (int i = 0; i < n; i++) {
                        if (arr[i] == target)
                              return i;
                  }
                  return -1;
            }

            int lo = 0, hi = n - 1;
            int p = -1;

            while (lo <= hi) {
                  int mid = lo + (hi - lo) / 2;
                  boolean isLeftValid = mid - 1 >= 0;
                  boolean isRightValid = mid + 1 < n;

                  if ((!isLeftValid || arr[mid] > arr[mid - 1]) &&
                              (!isRightValid || arr[mid] > arr[mid + 1])) {
                        p = mid;
                        break;
                  } else if (isLeftValid && arr[mid] < arr[mid - 1]) {
                        p = mid - 1;
                        break;
                  } else if (isRightValid && arr[mid] < arr[mid + 1]) {
                        if (arr[mid] > arr[n - 1])
                              lo = mid + 1;
                        else
                              hi = mid - 1;
                  }
            }

            if (p == -1) {
                  // Array was never rotated
                  return bs(arr, 0, n - 1, target);
            }

            // Search in both halves
            int left = bs(arr, 0, p, target);
            if (left != -1)
                  return left;
            return bs(arr, p + 1, n - 1, target);
      }



public static void main(String[] args) {
      int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 90 };
      int target = 10;

      // return (int)(Math.sqrt(x));// ye ho jata hai per isko use nahi karege ham or
      // to or new method se karege aaram se (Newton raphson method)
      // to iska ye dry run code jo hai vo aasa hoga ke if(m squre 2==x) rteurn m;
      // else if(m squre 2>x) hi = m-1;
      // else if(m squre 2<x) lo = m+1;
}
}
