package string;

import java.util.Scanner; // Corrected import statement

public class reverseEachWordinSentence {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            // reverse(sb, 0, sb.length()-1); // Adjust indices as needed
            // System.out.println("Reversed substring: " + sb);
            int n = sb.length();
            int i = 0, j = 0;
            while (j < n) {
                  if (sb.charAt(j) != ' ')
                             j++;
                  else {
                        reverse(sb, i, j - 1);
                        i = j + 1;
                        j = i;
                  }
            }
            reverse(sb, i, j - 1); // ye ham last word ko revers karta hu  
            System.out.println(sb);
      }

      public static void reverse(StringBuilder sb, int i, int j) {
            while (i <= j) {
                  char temp = sb.charAt(i);
                  sb.setCharAt(i, sb.charAt(j));
                  sb.setCharAt(j, temp);
                  i++;
                  j--;
            }
      }
}

