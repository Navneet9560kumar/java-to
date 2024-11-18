package stacks;

import java.util.*;

public class movestackinsameorder {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Stack<Integer> st = new Stack<>();

            // int n;
            // System.out.println("Enter the number of element u want to insert ");
            // n = sc.nextInt();
            // System.out.println("Enter the element : ");
            // for (int i = 1; i <= n; i++) {
            // int x = sc.nextInt();
            // st.push(x);
            // } this for take a input for element

            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            System.out.println(st);
            // reverse order🥰🥰 
            Stack<Integer> gt = new Stack<>();
            while (st.size() > 0) {
              
                  gt.push(st.pop());
            }
            Stack<Integer> rt = new Stack<>();
            while (gt.size() > 0) {
              
                  rt.push(gt.pop());
            }
            System.out.println(rt);
      }
}

// isame hamne stack se copu bana kar daal rahe the or dekh rahe kase order mai daal sakte hai 
