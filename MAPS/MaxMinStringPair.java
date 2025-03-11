package MAPS;

import java.util.HashSet;

public class MaxMinStringPair {

    // Correct method placement
    public static int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (String word : words) { // Enhanced for-loop for readability 
            String rev = reverse(word);
            if (set.contains(rev)) {
                count++;
            } else {
                set.add(word);
            }
        }
        return count;
    }

    // Move reverse method outside the previous method   
    public static String reverse(String s) { 
        return new StringBuilder(s).reverse().toString();
    }


    public static void main(String[] args) {
        String[] words = {"ab", "ba", "cd", "dc", "ef"};
        int result = maximumNumberOfStringPairs(words);
        System.out.println("Maximum number of string pairs: " + result);
    }
}
