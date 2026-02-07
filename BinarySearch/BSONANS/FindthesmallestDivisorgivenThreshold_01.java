package BinarySearch.BSONANS;

public class FindthesmallestDivisorgivenThreshold_01 {

       public int smallestDivisor(int[] arr, int t){
            // int n = arr.length;
            // int div =1;
            // for (int i = 0; i < n; i++) {
            //       if(arr[i]>div) div = arr[i];
            // }
            // return div; ya hamko   bata raha haitn  ke 1 se leke max element ke beech me hi answer hoga
            int n = arr.length;
            int mx = Integer.MIN_VALUE;
            for(int i =0;i<n;i++){
                  mx = Math.max(mx,arr[i]);
            }
            //  int d ;
            //  for(d=1; d<=mx; d++){
            //       int sum =0;
            //       for(int i=0;i<n;i++){

            //            if(arr[i]%d==0) sum +=arr[i]/d;
            //                else sum += arr[i]/d +1;

            //       }
            //       if(sum<=t) return d;
            //  }
            //  return d;  method 1
                  int d ;
                  int lo =1, hi = mx;
                  while(lo<=hi){
                        int mid =  lo + (hi-lo)/2;
                        if(isLess(mid,arr,t)==true){
                              d= min;
                              
                        }
                  }
             for(d=1; d<=mx; d++){
                  int sum =0;
                  for(int i=0;i<n;i++){

                       if(arr[i]%d==0) sum +=arr[i]/d;
                           else sum += arr[i]/d +1;

                  }
                  if(sum<=t) return d;
             }
             return d;  



       }
      public static void main(String[] args) {
            int[]arr = {1,2,5,9};
            int t = 6;
            FindthesmallestDivisorgivenThreshold_01 obj = new FindthesmallestDivisorgivenThreshold_01();
            System.out.println(obj.smallestDivisor(arr,t));
      }
}
