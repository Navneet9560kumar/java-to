package DynamicProgramming.AdityaVermadp.MCM;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringRecursive {
    static Map<String, Boolean> memo = new HashMap<>();

    public static int isScramble(final String A, final String B) {
        if (A.length() != B.length()) return 0;

        return isScrambleHelper(A, B) ? 1 : 0;
    }

    private static boolean isScrambleHelper(String A, String B) {
        if (A.equals(B)) return true;

        String key = A + "#" + B;
        if (memo.containsKey(key)) return memo.get(key);

        // Prune: If not anagrams, return false early
        if (!isAnagram(A, B)) {
            memo.put(key, false);
            return false;
        }

        int n = A.length();
        for (int i = 1; i < n; i++) {
            // Case 1: No swap
            if (isScrambleHelper(A.substring(0, i), B.substring(0, i)) &&
                isScrambleHelper(A.substring(i), B.substring(i))) {
                memo.put(key, true);
                return true;
            }

            // Case 2: Swap
            if (isScrambleHelper(A.substring(0, i), B.substring(n - i)) &&
                isScrambleHelper(A.substring(i), B.substring(0, n - i))) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    private static boolean isAnagram(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static void main(String[] args) {
        System.out.println(isScramble("we", "we"));               // 1
        System.out.println(isScramble("phqtrnilf", "ilthnqrpf")); // 0
        System.out.println(isScramble("great", "rgeat"));         // 1
        System.out.println(isScramble("great", "rgtae"));         // 1
    }
}
