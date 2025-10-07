package Stack.LeetCodequestion;

import java.util.*;

public class MinStack_155 {
       Stack<Integer>st= new Stack<>();
      Stack<Integer>min = new Stack<>();

      class MinStack {
  

    public MinStack() {
        
    }
    
    public void push(int val) {
      if(st.size()==0){
            st.push(val);
            min.push(val);
      }else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
      }
        
    }
    
    public void pop() {
        st.pop();
            min.pop();
    }
     
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        
    }
}

      public static void main(String[] args) {
            
      }
}
