package stacks;

import java.util.Stack;

public class displaystack {

      public static void displayRec(Stack<Integer>st){
            if(st.size()==0)return;
           int top = st.pop();
           System.out.print(top+ " ");
           displayRec(st);
           st.push(top);

      }
      public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            displayRec(st);
            Stack<Integer> rt = new Stack<>();
            // while (st.size() > 0) {
               
            //       rt.push(st.pop());
            // }
            // while (rt.size()>0) {
            //     int x=  rt.pop();
            //     System.out.print(x + " ");
            //     st.push(x);
            // }

      }
}
