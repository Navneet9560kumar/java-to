package Stack.LeetCodequestion;

import java.util.*;

public class RemoveConsecutiveSubsequences_02 {

    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                st.pop(); // remove consecutive duplicates
            }
        }

        int[] res = new int[st.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 4, 5, 7, 7, 8};
        int[] res = remove(arr);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
