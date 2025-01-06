 package Arryas;

public class sortZeroOneTwo {
      public static void main(String[] args) {
            int[]arr = {0,1,2,0,1,2,1,2,0,0};
            int n= arr.length;

            // method 1 👍
            // int noofZero =0, noofOnes=0;
            // for(int i=0;i<n;i++){
            //       if(arr[i]==0) noofZero++;
            //       if(arr[i]==1)noofOnes++;
            // }
            // for(int i=0;i<n;i++){
            //       if(i<noofZero) arr[i]=0;
            //       else if(i<noofZero+noofOnes) arr[i]=1;
            //       else arr[i]=2;
            // }

            // method 2 :(Dutch Flag Algo)

            int mid=0,hi=n-1,lo=0;
            while (mid<=hi) {
                  if(arr[mid]==0){
                        int temp=arr[mid];
                        arr[mid]= arr[lo];
                        arr[lo] = temp;
                        lo++; mid++;

                  }else if(arr[mid]==1) mid++;
                  else{
                        int temp=arr[mid];
                        arr[mid]= arr[hi];
                        arr[hi] = temp;
                        hi--; 
                  }
            }


            for(int i=0;i<n;i++){
                  System.out.print(arr[i]+ " ");
            }
      }

      
}
