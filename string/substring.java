package string;

public class substring {
      public static void main(String[] args) {
            String s = "abcd";
            System.out.println(s.substring(0));//bcde
            // print 3 ke aage wale index ko print karta hai
            System.out.println(s.substring(1,4));//bcd

            // print all substring
            // for (int i = 0; i < s.length(); i++) {
            //       for (int j = i + 1; j <= s.length(); j++) {
            //           System.out.print(s.substring(i, j) + " ");
            //       }
            //       System.out.println();
            //   }
      }
}
