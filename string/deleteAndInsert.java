package string;

public class deleteAndInsert {
      public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("abcdef");
            System.out.println(sb);
            sb.deleteCharAt(3);
            System.out.println(sb);
            sb.append("xyz");
            System.out.println(sb);
            sb.delete(2, 5);
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb); 
      }
}
