package Slidingwindow.revisinonslidingwindow;

public class LongestSubarrayof_03 {

    public int longestSubarray(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        int zeros = 0, maxLen = 0;

        while (i < n && arr[i] == 0) {
            i++;
        }

        j = i;

        while (j < n) {

            if (arr[j] == 1) {
                j++;
            } else {

                if (zeros == 0) {
                    zeros++;
                    j++;
                } else {

                    int len = j - i - 1;
                    maxLen = Math.max(maxLen, len);

                    j++;

                    while (i < n && arr[i] == 1)
                        i++;

                    i++;
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

    }
}