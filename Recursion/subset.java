import java.util.ArrayList;
import java.util.Scanner;

public class subset {

      static ArrayList<String> arr = new ArrayList<>();

      public static void printSubstring(int i, String s, String ans) {
            if (i == s.length()) {
                  arr.add(ans);
                  return;
            }
            char ch = s.charAt(i);
            printSubstring(i + 1, s, ans + ch);//not take
            printSubstring(i + 1, s, ans);//take

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string ");
            String s = sc.nextLine();
            arr= new ArrayList<>();//reset 
            printSubstring(0, s, "");
            System.out.println(arr);
      }
}
