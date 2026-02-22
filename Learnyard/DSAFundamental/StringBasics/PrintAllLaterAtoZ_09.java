package Learnyard.DSAFundamental.StringBasics;

public class PrintAllLaterAtoZ_09 {

     public static boolean containsAllLetters(String str) {

        str = str.toLowerCase();

        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }

        return true;
    }
      public static void main(String[] args) {
            
      }
}
