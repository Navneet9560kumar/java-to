package Learnyard.DSAFundamental.MathBase;

import java.util.*;

public class AddsionsubMul_01 {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Addition
        double sum = num1 + num2;

        // Subtraction
        double difference = num1 - num2;

        // Multiplication
        double product = num1 * num2;

        // Division
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        sc.close();
    }

}
