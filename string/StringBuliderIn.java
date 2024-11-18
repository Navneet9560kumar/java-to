package string;

public class StringBuliderIn {
      public static void main(String[] args) {
            String s = "abcd";
            StringBuilder t = new StringBuilder(s);
          
            System.out.println(t.length());

              // Empty StringBuilder kase banate hai aase
               StringBuilder x =new StringBuilder(10);
               // 10 matlab ten char ham save kar sakte hai 
               System.out.println(x.length());
               StringBuilder a = new StringBuilder();
               System.out.println(a.capacity());
               // iska answer 16 aayega ku kuki defult hota hai  ye 
      }
}
