package Linklist.Queue;



public class linklistimp {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        // Add an element to the queue
        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        // Peek the front element of the queue
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        // Remove the front element from the queue
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            if (size == 0) { // If the queue is now empty, reset tail to null
                tail = null;
            }
            return x;
        }

            public boolean isEmpty(){
                  if(size==0){
                        return true;
                       
                  }
                                    return false;
            }
            
            public void display(){
                  Node temp = head;
                  while (temp !=null) {
                     System.out.println(temp.val + " ");
                     temp  = temp.next;   
                  }
                  System.out.println();
            }


        // Get the size of the queue
        public int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.display();
        System.out.println("Peek: " + queue.peek()); // Output: 10
        System.out.println("Removed: " + queue.remove()); // Output: 10
        System.out.println("Peek: " + queue.peek()); // Output: 20
        System.out.println("Queue size: " + queue.getSize()); // Output: 2
    }
}
