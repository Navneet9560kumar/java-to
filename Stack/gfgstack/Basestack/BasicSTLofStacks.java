package Stack.gfgstack.Basestack;

import java.util.*;

public class BasicSTLofStacks {
      public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            // st.size();
            // st.push("Khushi");
            // st.push("Sumit");
            // st.push("sachin");
            // st.push("toto");
            // System.out.println(st.size());
            // System.out.println(st);
            // System.out.println(st.peek());
            // System.out.println(st.pop());
            // String s  = st.pop();
            // System.out.println(s); 
   Stack<Integer> gt = new Stack<>();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            while (st.size()>0) {
                  gt.push(st.pop());
            }
            System.out.println(gt);
               Stack<Integer> rt = new Stack<>();
               while (gt.size()>0) {
                        rt.push(gt.pop());
               }
            System.out.println(rt);

      }
}
