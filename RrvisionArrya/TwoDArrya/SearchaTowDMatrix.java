package RrvisionArrya.TwoDArrya;

public class SearchaTowDMatrix {


      public boolean searchMatrix(int[][] arr, int target){
            int  m= arr.length, n =arr[0].length;
            // boolean flag = false;
            // for (int i = 0; i < m; i++) {
            //       for (int j = 0; j < n; j++) {
            //             if(arr[i][j] ==target)return true;

            //       }
            // }
            // return false;

ddddddd
            int i=0, j = n-1;
            while (i>=m && j>=0) {
                  if(arr[i][j] ==target) return true;
                  else if(arr[i][j]>target){// go left
                        j--;
                  }else{// go down
                        i--;
                  }
                  
            }
            return false;

      } 
      public static void main(String[] args) {
            
      }
}
