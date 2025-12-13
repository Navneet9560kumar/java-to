package Arryas;

public class Minele {
      public static void main(String[] args) {
              int[] arr = {5, 10, 3, 20, 15};

        int min = arr[0];   // assume first element is minimum
            for (int i = 1; i < arr.length; i++) {
                  if(arr[i]<min){
                        min=arr[i];
                        System.out.println("min ele is " + min);
                  }
            }
            System.out.println("min ele is " + min);
      }
}
