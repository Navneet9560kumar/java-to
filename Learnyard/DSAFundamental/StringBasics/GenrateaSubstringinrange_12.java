package Learnyard.DSAFundamental.StringBasics;

public class GenrateaSubstringinrange_12 {

      public static void generateSubstringsOfRange(String str, int start, int end) {

    if (start < 0 || end > str.length() || start >= end) {
        System.out.println("Invalid Range");
        return;
    }

    String sub = str.substring(start, end);

    System.out.println("Substrings of: " + sub);

    for (int i = 0; i < sub.length(); i++) {
        for (int j = i + 1; j <= sub.length(); j++) {
            System.out.println(sub.substring(i, j));
        }
    }
}

      public static void generateSubstringsOfRange(String str){
            int n = str.length();
            if(str.length()==0) return;
            for(int i=1;i<=str.length();i++){
                   System.out.println(str.substring(0, i));
            }
               generateSubstringsOfRange(str.substring(1));
      }
      public static void main(String[] args) {
            
      }
}
