public class LowerB {
      public static void main(String[] args) {
            int[]arr = {10,23,46,89,91,97,107,140,264};
            int n= arr.length;
            int target =50;
            int lb = n;
            int lo =0, hi= n-1;
            while (lo<=hi) {
                int mid = lo+(hi-lo)/2;
                if(arr[mid]>=target){
                  lb = Math.min(lb,mid);
                  hi = mid-1;
                }  else lo = mid +1;
            }
            System.out.println(lb);
      }
}





/// to is ka algo kuch is tarha se hoga int lw =  8;
/// while(lo<=hi){
/// mid= lo-(lo+hi)/2;
/// 
/// 
/// }