package RrvisionArrya;

public class sortzeroone {
      public static void main(String[] args) {
            int[] arr = { 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0 };
            int n = arr.length;
            // int noofZeroes =0, noofOnes =0;
            // for (int i = 0; i < n; i++) {
            // if(arr[i]==0) noofZeroes++;

            // }
            // for(int i=0;i<n;i++){
            // if(i<noofZeroes) arr[i]=0;
            // else arr[i] = 1; // Filling the first noofZeroes elements with 0
            // }
            // for(int ele : arr){
            // System.out.print(ele + " ");
            // }
            // System.out.println();

            // method 2
            int i = 0, j = n - 1;
            while (i < j) {
                  if (arr[i] == 0) {
                        i++;
                  }

                  else if (arr[j] == 1) {
                        j--;
                  }

                  else {
                        // arr[i] == 1 && arr[j] == 0
                        arr[i] = 0;
                        arr[j] = 1;
                        i++;
                        j--;
                  }
            }
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }
}
