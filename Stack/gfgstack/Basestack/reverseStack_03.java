package Stack.gfgstack.Basestack;

import java.util.Stack;

public class reverseStack_03 {

      public static void reverse(Stack<Integer>st){
            if(st.size()==0) return;
            int top = st.pop();
            reverse(st);
            insertAtBottom(st,top);
      }

      public static void insertAtBottom(Stack<Integer>st, int x){
            if(st.size()==0){
                  st.push(x);
                  return;
            }
            int top = st.pop();
            insertAtBottom(st,x);
            st.push(top);
      }

      public static void main(String[] args) {
              Stack<Integer> st = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            reverese(st);
            //     Stack<Integer> rt = new Stack<>();
            // while(st.size()>0){
            //       rt.push(st.pop());
            // }
            // System.out.println(rt);
            //     Stack<Integer> qt = new Stack<>();

            //     while (rt.size()>0) {
            //       qt.push(rt.pop());
            //     }
            //     System.out.println(qt);
      }
}
