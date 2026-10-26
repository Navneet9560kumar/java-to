package weak_3.part_1;

import java.util.*;

public class DisplayStack_02 {

      public static  void displayRec(Stack<Integer>st){
            if(st.size()==0)return ;
            int top = st.pop();
            System.out.println(top+ " ");
            displayRec(st);
            st.push(top);
      }
      public static void main(String[] args) {
            Stack<Integer>st = new Stack<>();
            st.push(1);
      }
}
