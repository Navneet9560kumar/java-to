package BinarySearch;

public class Rotate_04 {

      public  int bs(int []arr,int lo, int hi, int target){
            while(lo<=hi){
                  int mid = lo + (hi-lo)/2;
                  if(arr[mid]==target) return mid;
                  else if(arr[mid]>target) hi = mid-1;
                  else lo = mid+1;
            }
            return -1;
      }

      // public int search(int[] arr, int target) {
      //       int n = arr.length;
      //       int lo=1, hi= n-2;
      //       int p= -1;
      //       while(lo<=hi){
      //             int mid = lo + (hi-lo)/2;
      //             if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
      //                   p = mid; break;
      //             }else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]){
      //                   p = mid-1; break;
      //             }
      //             else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
      //                   if(arr[mid]>arr[n-1]) lo = mid+1;
      //                   else hi = mid-1;
      //             }
      //       }
      //       if(p==-1){
      //             return bs(arr,0,n-1,target);
      //       }
      //      int left = bs(arr,0,p,target);
      //      if(left!=-1) return left;       
      //      int right = bs(arr,p+1,n-1,target);
      //      return right;
      // }

      // Method 2 

      
      public int search(int[] arr, int target){
            int n=  arr.length;
            int lo = 0, hi  =n-1;
            while(lo<=hi){
                  int mid  =  lo  + (hi-lo)/2;
                  if(arr[mid]==target)return mid;
                  else if(arr[mid]<=arr[hi]){//  i am in right sorted array(  mid to high everthing is sorted)
                        if(target>arr[mid]&& target<=arr[hi]) lo = mid+1;
                        else hi = mid-1;
                  }else{ // i am in left sorted array ( low to mid everything is sorted)
                        if(target>=arr[lo] && target< arr[mid]) hi = mid-1;
                        else lo = mid+1;  
                  }
            }
            return -1;
      }
      public static void main(String[] args) {
            int []arr = {4,5,6,7,0,1,2};
            int target = 2;
            Rotate_04 solution = new Rotate_04();
            int ans = solution.search(arr, target);
            System.out.println("Element found at index: " + ans);

      }
};

