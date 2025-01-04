import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class levelorderBSF {

    static class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println("Level order traversal");
        levelorder(a);
        System.out.println("level sabke nekalege ");
        int n = sc.nextInt();
        System.out.println("Enter the level");
        nThLevel(a, 0, n);
        System.out.println();
    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void levelorder(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        if (root != null) q.add(root);
        while (q.size() > 0) {
            Node front = q.remove();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }

    public static void nThLevel(Node root, int level, int lvl) {
        if (root == null) return;
        if (level == lvl) {
            System.out.print(root.val + " ");
            return;
        }
        nThLevel(root.left, level + 1, lvl);
        nThLevel(root.right, level + 1, lvl);
    }

    public static void jode(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        if (root != null) q.add(new Pair(root, 0));
        while (q.size() > 0) {
            Pair front = q.remove();
            System.out.print(front.node.val + " ");
            if (front.node.left != null) q.add(new Pair(front.node.left, front.level + 1));
            if (front.node.right != null) q.add(new Pair(front.node.right, front.level + 1));
        }
    }
}
