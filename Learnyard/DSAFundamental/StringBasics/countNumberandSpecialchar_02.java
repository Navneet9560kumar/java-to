package Learnyard.DSAFundamental.StringBasics;

import java.util.*;
public class countNumberandSpecialchar_02 {

      public static void countalltypeofchar(String str){
            int n= str.length();
            int count1 =0, count2=0, count3=0;

            for (int i = 0; i < n; i++) {
                    char ch = str.charAt(i);
                    if((ch>='A' && ch<= 'Z')|| (ch>='a' && ch <='z')){
                        count1++;
                    }else if(ch>= '0' && ch <='9'){
                        count2++;
                    }else{
                        count3++;
                    }
            }
             System.out.println("Letters: " + count1);
    System.out.println("Numbers: " + count2);
    System.out.println("Special Characters: " + count3);
      }

      // builde in method 
      public static void countCharacters(String str) {

    int letters = 0;
    int numbers = 0;
    int special = 0;

    for(int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if(Character.isLetter(ch)) {
            letters++;
        }
        else if(Character.isDigit(ch)) {
            numbers++;
        }
        else {
            special++;
        }
    }

    System.out.println("Letters: " + letters);
    System.out.println("Numbers: " + numbers);
    System.out.println("Special Characters: " + special);
}


public static void duplicate(String str){
       int[] freq = new int[256]; // ASCII size
      int n= str.length();
      for(int i=0;i<n;i++){
            freq[str.charAt(i)]++;
      }
      for(int i=0;i<256;i++){
            if(freq[i]>1){
                    System.out.println((char)i + " -> " + freq[i] + " times");
            }
      }
}

public static String removeDuplicate(String str){
            Set<Character> set = new LinkedHashSet<>();

            for(char ch: set){
                  set.add(ch);
            }

            StringBuilder sb = new StringBuilder();
             for(char ch : set) {
        sb.append(ch);
    }
     return sb.toString();
}
      public static void main(String[] args) {
            
      }
}
