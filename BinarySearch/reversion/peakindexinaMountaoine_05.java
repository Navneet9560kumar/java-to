package BinarySearch.reversion;

public class peakindexinaMountaoine_05 {
      public int peakIndexInMountainArray(int[] arr) {
            int n = arr.length;
            int lo =0, hi =n-1;
            while(lo<=hi){
                  int mid =  lo+ (hi-lo)/2;
                  if(arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) return mid;
                  else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) lo = mid+1;
                  else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi = mid-1;


            }
            return  57249; 
      }
      public static void main(String[] args) {
            int[]arr ={10,23,46,91,97,97,140,264};
           
      }
}
