package BitMunupulations;

public class singlenumber {
      public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 1};
            int result = 0;

            for (int num : arr) {
                  result ^= num; // XOR operation
            }

            System.out.println("The single number is: " + result);
      }
}
