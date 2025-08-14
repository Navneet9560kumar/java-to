package string.RevisonString;

import java.util.*;

public class frequencyArray {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int[] freq = new int[26];
            for(int i=0;i<s.length();i++){
                  char ch = s.charAt(i);
                  int idx = (int)ch+97;
                  freq[idx]++;
            }
            int maxfr=-1;
            for (int i = 0; i < freq.length; i++) {
                  maxfr =Math.max(maxfr, freq[i]);
            }
            for (int i = 0; i < freq.length; i++) {
                  if(freq[i]==maxfr){
                        char ch = (char)(i+97);
                        System.out.println(ch+ " ");
                  }
            }

      }
}
