package Hashmap.RevesionHashmap.HeaporQue;

public class contest {
// StirringMinds is testing a drone-based monitoring system across a hilly region to identify the best location for installing a primary communication relay. As the drone travels in a straight line, it records signal strength at regular intervals. Due to the natural terrain, the signal values first increase steadily, reach a single highest point, and then decrease steadily afterward.

// You are given an integer array signals representing these readings in order. Your task is to help the engineering team determine the exact position where the signal is strongest.

// The array always follows this rule: signal strength strictly increases up to one point and strictly decreases after that point. There is exactly one such maximum value.

// Write a function that returns the index of this strongest signal. Your solution should be efficient and able to handle large input sizes.

// Input Format

// An integer array signals

// Constraints

// 3 <= signals.length <= 10^5

// 0 <= signals[i] <= 10^6

// Exactly one peak exists

// Your solution should run in O(log n) time

// Output Format

// Return a single integer representing the index of the peak signal.

// Sample Input 0

// 1 3 5 4 2
// Sample Output 0

// 2
// Sample Input 1

// 0 2 1
// Sample Output 1

// 1
// ...
// .
// .
// .

// .
// .
// .
// .
// .
// .
// .
// .
// .
// .

public static int peakIndexInMountainArray(int[] arr) {

      int start = 0;
      int end = arr.length - 1;

      while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                  end = mid;
            } else {
                  start = mid + 1;
            }
      }
      return start;
}


      public static void main(String[] args) {
            int[]arr = {1, 3, 5, 4, 2};
      }
}
