package Javaproject.Plagiarism_checker.src;

import java.util.HashMap;

public class BoyerMooreAlgorithm {
    public boolean search(String text, String pattern) {
        HashMap<Character, Integer> badCharTable = buildBadCharTable(pattern);
        int m = pattern.length();
        int n = text.length();
        int s = 0;

        while (s <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j))
                j--;

            if (j < 0) {
                return true; // Match found
            } else {
                s += Math.max(1, j - badCharTable.getOrDefault(text.charAt(s + j), -1));
            }
        }
        return false;
    }

    private HashMap<Character, Integer> buildBadCharTable(String pattern) {
        HashMap<Character, Integer> badCharTable = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            badCharTable.put(pattern.charAt(i), i);
        }
        return badCharTable;
    }
}