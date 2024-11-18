package TreePW;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class two {
    // Display method (preorder traversal)
    public static void display(Node root) {
        if (root == null) return;
        System.out.println(root.val + " ");
        display(root.left);
        display(root.right);
    }

    // Method to calculate the sum of all nodes
    public static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    // Method to find the maximum value in the tree
    public static int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);

        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(60);
        Node g = new Node(10);
        Node h = new Node(20);

        // Building the tree structure correctly
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = g;
        c.right = f;
        e.right = h;

        // Display the tree
        display(a);

        // Find the maximum value in the tree
        System.out.println("Max value: " + max(a));

        // Find the sum of all nodes
        System.out.println("Sum of all nodes: " + sum(a));
    }
}
