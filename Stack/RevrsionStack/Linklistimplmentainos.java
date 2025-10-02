package Stack.RevrsionStack;

public class Linklistimplmentainos {

      public static class Node{
            int val;
            Node next;
            Node(int val){
                  this.val = val;
                  this.next = null;
            }
            public static class LLStack{
                  Node head = null;
                  int size =0;
               void push(int x){
                        Node temp= new Node(x);
                        temp.next = head;
                        head = temp;
                        size++;
               }
               int pop(){
                
                  if(head==null){
                        System.out.println("Stack is empty");
                        return -1;
                  }
                  int top = head.val;
                  head = head.next;
                  size--;
                  return top;
               }
               void display(){
                  Node temp =head;
                  while (temp!=null) {
                        System.out.print(temp.val + " ");
                        temp = temp.next;
                        
                  }
               }
                int size(){
                  return size;
            }
            }
           
      }
      public static void main(String[] args) {
             
      }
}
