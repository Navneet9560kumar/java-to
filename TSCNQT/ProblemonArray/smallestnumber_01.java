package TSCNQT.ProblemonArray;

public class smallestnumber_01 {
      public static void main(String[] args) {
            int[]arr = {1,2,3,4,5,6,7};
            int min = arr[0];   // Start with first element
            int n= arr.length;
            for(int i=1;i<n;i++){
                  // this is smalleste 
                  if(arr[i]<min){
                        min=arr[i];
                  }
                  // the largeste number is 
                     if(arr[i]>min){
                        min=arr[i];
                  }
            }
           System.out.println("Print the smallest is "+ min);
      }
}
