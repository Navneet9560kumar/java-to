package newstacks;

public class arrayImplemntions {

    public static class CustomStack {
        private int[] arr = new int[5];
        private int idx = -1;

        void push(int x) {
            if (idx == arr.length - 1) {
                System.out.println("Stack overflow");
                return;
            }
            idx++;
            arr[idx] = x;
        }

        int pop() {
            if (idx == -1) {
                System.out.println("Stack underflow");
                return -1;
            }
            int top = arr[idx];
            idx--;
            return top;
        }

        int peek() {
            if (idx == -1) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx];
        }

        void display() {
            for (int i = 0; i <= idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx + 1;
        }
    }

    public static void main(String[] args) {
        CustomStack st = new CustomStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display(); // 1 2 3
        System.out.println(st.size()); // 3
        st.push(4);
        st.push(5);
        st.pop();
        st.display(); // 1 2 3 4
    }
}
