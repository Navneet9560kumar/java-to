package Stack;

import java.util.Stack;

public class Largestrectangle {

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n]; // Next Smaller Element
        int[] pse = new int[n]; // Previous Smaller Element

        // **nse[] calculate kar rahe hain (Next Smaller Element)**
        st.push(n - 1); // Last index ko stack mein daal rahe hain
        nse[n - 1] = n; // Last element ka NSE hamesha 'n' hoga (koi smaller element nahi hai)

        for (int i = n - 2; i >= 0; i--) { // Peeche se start karenge
            // Jab tak stack empty nahi hota aur heights[i] se bada element hai, pop karenge
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nse[i] = n; // Agar stack empty hai toh koi chhota element nahi mila
            } else {
                nse[i] = st.peek(); // Stack ke top pe chhota element hoga
            }
            st.push(i); // Current index ko stack mein daal do
        }

        // **Stack ko empty karte hain (reuse ke liye)**
        while (!st.isEmpty()) st.pop();

        // **pse[] calculate kar rahe hain (Previous Smaller Element)**
        st.push(0); // First index ko stack mein daal rahe hain
        pse[0] = -1; // First element ka PSE hamesha '-1' hoga (koi smaller element nahi hai)

        for (int i = 1; i < n; i++) { // Left se start karenge
            // Jab tak stack empty nahi hota aur heights[i] se bada element hai, pop karenge
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pse[i] = -1; // Agar stack empty hai toh koi chhota element nahi mila
            } else {
                pse[i] = st.peek(); // Stack ke top pe chhota element hoga
            }
            st.push(i); // Current index ko stack mein daal do
        }

        // **Rectangle ka maximum area calculate karte hain**
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1); // Width = nse[i] - pse[i] - 1
            maxArea = Math.max(maxArea, area); // Maximum area update karte jao
        }
        return maxArea; // Final answer return karo
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3}; // Test case
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(heights)); // Output
    }
}
d