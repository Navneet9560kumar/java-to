package TSCNQT.ProblemonArray;

public class SecondsmallestandLargest_02 {
      public static void main(String[] args) {
            int []arr= {1,2,3,4,5,6};
            int n= arr.length;
            int first = Integer.MAX_VALUE;
            int second = Integer.MAX_VALUE;

            for(int i=0; i<n;i++){
                  if(arr[i]<first){
                        second =first;
                        first =arr[i];
                  }else if (arr[i] < second && arr[i] != first) {
                second = arr[i];
            }
            }
            System.out.println("Smallest: " + first);
        System.out.println("Second Smallest: " + second);




      //   int first = Integer.MIN_VALUE;
      //       int second = Integer.MIN_VALUE;

      //       for(int i=0; i<n;i++){
      //             if(arr[i]>first){
      //                   second =first;
      //                   first =arr[i];
      //             }else if (arr[i] > second && arr[i] != first) {
      //           second = arr[i];
      //       }
      //       }
  
      //  System.out.println("higeste: " + first);
      //   System.out.println("Second high: " + second);

      }
}
