package Learnyard.DSAFundamental.StringBasics;

public class checkConsecutive_07 {

       public static void checkConsecutive(String str){
            boolean twoConsecutive =false;
            boolean threeConsecutive =false;

            for(int i =0;i<str.length();i++){
                  //    // Check for two consecutive
                  if(str.charAt(i)== str.charAt(i+1));
                  twoConsecutive= true;

            
                // Check for three consecutive
                if (i < str.length() - 2 &&
                str.charAt(i) == str.charAt(i + 1) &&
                str.charAt(i) == str.charAt(i + 2)) {
                threeConsecutive = true;
            }
             if (twoConsecutive)
            System.out.println("Two consecutive identical characters found.");
        else
            System.out.println("No two consecutive identical characters.");

        if (threeConsecutive)
            System.out.println("Three consecutive identical characters found.");
        else
            System.out.println("No three consecutive identical characters.");
    }

       }
      public static void main(String[] args) {
             String str = "aabbbcc";
        checkConsecutive(str);
      }
}
