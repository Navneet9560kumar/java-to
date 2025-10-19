package TreePW.RevesionTree;

class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;

      }
}

public class NodeofTree {
       public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        // Tree Display
        System.out.print("Preorder Display: ");
        display(a);
        System.out.println();

        // Sum of all nodes
        System.out.println("Sum of all nodes: " + sum(a));

        // Product of all nodes
        System.out.println("Product of all nodes: " + prduct(a));

        // Size (number of nodes)
        System.out.println("Size of tree: " + size(a));

        // Maximum value
        System.out.println("Maximum value: " + max(a));

        // Minimum value
        System.out.println("Minimum value: " + min(a));

        // Height / Level
        System.out.println("Height of tree: " + level(a));
    }


      private static int sum(Node root) {
            if (root == null)
                  return 0;
            return root.val + sum(root.left) + sum(root.right);
      }

      private static int size(Node root) {
            if (root == null)
                  return 0;
            return 1 + size(root.left) + size(root.right);
      }

      private static int max(Node root) {
            if (root == null)
                  return Integer.MIN_VALUE;

            int leftMax = max(root.left);
            int rightMax = max(root.right);

            return Math.max(root.val, Math.max(leftMax, rightMax));
      }

      private static int min(Node root) {
    if (root == null) return Integer.MAX_VALUE;

    int leftMax = min(root.left);
    int rightMax = min(root.right);

    return Math.min(root.val, Math.min(leftMax, rightMax));
}


      private static int level(Node root) {
            if (root == null)
                  return 0;
            int level = 1 + Math.max(level(root.left), level(root.right));
            return level;

      }

      private static void display(Node root) {
            if (root == null)
                  return;
            System.out.println(root.val + " ");
            display(root.left);// left subtree
            display(root.right);// right subtree
      }


       private static int prduct(Node root) {
            if (root == null)
                  return 1;
         return root.val * prduct(root.left) * prduct(root.right);
      }
}
