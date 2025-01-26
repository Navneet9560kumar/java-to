class Node {
      int val;
      Node left;
      Node right;
  
      Node(int val) {
          this.val = val;
      }
  }
  
  public class diameter {
  
      public static int level(Node root) {
          if (root == null) return 0;
          return 1 + Math.max(level(root.left), level(root.right));
      }
  
      public static int diametersBytree(Node root) {
          if (root == null) return 0;
          int myDia = level(root.left) + level(root.right);
          int leftDia = diametersBytree(root.left);
          int rightDia = diametersBytree(root.right);
          return max(myDia, leftDia, rightDia);
      }
  
      public static int max(int a, int b, int c) {
          return Math.max(a, Math.max(b, c));
      }
  
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
  
          System.out.println("Diameter of the tree: " + diametersBytree(a));
      }
  }
  