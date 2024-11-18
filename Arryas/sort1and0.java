package Arryas;

public class sort1and0 {


      public int[] sortArray(int[] nums) {


            return nums;
        
      }



      public static void main(String[] args) {
            int []arr = {1,0,0,1,1,0,0,0,1,0};
            int n= arr.length;
            // int noofZero = 0;
           
            // for(int i=0; i<n;i++){
            //       if(arr[i]==0) noofZero++;
                
            // }
            // for(int i=0; i<n;i++){
            //     if(i<noofZero)arr[i]=0;
            //     else arr[i]=1;
            // }
            //method2 

            int i=0,j=n-1;
            while (i<j) {
                if(arr[i]==0) i++;
                if(arr[j]==1)j--;
                if(arr[i]==1 &&arr[j]==0){
                  // int temp = arr[i];
                  // arr[i] = arr[j];
                  // arr[j]=temp;
                  arr[i]=0;
                  arr[j]=1;
                  i++;
                  j--;
                }  
            }
      }
}
