package TreePW;

class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
      }
}

public class NodeofTree {

      public static void display(Node root) {
            if (root == null)
                  return;

            System.out.print(root.val + " ");
            display(root.left); // left sub tree
            display(root.right);// right sub tree

      }

      public static int sum(Node root) {
            if (root == null)
                  return 0;

            return root.val + sum(root.left) + sum(root.right);
      }

      public static int max(Node root) {
            if (root == null)
                  return Integer.MIN_VALUE;
            int a = root.val, b = max(root.left), c = max(root.right);
            return Math.max(a, Math.max(b, c));
      }

      public static int size(Node root) {
            if (root == null)
                  return 0;
            return 1 + size(root.left) + size(root.right);
      }

      public static int level(Node root) {
            if (root == null)
                  return 0;
            return 1 + Math.max(level(root.left), level(root.right));
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

            c.left = g;
            e.right = h;

            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            // a.left = null;
            display(a);
            System.out.println();
            System.out.println(sum(a));
            System.out.println(max(a));
            System.out.println(size(a));
            System.out.println(level(a));
      }
}
