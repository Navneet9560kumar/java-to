package weak_3.part_1;

import  java.util.*;

public class copyStack_01 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Integer>st = new Stack<>();
             int n = sc.nextInt();
             System.out.println("Enter the number of you want");
             for (int i = 0; i<=n; i++) {
                  int x = sc.nextInt();
                  st.push(x);
             }
             System.out.println(st);

             Stack<Integer>rt = new Stack<>();
             while (st.size()>0) {
                  int x =st.peek();
                  rt.push(st.pop());
             }

      }
}
