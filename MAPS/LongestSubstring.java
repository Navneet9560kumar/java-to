package MAPS;

import java.util.HashMap;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;
        
        int maxLen = 0;
        int i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch) && map.get(ch) >= i) {
                i = map.get(ch) + 1;
            }
            map.put(ch, j);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s)); // Output: 3
    }
}
// // ### **Explanation:**
// // 1. **HashMap:** We are using a HashMap to store the characters and their indices.
// // 2. **Sliding Window Technique:** We are using the sliding window technique to find the longest substring without repeating characters.
// // 3. **Algorithm:**
// //     - Initialize two pointers `i` and `j` to 0.
// //     - Iterate over the string `s` using the pointer `j`.
// //     - If the character at index `j` is already present in the map and its index is greater than or equal to `i`, update `i` to the next index of the character.
// //     - Update the index of the character in the map.
// //     - Update the maximum length of the substring.
// Compare this snippet from MAPS/LongestSubstring.java:
// package MAPS;
