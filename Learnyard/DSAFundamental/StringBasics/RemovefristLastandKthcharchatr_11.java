package Learnyard.DSAFundamental.StringBasics;

public class RemovefristLastandKthcharchatr_11 {

      public static String RemovetacharFristpostion(String str, char ch ){
            if(str.length()==0) return str;
            return str.substring(1);

      }
       public static String RemovetacharLastpostion(String str, char ch ){
            if(str.length()==0) return str;
            return str.substring(0, str.length()-1);

      }
      public static String removeAtK(String str, int k) {
    if (k < 0 || k >= str.length()) {
        return "Invalid Position";
    }

    return str.substring(0, k) + str.substring(k + 1);
}
      public static void main(String[] args) {
            
      }
}
