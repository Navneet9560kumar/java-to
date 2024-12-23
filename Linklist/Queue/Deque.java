package Linklist.Queue;

public class Deque {
    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    public static class Deques {
        Node front;
        Node rear;
        int size;

        Deques() {
            front = rear = null;
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        int getSize() { // Renamed method to avoid conflict with the variable `size`
            return size;
        }

        void insertFront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                rear = front = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }

        void insertRear(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        void deleteFront() {
            if (size == 0) {
                System.out.println("Underflow");
            } else {
                front = front.next;

                if (front == null) {
                    rear = null;
                } else {
                    front.prev = null;
                }
                size--;
            }
        }

        void deleteRear() {
            if (size == 0) {
                System.out.println("Queue is empty");
            } else {
                rear = rear.prev;
                if (rear == null) {
                    front = null;
                } else {
                    rear.next = null;
                }
                size--;
            }
        }

        int getFront() {
            if (size == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return front.data;
        }

        int getRear() {
            if (size == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return rear.data;
        }
    }

    public static void main(String[] args) {
        Deques dq = new Deques(); // Correctly use the `Deques` class
        System.out.println("Insert 5 at rear end");
        dq.insertRear(5);
        System.out.println("Insert 10 at rear end");
        dq.insertRear(10);
        System.out.println("Insert 15 at front end");
        dq.insertFront(15);

        System.out.println("Front element: " + dq.getFront());
        System.out.println("Rear element: " + dq.getRear());

        System.out.println("Delete front element");
        dq.deleteFront();
        System.out.println("Front element: " + dq.getFront());

        System.out.println("Delete rear element");
        dq.deleteRear();
        System.out.println("Rear element: " + dq.getRear());
    }
}
