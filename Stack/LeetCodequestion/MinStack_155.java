package Stack.LeetCodequestion;

import java.util.*;

public class MinStack_155 {
       Stack<Integer>st= new Stack<>();

      public void push(int val){

      }

      public void pop(int val){
            if(!st.isEmpty() && st.peek() == val){
                  st.pop();
            }
      }
      public static void main(String[] args) {
            
      }
}
