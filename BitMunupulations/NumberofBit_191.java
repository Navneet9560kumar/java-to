package BitMunupulations;

public class NumberofBit_191 {
      
        public static int hammingWeight(int n) {
         int count = 0;
         for (int i = 0; i < 32; i++) {
             if ((n & (1 << i)) != 0) {
                 count++;
             }
         }
         return count;
    }
      
      public static void main(String[] args) {
            
      }
}
