package Stack.Queqe.QuestiononQue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFristNagativeInteger_04 {

    public long[] PrintFristNagativeInteger(long A[], int N, int K) {
        long[] res = new long[N - K + 1];
        Queue<Integer> q = new LinkedList<>();

        // Step 1: Process all elements
        for (int i = 0; i < N; i++) {
            // If current element is negative → add its index
            if (A[i] < 0) {
                q.add(i);
            }

            // When we reach first window end
            if (i >= K - 1) {
                // Remove out-of-window indices
                while (!q.isEmpty() && q.peek() < i - K + 1) {
                    q.remove();
                }

                // Add result
                if (!q.isEmpty()) {
                    res[i - K + 1] = A[q.peek()];
                } else {
                    res[i - K + 1] = 0;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        PrintFristNagativeInteger_04 obj = new PrintFristNagativeInteger_04();

        long[] A = { -8, 2, 3, -6, 10 };
        int N = A.length;
        int K = 2;

        long[] ans = obj.PrintFristNagativeInteger(A, N, K);

        System.out.print("First negative integers in each window: ");
        for (long x : ans) {
            System.out.print(x + " ");
        }
    }
}
