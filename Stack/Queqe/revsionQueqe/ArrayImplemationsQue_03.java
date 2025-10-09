package Stack.Queqe.revsionQueqe;

public class ArrayImplemationsQue_03 {

    public static class queue {
        int f = 0;  // Front index
        int r = -1; // Rear index
        int size = 0;
        int[] arr = new int[100];

        // Add element to queue
        public void add(int val) {
            System.out.println("→ add(" + val + ") called");
            if (r == arr.length - 1) {
                System.out.println("Queue is full");
                return;
            }
            arr[++r] = val;
            size++;
            System.out.println("Added: " + val + ", Front=" + f + ", Rear=" + r + ", Size=" + size);
        }

        // Remove element from queue
        public int remove() {
            System.out.println("→ remove() called");
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[f++];
            size--;
            System.out.println("Removed: " + val + ", Front=" + f + ", Rear=" + r + ", Size=" + size);
            return val;
        }

        // Peek front element
        public int peek() {
            System.out.println("→ peek() called");
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            System.out.println("Peek: " + arr[f]);
            return arr[f];
        }

        // Check if empty
        public boolean isEmpty() {
            System.out.println("→ isEmpty() called");
            boolean result = (size == 0);
            System.out.println("Is empty? " + result);
            return result;
        }

        // Display queue
        public void display() {
            System.out.println("→ display() called");
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue elements: ");
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\nFront=" + f + ", Rear=" + r + ", Size=" + size);
        }
    }

    public static void main(String[] args) {
        queue q = new queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();

        q.remove();
        q.peek();
        q.display();

        q.isEmpty();
    }
}
