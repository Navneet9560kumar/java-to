package RrvisionArrya;

public class Rotatearr {

      public static void print(int[]arr){
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();
      }
      public static void main(String[] args) {
            int[]arr = {2,3,4,7,9,11,13,17};
            int n = arr.length;
            print(arr);
            int i=0, j= n-1;
            while (i<j) {
                  int temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                  i++;
                  j--;
            }

      }
}
