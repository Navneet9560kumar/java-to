package RrvisionArrya;

public class SingleNumber_136 {

       public int singleNumber(int[] nums) {
         int res = 0;
    for (int i = 0; i < 32; i++) {
        int temp = (1 << i);
        int countone = 0;
        for (int num : nums) {
            if ((num & temp) != 0) {
                countone++;
            }
        }
        if (countone % 3 != 0) {
            res = res | temp; // bitwise OR
        }
    }
    return res;
    }
      public static void main(String[] args) {
            
      }
}
