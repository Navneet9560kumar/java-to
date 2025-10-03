package Stack.RevrsionStack;

import TreePW.boolen;

public class ArrayImplementision {

      public static class Stack{
            private int[]arr = new int[5];
            private int idx = 0;
            void push(int x){
                  if(isFull()){
                        System.out.println("Stack is full");
                        return;
                  }
                  arr[idx] = x;
                  idx++;
            }
            int peek(){
                  if(idx==0){
                        System.out.println("Stack is empty");
                        return -1;
                  }
                  return arr[idx-1];
            }
            int pop(){
                  if(idx==0) {
                        System.out.println("Stack is empty!");
                        return -1;
                  }
              int top = arr[idx-1];
              idx--;
              return top;
            }
            void display(){
                  for (int i = idx-1; i >=0 ; i--) {
                        System.out.println(arr[i] + " ");
                  }
            } 
            int size(){
                  return idx;
            }
            boolean isEmpty(){
                  return idx==0;
            }
            boolean isFull(){
                  if(idx==arr.length) {
                        return true;
                  }else{
                        return false;
                  }
                 
            }
      public static void main(String[] args) {
            Stack st = new Stack();
            st.push(1);
            st.push(2);
            st.push(3);
            // System.out.println(st.peek());
            st.display();
            st.pop();
            System.out.println("After pop");
            st.display();
      }
}
} 


///1047 leetcode
/// 
/// 
