package Arryas;

public class TwoSum {
      public static boolean TwoSums(String[] args) {
            boolean flag = true;
            int[] arr = {2, 7, 11, 15};
            int target = 9;
            for(int i=0;i<arr.length;i++){
                  for(int j=i+1;j<arr.length;j++){
                        if(arr[i]+arr[j]==target) return true;
                  }
            }
            return false;
      }
      public static void main(String[] args) {
            int[] arr = {2, 7, 11, 15};
            int target = 9;
            System.out.println(TwoSums(args));
      }
}
