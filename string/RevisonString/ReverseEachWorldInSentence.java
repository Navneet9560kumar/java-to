package string.RevisonString;

import java.util.*;

public class ReverseEachWorldInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sh = new StringBuilder(sc.nextLine());
        reverse(sh, 2, 4); // Reverse from index 2 to 4
        System.out.println(sh);
        sc.close();
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
