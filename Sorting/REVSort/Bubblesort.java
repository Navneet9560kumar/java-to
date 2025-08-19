package Sorting.REVSort;

public class Bubblesort {

      public static void print(int[] arr) {
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {
            int[] arr = { 5,8,1,-3,8,10 };
            int n = arr.length;

            print(arr);
             // Bubble sort 1
      //     for(int x =1; x<=n-1;x++){
      //       for (int i = 0; i < n-1; i++) {
      //             if(arr[i]>arr[i+1]){
      //                   int temp = arr[i];
      //                   arr[i] = arr[i+1];
      //                   arr[i+1] = temp;
      //             }
      //       }
      //     }
      // Bubble sort 2
      //  for(int x =1; x<=n-1;x++){
      //       for (int i = 0; i < n-1-x; i++) {
      //             if(arr[i]>arr[i+1]){
      //                   int temp = arr[i];
      //                   arr[i] = arr[i+1];
      //                   arr[i+1] = temp;
      //             }
      //       }
      //     } 


           // Bubble sort optimise


            for(int x =1; x<=n-1;x++){
                         boolean flag  =true;
            for (int i = 0; i < n-1-x; i++) {
                  if(arr[i]>arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        flag = false;
                  }
            }
            if(flag==true) break;
            


      }
          print(arr);
      
}
}



// Bubble sort ek soorting algo hai ham isame 