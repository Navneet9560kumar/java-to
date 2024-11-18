package string;

public class updateEvenPostions {
      public static void main(String[] args) {
            String s = "Navneet  ";
            String str = "";
            
            // Har character par loop chalega
            for (int i = 0; i < s.length(); i++) {
                // Agar index even hai toh 'a' add karo
                if (i % 2 == 0) {
                    str += 'a';
                } else {
                    // Agar index odd hai toh original character add karo
                    str += s.charAt(i);
                }
            }
            
            // Modified string ko print karo
            System.out.println(str);
        }
    }