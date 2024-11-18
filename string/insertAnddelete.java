package string;

public class insertAnddelete {
      public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("abcdef");
            System.out.println(sb);
            sb.deleteCharAt(3);
            System.out.println(sb);
            sb.append("xyz");
            System.out.println(sb);// abcefxyz
            sb.delete(2, 5);
            System.out.println(sb);
            sb.insert(2, 'g');
            System.out.println(sb);
      }
}
