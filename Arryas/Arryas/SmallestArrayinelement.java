package Arryas;

public class SmallestArrayinelement {
      public static void main(String[] args) {
            int[]arr={5,10,3,20,15};
            int min =arr[0];
            for (int i = 0; i < arr.length; i++) {
              if(arr[i]<min)min=arr[i];    
            }
            System.out.println("The min element is " + min);
      }
}
