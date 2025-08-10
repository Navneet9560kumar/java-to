package RrvisionArrya;

public class countThenumberofelementgraterThatx {

        public int removeDuplicates(int[] nums){
            int n = nums.length;
            int i=0, j=0;
            while (j<n) {
                  if(nums[i]!=nums[j]){
                        i++;
                        nums[i] = nums[j];
                  }
                  j++;
            }
            return i+1;
        }
      public static void main(String[] args) {
            
      }
}


// leetcoe26