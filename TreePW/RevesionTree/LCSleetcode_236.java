package TreePW.RevesionTree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class LCSleetcode_236 {

    // Helper method to check if a node exists in a subtree
    public boolean exists(Node root, Node node) {
        if (root == null) return false;
        if (root == node) return true;
        return exists(root.left, node) || exists(root.right, node);
    }

    // Find Lowest Common Ancestor
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) return null;
        if (p == root || q == root) return root;

        boolean pInLeft = exists(root.left, p);
        boolean qInLeft = exists(root.left, q);

        if (pInLeft && qInLeft)
            return lowestCommonAncestor(root.left, p, q);
        else if (!pInLeft && !qInLeft)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }

    public static void main(String[] args) {
        // Build test tree
        /*
                  3
                 / \
                5   1
               / \ / \
              6  2 0  8
                / \
               7   4
        */
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        LCSleetcode_236 obj = new LCSleetcode_236();

        Node p = root.left;           // 5
        Node q = root.left.right.right; // 4

        Node lca = obj.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca.val);
        // ✅ Expected output: LCA of 5 and 4 is: 5
    }
}
