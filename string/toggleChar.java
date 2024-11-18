package string;


import java.util.Scanner;


public class toggleChar {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder(sc.nextLine());
            int n = sb.length();
            for (int i = 0; i < n; i++) {
                  char ch = sb.charAt(i); // pehele ham small hai ya captile to vo characte utha leya
                  int asci = (int) ch;
                  if (asci >= 65 && asci <= 90) {// ye capital mai convert kar do
                        asci += 32;
                       
                  }
                 else if (asci >= 97 && asci <= 122) {// ye small mai convert kar do
                        asci -= 32;
                       
                  }
                  ch = (char) asci;
                  sb.setCharAt(i, ch);

            }
            System.out.println(sb);
      }
}
// so as we say that we use  a asci what is asci value th evalue is A->65,B->66........Z->90[for small a=>97; b=> 98...........z=122] 
// so inke beeche mai idfferent hai ke 32 ka difference small a or A 