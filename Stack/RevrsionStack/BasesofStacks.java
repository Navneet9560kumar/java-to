package Stack.RevrsionStack;

import java.util.Stack;

public class BasesofStacks {
      public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(5);
            st.push(6);
            st.push(8);
            while (st.size() > 1) {
                  int val = st.pop();
                  if (val % 2 == 0) {
                        System.out.println("even hai bro ");
                  } else {
                        System.out.println("odd");
                  }
            }
      }
}
