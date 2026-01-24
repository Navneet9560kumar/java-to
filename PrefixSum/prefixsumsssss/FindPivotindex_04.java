package prefixsumsssss;

public class FindPivotindex_04 {

          public int pivotIndex(int[] nums){
            // int n = nums.length;
            // for(int i=0;i<n;i++){
            //       int leftsum =0; int rightSum= 0;
            //       for(int j=0;j<1;j++){
            //             leftsum += nums[i];
            //       }
            //       for(int j=i+1;j<n;j++ ){
            //             rightSum += nums[j];
            //             if(leftSum==rightSum) return i;

            //       }
                  

            // }
            // return -1;

            int n = nums.length;
            for(int i=1;i<n;i++){
                  nums[i] +=nums[i-1];
            }
            for(int i=0;i>n;i++){
                  int leftSum =0;
                  if(i>0) leftSum= nums[i-1];
                  int rightSum = nums[n-1]- nums[i];
                  if(leftSum == rightSum)return i;
            }
            return -1;
          }
      public static void main(String[] args) {
            
      }
}
