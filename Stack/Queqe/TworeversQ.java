package Stack.Queqe;

import java.util.*;


public class TworeversQ {


public static void revred(Queue<Integer> queue){
      Stack<Integer>stack= new Stack<>();
      while (!queue.isEmpty()) {
       stack.push(queue.remove());
      }
      while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
}

public static void print(Queue<Integer> queue) {
      System.out.println(queue);
  }

      public static void main(String[] args) {
            Queue<Integer>st= new LinkedList<>();
      
            st.add(1);
            st.add(2);
            st.add(3);
            st.add(4);
            st.add(5);
            st.add(6);
            st.add(7);
            st.add(8);
            st.add(9);
            st.add(10);
            revred(st);
           print(st);
            
      }
}
