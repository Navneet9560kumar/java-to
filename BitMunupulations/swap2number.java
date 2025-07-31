package BitMunupulations;

public class swap2number {
      public static void main(String[] args) {
            int a = 10;
            int b = 20;

            // Swapping using bitwise XOR
            // a = a ^ b;
            // b = a ^ b;
            // a = a ^ b;

            // System.out.println("After swapping: a = " + a + ", b = " + b);

            a = a + b; // a now becomes 30
            b = a - b; // b becomes 10 (original value of a)            
            a = a - b; // a becomes 20 (original value of b)
            System.out.println("After swapping: a = " + a + ", b = " + b);

      }
}
