package Doit;

public class LLImplementations {
      public static class Node { // user-defined data type
            int val;
            Node next;

            Node(int x) {
                  this.val = x;
            }
      }

      public static class LLStack { // user-defined data structure
            private Node head = null;
            private int size = 0;

            void push(int x) {
                  Node temp = new Node(x);
                  temp.next = head;
                  head = temp; // Update head to the new node
                  size++;
            }

            int pop() {
                  if (head == null) {
                        System.out.println("List is empty!");
                        return -1;
                  }
                  int x = head.val;
                  head = head.next;
                  size--;
                  return x;
            }

            int peek() {
                  if (head == null) {
                        System.out.println("List is empty!");
                        return -1;
                  }
                  return head.val;
            }

            void displayrec(Node h) {
                  if (h == null)
                        return;
                  displayrec(h.next);
                  System.out.print(h.val);
            }

            void display() {
                  displayrec(head);
                  System.out.println();
            }

            void displayRev() {
                  Node temp = head;
                  while (temp != null) {
                        System.out.print(temp.val + " ");
                        temp = temp.next;
                  }
                  System.out.println();
            }

            int size() {
                  return size;
            }

            boolean isEmpty() {
                  return size == 0;
            }
      }

      public static void main(String[] args) {
            LLStack st = new LLStack(); // Corrected instantiation
            st.push(4);
            st.display();
            st.push(5);
            st.display();
            st.push(6);
            st.display(); // Output should be: 6 5 4
            System.out.println(st.size()); // Output should be 3
            st.pop();
            st.display(); // Output should be: 5 4
            System.out.println(st.size()); // Output should be 2
            st.push(7);
            st.push(8);
            st.display(); // Output should be: 8 7 5 4
      }
}
