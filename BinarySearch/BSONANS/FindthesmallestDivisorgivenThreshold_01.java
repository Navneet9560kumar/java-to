package BinarySearch.BSONANS;

public class FindthesmallestDivisorgivenThreshold_01 {

      public int smallestDivisor(int[] arr, int t) {
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            int d = 1;
            for (int i = 0; i < n; i++) {
                  mx = Math.max(mx, arr[i]);
            }

            for (int d1 = 1; d1 <= mx; d1++) {
                  int sum = 0;
                  for (int i = 0; i < n; i++) {
                        if (arr[i] % d1 == 0)
                              sum += arr[i] / d1;
                        else
                              sum += arr[i] / d1 + 1;
                  }
                  if (sum <= t)
                        return d1;

            }
            return d;

      }

     public boolean isLess(int d, int[] arr, int t) {
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
        // ceil(arr[i] / d)
        sum += (arr[i] + d - 1) / d;

        // optional early stop (optimization)
        if (sum > t) return false;
    }

    return true;
}


      public int smallestDivisorsss(int[] arr, int t) {
            int n = arr.length;
           
            int lo = 1, hi = mx;
            while (lo<=hi) {
                  int mid = lo + (hi -lo)/2;
                  if(isLess(mid,arr,t)==true){
                        d= mid;
                        hi = mid-1;

                  }else{
                        lo = mid+1;
                  }
            }
            return d;

      }

      public static void main(String[] args) {
            int[] arr = { 1, 2, 5, 9 };
            int t = 6;
            FindthesmallestDivisorgivenThreshold_01 obj = new FindthesmallestDivisorgivenThreshold_01();
            System.out.println(obj.smallestDivisor(arr, t));
      }
}
