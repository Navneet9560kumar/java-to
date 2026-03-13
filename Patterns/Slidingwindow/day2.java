package Patterns.Slidingwindow;

public class day2 {

      public int kBitFlips(int[] arr, int k) {

            int n = arr.length;
            int flips = 0;
            int flip = 0;

            int[] isFlipped = new int[n];

            for (int i = 0; i < n; i++) {

                  if (i >= k) {
                        flip ^= isFlipped[i - k];
                  }

                  if (arr[i] == flip) {

                        if (i + k > n)
                              return -1;

                        flips++;

                        flip ^= 1;
                        isFlipped[i] = 1;
                  }
            }

            return flips;
      }

      public static void main(String[] args) {

      }
}
