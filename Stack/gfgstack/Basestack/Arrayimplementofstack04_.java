package Stack.gfgstack.Basestack;



public class Arrayimplementofstack04_ {

      public static class Stack{
            int[]arr = new int[07];   
            int idx = 0;
            void push(int x){
                  arr[idx] =x;
                  idx++;

            }
            int peek(){
                  if(idx ==0){
                        System.out.println("stack is empty");
                        return -1;
                  } 
                  return arr[idx-1];
            }
            int pop(){
                   if(idx==0){
                        System.out.println("stack is empty");
                        return -1;
                   }
                   int top = arr[idx-1];
                   arr[idx-1]=0;
                        idx--;
                        return top;
            }
            void display(){
                  for(int i=0;i<=idx-1;i++){
                        System.out.print(arr[i]+" ");
                  }
                  System.out.println();
            }
            boolean isEmpty(){
                  if(idx==0)return true;
                  else return false; 
            }
            boolean isFull(){
                  if(idx==arr.length)return true;
                  else return false; 
      }

       

}
      public static void main(String[] args) {
            Stack st = new Stack();   
            st.push(10);
            st.push(20);
            st.push(30);
            st.display();
            st.pop();
            st.display();
      }
}
