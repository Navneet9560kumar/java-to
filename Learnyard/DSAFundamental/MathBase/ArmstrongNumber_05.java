package Learnyard.DSAFundamental.MathBase;

public class ArmstrongNumber_05 {
      public static void main(String[] args) {

        int num = 153;
        int original = num;
        int sum = 0;

        // Step 1: Count digits
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        // Step 2: Calculate sum of powers
        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }

        // Step 3: Compare
        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }

}
