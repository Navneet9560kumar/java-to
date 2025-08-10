package RrvisionArrya;

public class Sort_1Zero_2 {
      public static void main(String[] args) {
            int[]arr = {0,1,2,0,1,2,1,2,0,0};
            int n = arr.length;
            int noofZero=0, noofOnes=0;
            for (int i = 0; i < n; i++) {
                  if(arr[i]==0)noofZero++;
                  if(arr[i]==1)noofOnes++;

            }
            for (int i = 0; i < n; i++) {
                 if(i<noofZero)arr[i]=0;
                 else if(i<noofZero+noofOnes) arr[i] =1;
                 else arr[i] =2; 
            }
              for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();