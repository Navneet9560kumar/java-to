package Learnyard.DSAFundamental.StringBasics;

public class RemoveLeadingTrailingandExtraspace_04 {

      public static void removeextraspace(String s) {
            int n  = s.length();
            String trimed = s.trim();
            //remove a extra space
            String cleaned = trimed .replaceAll("\\s+", " ");

      }

      public static int countWords(String s) {
    if (s == null || s.trim().isEmpty()) {
        return 0;
    }
    return s.trim().split("\\s+").length;
}

public static int countCharacters(String s) {
    if (s == null) {
        return 0;
    }

    int count = 0;
    for (int i = 0; i < s.length(); i++) {
        if (!Character.isWhitespace(s.charAt(i))) {
            count++;
        }
    }
    return count;
}
      
      public static void main(String[] args) {
            String s= "Navneet";
           System.out.println("The number of count is " +   countWords(s));
      }
}
