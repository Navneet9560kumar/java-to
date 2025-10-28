package TreePW.RevesionTree.BinarySearchTree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class LCABinaryTree {

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) return null;

        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return root;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(0);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(9);

        Node p = root.left;  // Node 2
        Node q = root.right; // Node 8

        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA: " + lca.val);
    }
}
