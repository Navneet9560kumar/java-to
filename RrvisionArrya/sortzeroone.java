package RrvisionArrya;

public class sortzeroone {
      public static void main(String[] args) {
            int[]arr = {1,0,0,1,1,0,0,1,0};
            int n= arr.length;
            int noofZeroes =0, noofOnes =0;
            for (int i = 0; i < n; i++) {
                 if(arr[i]==0)  noofZeroes++;
                 else noofOnes++;    
            }
            for(int i=0;i<n;i++){
                  if(i<noofZeroes) arr[i]=0;
                  arr[i] = 1; // Filling the first noofZeroes elements with 0
            }
      }
}
