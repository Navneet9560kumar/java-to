package string;

import java.util.HashMap;

public class seedublicateornot {
       public static String findUniqueCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Collect characters that appear only once
        StringBuilder uniqueChars = new StringBuilder();
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) == 1) {
                uniqueChars.append(ch);
            }
        }

        return uniqueChars.toString();

    }
    public static void main(String[] args) {
      String str = "programming"; // Input string
      System.out.println("Unique characters: " + findUniqueCharacters(str));
  
    }
}



///🫡🫡🫡🫡'gfg ka hai pura question hai 