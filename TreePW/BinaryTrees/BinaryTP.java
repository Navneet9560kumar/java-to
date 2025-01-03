import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTP {

    public static void path(Node root, String s, List<String> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }
        path(root.left, s + root.val + "->", ans);
        path(root.right, s + root.val + "->", ans);
    }

    public List<String> binaryTreePaths(Node root) {
        List<String> ans = new ArrayList<>();
        path(root, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        BinaryTP solution = new BinaryTP();

        // Create the binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);

        // Get all root-to-leaf paths
        List<String> paths = solution.binaryTreePaths(root);

        // Print the paths
        System.out.println("Binary Tree Paths: " + paths);
    }
}
