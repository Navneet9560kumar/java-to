package Stack;

import java.util.*;

public class minstack {

      static Stack<Integer>st = new Stack<>();
      static Stack<Integer>min = new Stack<>(); // ek extra stack use kar rahe hai 
      
            public static void MinStack(){
      
            }
      
      
            public void push(int val){
                  if(st.size()==0){
                        st.push(val);
                        min.push(val);
                  }else{
                        st.push(val);
                        if(min.peek()<val)min.push(min.peek());
                        else min.push(val);
                  }
            }
      
            public static void pop(){
                 st.pop();
                  min.pop();
      }
      public static int top(){
            return st.peek();
      }
      public static int getMin(){
            return min.peek();
      }


      public static void main(String[] args) {
            
      }
}
