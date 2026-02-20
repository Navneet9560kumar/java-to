package Patterns.TowPointer;

public class ShortColor_05 {

      public static void swap(int[] arr,int mid,  int lo){
            int temp = arr[mid];
            arr[mid] = arr[0];
            arr[0] =temp;
      }

       public void sortColors(int[] arr) {
        int n= arr.length;
        int mid =0,hi=n-1,lo =0;

        while (mid<=hi) {
            if (arr[mid] == 0) {
                swap(arr, mid, lo);
                lo++;
                mid++;
            }else if (arr[mid] == 1) {
                mid++;
            }else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }
      public static void main(String[] args) {
            
      }
}
