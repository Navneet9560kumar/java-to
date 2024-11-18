package stacks;

import java.util.*;

public class basicsofstack {
      public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(23);
            st.push(90);
            st.push(500);

            System.out.println(st.peek());
            System.out.println(st);
            st.pop();
            System.out.println(st); 

            while (st.size()>1) {
                  st.pop();
            }
            System.out.println(st.peek());
            System.out.println(st); 
      }
}
