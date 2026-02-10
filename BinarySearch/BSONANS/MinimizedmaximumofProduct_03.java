package BinarySearch.BSONANS;

public class MinimizedmaximumofProduct_03 {




      public static boolean isPossible(int[] arr,int maxQ,int n){
           int store = 1;
       
           for (int i = 0; i < arr.length; i++) {
              if(arr[i]%maxQ==0){
                    store += arr[i]/maxQ;
           }else{
                 store += arr[i]/maxQ + 1;      
           }
           if(store>n)return false;
      }
     return true;
      }

      // Aggressive cows type question, koko eating banana, min type to complete trip;

      public static int minimizedMaximum(int n, int[] arr){
            int m = arr.length;
            int mx = Integer.MIN_VALUE;
            int lo =1;
            int hi= mx;
            for(int i=0; i<m;i++){
                  mx = Math.max(mx,arr[i]);
            }
            int maxAns = 0;
            while (lo<=hi) {
                  int mid = lo + (hi-lo)/2;
                  if(isPossible(arr,mid,n)){
                        maxAns = mid;
                        hi = mid-1;
                  }else{
                        lo = mid+1;
                  }
            }
            return maxAns;
            

      }
      public static void main(String[] args) {
            
      }
}
