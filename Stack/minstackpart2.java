package Stack;

import java.util.Stack;

public class minstackpart2 {

       static Stack<Integer>st = new Stack<>();
      static int min =-1;
            
                  
            
            
                  public void push(int val){
                        if(st.size()==0){
                            st.push(val);
                            min = val;
                        }
                        if(val>=min){
                              st.push(2*val-min);
                              min = val;
                        }
                  }
            
                  public static void pop(){
                      if(st.size()==0) return;
                      if(st.peek()>=min)st.pop();
                      if(st.peek()<min){// peek pe feck value padi hai 
                        // restore the old min
                        int old  = min - st.peek();
                        min = old;st.pop();
                      }
      }
      public static int top(){
            if(st.size()==0) return -1;
            if(st.peek()>=min)return st.peek();
            if(st.peek()<min){
                  return min;
            }
                        return 0;
                      

      }
      public static int getMin(){
            if(st.size()==0) return -1;
            return min;
      }
      public static void main(String[] args) {
            
      }
}
