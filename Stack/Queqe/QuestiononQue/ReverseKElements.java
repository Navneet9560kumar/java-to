package Stack.Queqe.QuestiononQue;

import java.util.*;

public class ReverseKElements {

      public static void reverseK(Queue<Integer> q, int k) {
            if (q.isEmpty() || k <= 0 || k > q.size()) {
                  Stack<Integer> st = new Stack<>();
                        // Step 1: Dequeue first k elements and push into stack
                        for(int i=0;i<k;i++){
                              st.push(q.remove());
                        }
                          // Step 2: Pop from stack and enqueue back
                          while (!st.isEmpty()) {
                              q.add(st.pop());
                          }
                          
        // Step 3: Move remaining elements (n-k) to the end
        int rem = q.size() - k;
        for (int i = 0; i < rem; i++) {
            q.add(q.remove());
        }
    }
            }
      

      public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;

        System.out.println("Original Queue: " + q);
        reverseK(q, k);
        System.out.println("After reversing first " + k + " elements: " + q);
    }
}

