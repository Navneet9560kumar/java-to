package Arryas;

public class Reversearr {
      public static void main(String[] args) {
            int[]arr = {5,10,3,20,15};
            int n = arr.length;
            for(int i=0;i<n/2;i++){
                int temp = arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;
            }
            for(int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
      }
}
