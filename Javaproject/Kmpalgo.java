package Javaproject;

public class Kmpalgo {
      public static int[] computeLPSArray(String pattern) {
            int M = pattern.length();
            int[] lps = new int[M];
            int len = 0; // Length of the previous longest prefix suffix
            int i = 1;

            lps[0] = 0; // LPS of the first character is always 0

            while (i < M) {
                  if (pattern.charAt(i) == pattern.charAt(len)) {
                        len++;
                        lps[i] = len;
                        i++;
                  } else {
                        if (len != 0) {
                              len = lps[len - 1]; // Backtrack to the previous longest prefix suffix
                        } else {
                              lps[i] = 0;
                              i++;
                        }
                  }
            }
            return lps;
      }

      // KMP Search Algorithm
      public static void KMPSearch(String text, String pattern) {
            int N = text.length();
            int M = pattern.length();

            int[] lps = computeLPSArray(pattern);

            int i = 0; // Index for text
            int j = 0; // Index for pattern

            while (i < N) {
                  if (pattern.charAt(j) == text.charAt(i)) {
                        i++;
                        j++;
                  }

                  if (j == M) {
                        System.out.println("Pattern found at index " + (i - j));
                        j = lps[j - 1]; // Check for overlapping patterns
                  } else if (i < N && pattern.charAt(j) != text.charAt(i)) {
                        if (j != 0) {
                              j = lps[j - 1];
                        } else {
                              i++;
                        }
                  }
            }
      }

      // Main Method
      public static void main(String[] args) {
            String text = "ABABDABACDABABCABAB";
            String pattern = "ABABCABAB";

            KMPSearch(text, pattern);
      }
}
