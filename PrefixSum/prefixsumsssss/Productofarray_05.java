package prefixsumsssss;

public class Productofarray_05 {
         public int[] productExceptSelf(int[] arr){
            int n = arr.length;
            int [] pre = new int[n];
            pre[0] =1;
            for (int i = 1; i < n; i++) {
                  pre[i]=  arr[i-1]* pre[i-1];
            }
            int[]suf = new int[n];
            suf[n-1] =1;
            for (int i = n-2; i >=0; i--) {
                  suf[i] = arr[i+1] * suf[i+1];
            }
            int[]ans = new int[n];
             for (int i = 1; i < n; i++) {
                  ans[i]=  pre[i]* suf[i];
            }
            return ans;
         }

  
 // Suffix Sum ka matlab hota hai array ke kisi index se le kar
//  end tak ka sum.
//Simple shabdon mein, peeche se jodna 
// Suffix sums:
// index 0 se end: 2 + 4 + 6 + 8 = 20
// index 1 se end: 4 + 6 + 8 = 18
// index 2 se end: 6 + 8 = 14
// index 3 se end: 8 = 8
// utlaat loop chlana ko prefix sum khate hai suf[i] = arr[i] + suf[i+1];



         public static void main(String[] args) {
            
         }
}
