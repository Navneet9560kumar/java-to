package Stack.Queqe;

public class ArryainQ {

      public static class que {

            static int f = -1;
            static int r = -1;
            static int size = 0;
            static int[] arr = new int[5];

            public void add(int val) {
                  if (r == arr.length - 1) {
                        System.out.println("Queue is full");
                        return;
                  }
                  if (f == -1 && r == -1) {
                        f = r = 0;
                        arr[r] = val;
                  } else {
                        arr[++r] = val;
                  }
                  size++;
            }

            public static int remove() {
                  if (size == 0) {
                        System.out.println("Queue is empty");
                        return -1;
                  }

                  int val = arr[f];
                  f++;
                  size--;
                  if (size == 0) { // Reset pointers when the queue becomes empty
                        f = -1;
                        r = -1;
                  }
                  return val;
            }

            public int peek() {
                  if (size == 0) {
                        System.out.println("Quse is empty");
                        return -1;
                  }
                  return arr[f];
            }

            public void display() {
                  if (size == 0) {
                        System.out.println("use is empty");
                  } else {
                        for (int i = f; i <= r; i++) {
                              System.out.print(arr[i] + ",");
                        }
                  }
                  System.out.println();
            }

            public int size() {
                  return size;
            }
            public boolean empty() {
                  return size == 0;
            } 
      }

      public static void main(String[] args) {
            que q = new que();
            System.out.println("Is queue empty? " + q.empty());
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
            q.remove();
            System.out.println(q.remove());
            System.out.println(q.size());
            System.out.println(q.peek());
            System.out.println("Is queue empty? " + q.empty());
            
      }
}
