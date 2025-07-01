package RrvisionArrya;

import Pattern.Scanner;

public class productarrya {

      private static long calculateProduct(int[] arr){
            int n= arr.length;
            int productcount =1;
            for (int i = 0; i <n; i++) {
                  productcount *= arr[i];
            }
            return productcount;
      }


       public static  int secoundlargest(int[]arr){
            int n= arr.length;
            if(n<2){
                  return -1; // Not enough elements
            }
            int frist = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                  if(arr[i]>frist){
                        second = frist;
                        frist = arr[i];
                  }else if(arr[i]>second && arr[i]!=frist){
                        second = arr[i];
                  }
            }
            return second;
       }

//😎😎😎😎😎 

 public static int findMinValue(int[] arr){
      if(arr == null || arr.length == 0){
            return Integer.MAX_VALUE; // or throw an exception
      }
      int minval = arr[0];
      for (int i = 1; i < arr.length; i++) {
            if(arr[i]<minval){
                  minval = arr[i];
            }
            
      }
      return minval;
 }

      public static void main(String[] args) {
            // int []arr = {1, 2, 3, 4, 5};
            // long product = calculateProduct(arr);
            // System.out.println("The product of the array elements is: " + product);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int n =  sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                  arr[i] = sc.nextInt();
            }
            // finding a missing number in the arrya 
            int missing  =1;
            for (int i = 0; i < n; i++) {
                  if(arr[i]==missing){
                        missing++;
                  }else if(arr[i]>missing){
                        break;
                  }
            }
            System.out.println("Missing number in the array is: " + missing);
      }
}
