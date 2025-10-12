package Stack.Queqe.revsionQueqe;

public class CricularQue_05 {

    public static class Cqe {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];

        public void add(int val) throws Exception {
            // agar queue full hai to exception throw karo
            if (size == arr.length) {
                throw new Exception("Queue is full");
            }

            // agar pehla element add kar rahe ho
            if (size == 0) {
                front = rear = 0;
                arr[rear] = val;
            } 
            // agar pehle se kuch element hai
            else {
                rear = (rear + 1) % arr.length; // circular increment
                arr[rear] = val;
            }

            size++; // size badhao
        }

        public int remove() throws Exception {
            // agar queue empty hai to exception throw karo
            if (size == 0) {
                throw new Exception("Queue is empty");
            }

            // front se element nikaalo
            int val = arr[front];
            front = (front + 1) % arr.length; // circular increment
            size--; // size ghatao

            // agar queue khali ho gayi to front aur rear reset karo
            if (size == 0) {
                front = rear = -1;
            }

            return val;
        }

        public int peek() throws Exception {
            // agar queue empty hai to exception throw karo
            if (size == 0) {
                throw new Exception("Queue is empty");
            }
            // front wala element return karo
            return arr[front];
        }

        public boolean isEmpty() {
            // true return karo agar queue khali hai
            return size == 0;
        }

        public void display() {
            // agar queue empty hai to message print karo
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue elements: ");
            // front se start karke saare elements print karo
            for (int i = 0; i < size; i++) {
                int index = (front + i) % arr.length;
                System.out.print(arr[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Cqe q = new Cqe();

        q.display();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.display();

        System.out.println("Peek: " + q.peek());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());

        q.display();

        q.add(90);
        q.add(100);
        q.display();
        System.out.println("Peek: " + q.peek());
    }
}
