




public class CorporateFlightBooking_1109 {



        public int[] corpFlightBookings(int[][] arr, int n) {
        int[]ans = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int frist = arr[i][0];
            int last = arr[i][1];
            int seats= arr[i][2];
            for (int j = frist-1; j <= last-1; j++) {
                  ans[j] += seats;
            }
        }
        return ans;
    }

     public int[] corpFlightBookings2(int[][] arr, int n) {
        int[]ans = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int frist = arr[i][0];
            int last = arr[i][1];
            int seats= arr[i][2];
          ans[frist-1] += seats;
         if(last>n) ans[last] -=seats;

        }
        for (int i = 1; i < n; i++) {
            ans[i] += ans[i-1];
            
        }
        return ans;
    }





      public static void main(String[] args) {
            
      }
}
