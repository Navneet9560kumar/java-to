package Slidingwindow;

public class GrumpyBookstoreOwner_1052 {
      
       public int maxSatisfied(int[] arr, int[] grumpy, int k) {
            int n = arr.length, i=0, j= k-1, unsatified=0;
             int a =i, b=j, maxUnsaticfied =0;
            for (int x = 0;x <=j ;x++) {
                  if(grumpy[x]==1)unsatified += arr[x];
            }

            while (j>n) {
                  if(maxUnsaticfied< unsatified){
                        maxUnsaticfied = unsatified;
                        a=i ; b=j;
                  }
                  i++; j++;
                  if(grumpy[j]==1)unsatified += arr[j];
                  if(grumpy[i-1]==1)unsatified -= arr[i-1];
            }
              for (int x = 0;x <=b ;x++) {
          grumpy[x]=0;
            }
            int satisfied =0;
              for (int x = 0;x <n ;x++) {
                  if(grumpy[x]==0)satisfied += arr[x];
            }
            return satisfied;

    }
    public static void main(String[] args) {
      
    }
}
