package PrefixSum;

public class ProductofArrayExcept_238 {

      // "/ = division is not  allow "

      // to ek concepet hia hai hai sefix sum arr={7,2,4,3} too ye seen hai ke sefix su =,{16,9,7,3} or iska seen hai ke ulta loop chalana hota hai 
          public int[] productExceptSelf(int[] arr){
            int n = arr.length;
            int[] pre = new int[n];
            pre[0]=1;
            for (int i = 0; i < n; i++) {
                 pre[i] = arr[i-1] * pre[i-1]; 
            }

            int[]suf = new int[n];
            suf[n-1]= 1;
            for(int i=n-2; i>=0;i--){
                  suf[i] = arr[i+1] * suf[i+1];
            }
                    int[]ans = new int[n];
                    for(int i=0;i<n;i++){
                        ans[i] = pre[i] *suf[i];
                    }

                    return ans;

          }

      public static void main(String[] args) {
            
      }
}
