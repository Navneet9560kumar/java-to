package Stack.gfgstack.Basestack;

public class LinklistimplementationsofStack_04 {

      public static class Node { // user defined data type
            int val;
            Node next;

            Node(int val) {
                  this.val = val;
                  this.next = null;
            }
      }

      public static class LLStack {
            private Node head = null;
            private int size = 0;

            void push(int x) {
                  Node temp = new Node(x);
                  temp.next = head;
                  head = temp;
                  size++;
            }

            int pop() {
                  if (head == null) {
                        System.out.println("stack is empty");
                        return -1;
                  }
                  int x = head.val;
                  head = head.next;
                  size--;
                  return x;
            }

            int peek() {
                  if (head == null) {
                        System.out.println("stack is empty");
                        return -1;
                  }
                  return head.val;
            }

            void displayrec(Node head){
                  if(head == null) return; 
                  displayrec(head.next);
                  System.out.print(head.val+" ");
            }

            void display(){
                  displayrec(head);
            }

            void displayRev() {
                  Node temp = head;
                  while (temp != null) { 
                        System.out.print(temp.val + " ");
                        temp = temp.next; // move forward
                  }
                  System.out.println();
            }

            int size() {
                  return size;
            }

            boolean isEmpty() {
                  if (size == 0)
                        return true;
                  else
                        return false;
            }
      }

      public static void main(String[] args) {
            LLStack st = new LLStack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.display();
            st.pop();
            st.display();
      }
}
