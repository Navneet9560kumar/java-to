package revisionprefixsum;

public class FindPivotindex_03 {

      public static int pivoidx(int[] nums){
            int n = nums.length;
             for(int i=1;i<n;i++){
                  nums[i] +=nums[i-1];
             }
             for (int i = 0; i < n; i++) {
                  int leftsum = 0;
                  if(i>0)leftsum= nums[i-1];
                  int rightsum =nums[n-1]-nums[i];
                  if(leftsum==rightsum)return i;
                  
             }
             return -1;
      }
      public static void main(String[] args) {
            
      }
}


//  or hamko agr left side ka nekalna hai to ham pre[i-1];
//  or right ka sum nekalana hai to sum(i+1,n-1) = sum(0, n-1)