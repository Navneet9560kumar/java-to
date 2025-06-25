package RrvisionArrya;

public class twopasssaluction {
      public static void main(String[] args) {
            int[]arr = {0,1,2,0,1,2,1,2,0,0};
            int n =   arr.length;
            // int noOFZeros=0, noOfones =0;
            // for (int i = 0; i < n; i++) {
            //       if(arr[i]==0) noOFZeros++;
            //       if(arr[i]==1)noOfones++;
            // }
            // for (int i = 0; i <n; i++) {
            //       if(i<noOFZeros) arr[i] =0;
            //       else if(i<noOFZeros+noOfones) arr[i] =1;
            //       else arr[i]=2;
            // }
            // for (int i = 0; i < n; i++) {
            //       System.out.print(arr[i]+" ");
            // } Frist apporch


            //😎😎😎🥸🥸🥸 Ducth flag algo
            // 3 pointer app low , mid, high



            int mid =0, hi = n-1, lo=0;

            while (mid<=hi) {
               if(mid==0){
                  int temp =arr[mid];
                  arr[mid]= arr[lo];
                  arr[lo] = temp;
                  lo++;mid++;
               } 
               else if(arr[mid]==1) mid++;
               else{ // arr[mid]==2
                    int temp =arr[mid];
                  arr[mid]= arr[hi];
                  arr[hi] = temp;
                  hi--;
               } 
            }
      
      }
}
