package RrvisionArrya;

public class Reversearr {

      public static void print(int[]arr){
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }

            public static void swap(int[]a,int i, int j){
                  int temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
            }

      public static void main(String[] args) {
            int[] arr = {2,3,5,7,9,11,13,17};
            //  int[] brr = {2,3,5,7,9,11,13,17};
            int n =  arr.length;
            print(arr);
            int i=0, j= n-1;
            while (i<j) {
               swap(arr, i, j);
                  i++;
                  j--;
            }
            print(arr);
      }
}
