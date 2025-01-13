package Arryas;

import java.util.*;

import TreePW.boolen;

public class Question {

      public static void sumAll(int[] arr) {
            int sum = 0; // Initialize for sum

            for (int num : arr) {
                  sum += num; // Add each element to sum
            }

            // Print array elements
            System.out.println("Array elements:");
            for (int num : arr) {
                  System.out.print(num + " ");
            }

            System.out.println("\nSum of all elements: " + sum);
      }

      public static void productAll(int[] arr) {
            int pro = 1;

            for (int num : arr) {
                  pro *= num;
            }

            System.out.println("Arrya elements:");
            for (int num : arr) {
                  System.out.print(num + " ");
            }
            System.out.println("The product of all ele:" + pro);
      }

      public static void min(int[] arr) {

            if (arr.length == 0) {
                  System.out.println("Array is empty");
                  return;
            }

            int min = arr[0];

            for (int num : arr) {
                  if (num < min) {
                        min = num;
                  }
            }
            System.out.println("min ele is ");
            for (int ele : arr) {
                  System.out.println(ele + " ");
            }
            System.out.println("min ele is " + min);
      }

      public static void duplicate(int[] arr) {
            int n = arr.length;

            if (n == 0) {
                  System.out.println("Array is empty");
                  return;
            }

            Arrays.sort(arr);
            System.out.println("Array duplicate numbers:");

            boolean flag = false;

            for (int i = 0; i < n - 1; i++) {
                  if (arr[i] == arr[i + 1]) {
                        System.out.println(arr[i]);
                        flag = true;

                        // Skip printing the same duplicate again
                        while (i < n - 1 && arr[i] == arr[i + 1]) {
                              i++;
                        }
                  }
            }

            if (!flag) {
                  System.out.println("No duplicate elements found in the array");
            }
      }

      public static void greater(int[] arr, int x) {
            int count = 0;
            if (arr.length == 0) {
                  System.out.println("Arry is empaty");
                  return;
            }

            for (int num : arr) {
                  if (num > x) {
                        count++;

                  }
            }
            System.out.println("The number of elements greater than " + x + " is " + count);
      }

      public static void threegreater(int[] arr) {
            int n = arr.length;
            if (n < 3) {
                  System.out.println("Invalid input");
                  return;
            }
            int firstInt = Integer.MIN_VALUE;
            int secondInt = Integer.MIN_VALUE;
            int thirdInt = Integer.MIN_VALUE;

            // Traverse the array to find the three largest numbers
            for (int i = 0; i < n; i++) {
                  if (arr[i] > firstInt) {
                        thirdInt = secondInt;
                        secondInt = firstInt;
                        firstInt = arr[i];
                  } else if (arr[i] > secondInt && arr[i] != firstInt) {
                        thirdInt = secondInt;
                        secondInt = arr[i];
                  } else if (arr[i] > thirdInt && arr[i] != secondInt && arr[i] != firstInt) {
                        thirdInt = arr[i];
                  }
            }

            // Print the results
            System.out.println("Three largest numbers are: " + firstInt + ", " + secondInt + ", " + thirdInt);
      }

      public static void evenOddSum(int[] arr) {
            int n = arr.length;

            int evenSum = 0, oddSum = 0;
            int evenCount = 0, oddCount = 0;

            if (n == 0) {
                  System.out.println("Array is empty");
                  return;
            }

            for (int i = 0; i < n; i++) {
                  if (arr[i] % 2 == 0) {
                        evenSum += arr[i];
                        evenCount++;
                  } else {
                        oddSum += arr[i];
                        oddCount++;
                  }
            }

            System.out.println("Even count: " + evenCount + ", Even sum: " + evenSum);
            System.out.println("Odd count: " + oddCount + ", Odd sum: " + oddSum);
      }

      public static boolean isPalindrome(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n / 2; i++) {
                  if (arr[i] != arr[n - i - 1]) {
                        return false;
                  }

            }
            return true;

      }

      public static void main(String[] args) {
            int[] arr = { 12, 8, 41, 37, 2, 37, 16, 37, 21 };
            int x = 41;
            sumAll(arr);
            productAll(arr);
            min(arr);
            duplicate(arr);
            greater(arr, x);
            evenOddSum(arr);
            

      }

}
