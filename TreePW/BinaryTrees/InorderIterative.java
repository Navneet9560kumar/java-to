import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
     Node(int val) {
        this.val = val;
    }
}
public class InorderIterative {
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node temp = root;

        while (temp != null || !st.isEmpty()) {
            while (temp != null) {
                st.push(temp);
                temp = temp.left;
            }

            temp = st.pop();
            ans.add(temp.val);

            temp = temp.right;
        }

        return ans;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        InorderIterative obj = new InorderIterative();
        List<Integer> result = obj.inorderTraversal(a);
        System.out.println(result);
    }
}
