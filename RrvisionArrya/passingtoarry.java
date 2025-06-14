package RrvisionArrya;

public class passingtoarry {


public static void swap(int[] a,int[]b ) {
             
      int temp = a[0];
       a[0] = b[0];
       b[0] =temp;
      
            
      }

      public static void main(String[] args) {
    int[] a = {12};
    int[] b = {23};

    System.out.println(a[0]+ " " + b[0]);
    swap(a, b);
    System.out.println(a[0]+ " " + b[0]);

      }

}
