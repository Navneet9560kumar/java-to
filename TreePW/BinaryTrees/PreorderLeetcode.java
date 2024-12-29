import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class PreorderLeetcode {

    public List<Integer> preorderTraversal(Node root) {
        ans = new ArrayList<>();
        preorder(root);
        return ans;
    }

    static List<Integer> ans;

    public void preorder(Node root) {
        if (root == null) return;

        ans.add(root.val);
        preorder(root.left);
        preorder(root.right);
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

        PreorderLeetcode solution = new PreorderLeetcode();
        List<Integer> result = solution.preorderTraversal(a);

        System.out.println(result); // Output: [1, 2, 4, 5, 3]
    }
}
