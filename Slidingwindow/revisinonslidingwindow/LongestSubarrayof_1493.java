package Slidingwindow.revisinonslidingwindow;

public class LongestSubarrayof_1493 {

    public int longestSubarray(int[] arr) {
        int n = arr.length, i = 0, j = 0;
        int zeros = 0, maxLen = 0;

        while (j < n) {
 
            // window expand
            if (arr[j] == 0) zeros++;

            // sliding window rule:
            // window me max 1 zero allow  
            while (zeros > 1) {
                if (arr[i] == 0) zeros--;
                i++;
            }

            // ek zero delete kar sakte hai → length = j - i
            maxLen = Math.max(maxLen, j - i);

            j++;
        }

        return maxLen;
    }

    public static void main(String[] args) {

    }
}
