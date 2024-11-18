package TowDarray;

public class maxInArrya {
      public static void main(String[] args) {
          int[][] arr = { { 1, 5, 6 }, { 2, -9, 3 }, { 5, 10, 3 } };
  
          int mx = Integer.MIN_VALUE;
          int sum = 0;
  
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr[i].length; j++) {
                  mx = Math.max(mx, arr[i][j]);
                  sum += arr[i][j];
              }
          }
          System.out.println("Max: " + mx);
          System.out.println("Sum: " + sum);
      }
  }