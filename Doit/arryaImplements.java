package Doit;

public class arryaImplements {
      public static class MyStack { // Renamed to MyStack
            private int[] arr = new int[5];
            private int idx = 0;

            void push(int x) {
                  if (idx >= arr.length) {
                        System.out.println("Stack Overflow");
                        return;
                  }
                  arr[idx] = x;
                  idx++; 
            }

            int peek() {
                  if (idx == 0) {
                        System.out.println("Stack is Empty");
                        return -1;
                  }
                  return arr[idx - 1];
            }

            int pop() {
                  if (idx == 0) {
                        System.out.println("Stack is Empty");
                        return -1;
                  }
                  int top = arr[idx - 1];
                  arr[idx - 1] = 0;
                  idx--;
                  return top;
            }

            void display() {
                  for (int i = 0; i < idx; i++) {
                        System.out.print(arr[i] + " ");
                  }
                  System.out.println();
            }

            int size() {
                  return idx;
            }
      }

      public static void main(String[] args) {
           MyStack st = new MyStack(); // Corrected instantiation
           st.push(4);
           st.push(5);
           st.push(6);
           st.display(); // Output should be: 4 5 6
           System.out.println(st.size()); // Output should be 3
           st.pop();
           st.display(); // Output should be: 4 5
      }
}

