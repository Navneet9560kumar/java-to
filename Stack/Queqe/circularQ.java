package Stack.Queqe;

public class circularQ {

    public static class Cqa {
        static int front = -1;
        static int rear = -1;
        static int size = 0;
        static int[] arr = new int[5];

        // Add an element to the queue
        public static void add(int val) {
            if (size == arr.length) { // Queue is full
                System.out.println("Queue is full");
                return;
            }
            if (size == 0) { // First element
                front = rear = 0;
            } else if (rear == arr.length - 1) { // Circular wrap-around
                rear = 0;
            } else { // Normal case
                rear++;
            }
            arr[rear] = val;
            size++;
        }

        // Remove an element from the queue
        public static int remove() {
            if (size == 0) { // Queue is empty
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if (front == arr.length - 1) { // Circular wrap-around
                front = 0;
            } else {
                front++;
            }
            size--;
            return val;
        }

        // Peek the front element
        public static int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        // Display all elements in the queue
        public static void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        // Check if the queue is empty
        public static boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        System.out.println("Removed: " + q.remove());
        q.add(5);
        q.add(6); // This should show "Queue is full" if max size is reached
        q.display();
    }
}
