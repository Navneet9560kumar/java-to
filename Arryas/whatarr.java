import java.util.*;

public class whatarr {
      public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            // System.out.println("hee ");
            int[] y = new int[5];
            // y[0] = 10;
            // y[1] = 20;
            // y[2] = 30;
            // y[3] = 40;
            // y[4] = 50;
            // and the input loop is 
            for(int i=0;i<=y.length;i++){
                  y[i] = sc.nextInt();// yaha keybord se input le rahe hai 
            }
            // for this loop for the output 
            for (int i = 0; i <= y.length; i++) {
                  System.out.println(y[i] + " "); // ham sare aarya ek bar mai hee print kar rahe hai
            }
      }
}

// i have to store a collection of same data type variable thaen i use a arrya
// int[]y =new int[5]; to ye huaa ke new 5 box aa gaye hai aapne aap