package Patterns.TowPointer;

public class newfile_06 {

      public int[] sortedSquares(int[] nums){
            int n = nums.length;
            int []res = new int[n];
            int left =0;
            int right = n-1;
            int idx  = n-1;
            while (left<=right) {
                  int rightSqure = nums[right]*nums[right];
                  int leftSqure = nums[left]*nums[left];
                  if(leftSqure>rightSqure){
                        res[idx]=leftSqure;
                        left++;
                  }else{
                        res[idx]= rightSqure;
                        right--;
                  }
                  idx--;

            }
            return res;
      }
      public static void main(String[] args) {
            
      }
}
