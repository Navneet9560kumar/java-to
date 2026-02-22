package Learnyard.DSAFundamental.StringBasics;

import java.util.HashMap;
import java.util.Map;

public class FindthemaxandminOccurringChar_05 {

      public static void findOccurringchar(String str){
            int n = str.length();
            str = str.replaceAll("\\s","");
            char maxChar = str.charAt(0);
            char minchar = str.charAt(0);
            int maxCount =0;
            int minCount = str.length();

            for(int i=0; i<n;i++){
                  int count =0;

                  for(int j=0;j<n;j++){
                        if(str.charAt(i)==str.charAt(j));
                        count++;
                  }
                  if(count>maxCount){
                        maxCount =count;
                        maxChar = str.charAt(i);
            }
             if(count<maxCount){
                        minCount =count;
                        maxChar = str.charAt(i);
            }
            }

        System.out.println("Maximum occurring character: " + maxChar + " (" + maxCount + " times)");
        System.out.println("Minimum occurring character: " + minchar + " (" + minCount + " times)");

            
      }

             public static void findMaxMinChar(String str) {
        // Remove spaces (optional)
        str = str.replaceAll("\\s", "");

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char maxChar = str.charAt(0);
        char minChar = str.charAt(0);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find max and min occurring characters
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxChar = entry.getKey();
            }

            if (entry.getValue() < min) {
                min = entry.getValue();
                minChar = entry.getKey();
            }
        }

        System.out.println("Maximum occurring character: " + maxChar + " (" + max + " times)");
        System.out.println("Minimum occurring character: " + minChar + " (" + min + " times)");
    }

    public static void main(String[] args) {
        String str = "programming";
        findMaxMinChar(str);
    }

}
