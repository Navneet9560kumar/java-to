package Stack.RevrsionStack;

import java.util.*;

public class DeleatatBottem_04 {

        public static void deleteBottom(Stack<Integer> st){
            if(st.isEmpty()){
                  return;
            }
            int top  =st.pop();

            if(st.isEmpty()){
                  return;

            }
            deleteBottom(st);
                st.push(top);
        }
      public static void main(String[] args) {
               Stack<Integer> st = new Stack<>();
           st.push(1);
           st.push(2);
           st.push(3);
           st.push(4);
           st.push(5);

           System.out.println("Original Stack: " + st);
        
        deleteBottom(st);
        
        System.out.println("After deleting bottom: " + st);
      }
}
