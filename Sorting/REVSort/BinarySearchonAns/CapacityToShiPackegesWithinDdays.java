package Sorting.REVSort.BinarySearchonAns;

public class CapacityToShiPackegesWithinDdays {
       public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
            int sum =0, mx =Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                  mx = Math.max(mx, arr[i]);
                  sum += arr[i];
            }
            int lo = mx,  hi = sum , minC =sum;
            while (lo<=hi) {
                  int mid = lo + (hi-lo)/2;
                  if(isPossible(mid, arr, d)== true){
                        minC =  mid;
                        hi = mid -1;
                  }
                  else lo = mid +1;
            }
            return minC;
    }
}
