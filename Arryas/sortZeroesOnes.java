public class sortZeroesOnes {
      public static void main(String[] args) {
          int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
          int n = arr.length;
      //     int noOFZ = 0;
  
      //     // Count the number of zeros
      //     for (int i = 0; i < n; i++) {
      //         if (arr[i] == 0) {
      //             noOFZ++;
      //         }
      //     }
  
      //     // Fill the array with zeros and ones
      //     for (int i = 0; i < n; i++) {
      //         if (i < noOFZ) {
      //             arr[i] = 0;
      //         } else {
      //             arr[i] = 1;
      //         }
      //     }
  
      //     // Print the sorted array
      //     for (int num : arr) {
      //         System.out.print(num + " ");
      //     }
      


      // 2nd approach
      int i=0,j=n-1;
      while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            if(arr[i]==1 && arr[j]==0){
                  arr[i]=0;
                  arr[j]=1;
                  i++;
                  j--;
            }

      }
      for (int num : arr) {
            System.out.print(num + " ");
      }
}


     
}

  