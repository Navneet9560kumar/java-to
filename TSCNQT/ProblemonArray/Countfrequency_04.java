package TSCNQT.ProblemonArray;

import java.util.*;

public class Countfrequency_04 {

      public void Frequency(int[] arr, int n) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                  map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            // Traverse through the HashMap and print frequencies
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                  System.out.println(entry.getKey() + " " + entry.getValue());
            }
      }

      public static void frequency(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                  int count = 1;
                  boolean vis = false;

                  for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                              vis = true;
                              break;
                        }
                  }
                  if (vis)
                        continue;

                  for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                              count++;
                        }
                  }

                  System.out.println(arr[i] + " " + count);
            }
      }

      public static void main(String[] args) {

      }
}
