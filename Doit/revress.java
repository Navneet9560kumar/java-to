package Doit;

import java.util.*;

public class revress {

      public static void pucshAtButton(Stack<Integer> st, int x) {
            if (st.size() == 0) {
                  st.push(x);
                  return;
            }

            int top = st.pop();
            pucshAtButton(st, x);
            st.push(top);
      }

      public static void reverse(Stack<Integer> st) {
            if (st.size() == 1)
                  return;
            int top = st.pop();
            reverse(st);
            pucshAtButton(st, top);

      }

      public static void main(String[] args) {

            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);

            System.out.println("Original stack: " + st);
            reverse(st);

            Stack<Integer> rt = new Stack<>();
            while (st.size() > 0) {
                  rt.push(st.pop());
            }

            System.out.println("Reversed into rt: " + rt);

            Stack<Integer> qt = new Stack<>();
            while (rt.size() > 0) {
                  qt.push(rt.pop());
            }

            System.out.println("Transferred into qt: " + qt);

            while (qt.size() > 0) {
                  st.push(qt.pop());
            }

            System.out.println("Final reversed stack back into st: " + st);
      }
}
