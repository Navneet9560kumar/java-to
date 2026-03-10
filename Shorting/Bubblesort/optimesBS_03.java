package Shorting.Bubblesort;

public class optimesBS_03 {

      public static void print(int[] arr) {
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {
             int[] arr = { 5,4,3,2,1};
             int n = arr.length;
             for (int x = 0; x <= n-1; x++) {// n- 1 passes
                  for (int i = 0; i < n - 1-x; i++) {
                        if (arr[i] > arr[i + 1]) {
                              int temp = arr[i];
                              arr[i] = arr[i + 1];
                              arr[i + 1] = temp;
                        }
                  }
                
                 boolean flag = true;
             
                  for (int i = 0; i < n - 1-x; i++) {
                        if (arr[i] > arr[i + 1]) {
                             flag = false;
                             break;
                        }
                  }

                  if(flag== true)break;
                
                  
            }
            print(arr);

      } 

}
