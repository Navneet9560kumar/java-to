package Sorting.REVSort.CycleSort;

public class FindTheDuplicateNumber {

        public static int findDuplicate(int[] nums){
            int n = nums.length;
            boolean[]vis  = new boolean[n+1];
            for(int ele:nums){
                  vis[ele]= true;
            }
            for(int i=0;i<=n;i++){
                  if(vis[i] == false) return i;

            }
            return 55;
        }
      public static void main(String[] args) {
            
      }
}
