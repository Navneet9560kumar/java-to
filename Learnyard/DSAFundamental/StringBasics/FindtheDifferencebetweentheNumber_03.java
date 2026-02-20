package Learnyard.DSAFundamental.StringBasics;

public class FindtheDifferencebetweentheNumber_03 {


      public static void FindDifferencebetweenNumberofConsona(String str){
            int n = str.length();
              int vowels = 0;
        int consonants = 0;
                str = str.toLowerCase();

           for (int i = 0; i < n; i++) {
                  char ch = str.charAt(i);

                  if(ch>= 'a' && ch <= 'z'){
                        if(ch=='a'|| ch=='e'|| ch == 'i' || ch == 'o'|| ch == 'u'){

                        }
                  }
           }
      }
      public static void main(String[] args) {
            
      }
}
