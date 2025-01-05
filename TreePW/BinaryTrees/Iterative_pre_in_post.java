import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Iterative_pre_in_post {

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;  
        a.right = c; 
        b.left = d;  
        b.right = e; 
        c.left = f;  
        c.right = g; 
        e.left = h;
        f.right = i;

        System.out.println("Pre-order Traversal without recursion:");
        List<Integer> preOrderResult = preorderTraversal(a);
        for (Integer val : preOrderResult) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Post-order Traversal without recursion:");
        List<Integer> postOrderResult = postTraversal(a);
        for (Integer val : postOrderResult) {
            System.out.print(val + " ");
        }
    }

    public static List<Integer> preorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root != null) st.push(root);

        while (!st.isEmpty()) {
            Node top = st.pop();
            ans.add(top.val);
            if (top.right != null) st.push(top.right);
            if (top.left != null) st.push(top.left);
        }
        return ans;
    }

    public static List<Integer> postTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        if (root != null) st.push(root);

        while (!st.isEmpty()) {
            Node top = st.pop();
            ans.add(top.val);
            if (top.left != null) st.push(top.left);
            if (top.right != null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}
