class Node {
      int val;
      Node left;
      Node right;
  
      Node(int val) {
          this.val = val;
      }
  }
  
  public class InvertBTree {
      public static Node invertTree(Node root) {
          if (root == null) return null;
  
          Node temp = root.left;
          root.left = root.right;
          root.right = temp;
  
          // Recursively invert the left and right subtrees
          invertTree(root.left);
          invertTree(root.right);
  
          return root;
      }
  
      public static void printTree(Node root) {
          if (root == null) return;
          System.out.print(root.val + " ");
          printTree(root.left);
          printTree(root.right);
      }
  
      public static void main(String[] args) {
          Node a = new Node(1);
          Node b = new Node(2);
          Node c = new Node(3);
          Node d = new Node(4);
          Node e = new Node(5);
          Node f = new Node(6);
          Node g = new Node(7);
  
          a.left = b;
          a.right = c;
          b.left = d;
          b.right = e;
          c.left = f;
          c.right = g;
  
          System.out.println("Original Tree:");
          printTree(a);
  
          Node invertedRoot = invertTree(a);
  
          System.out.println("\nInverted Tree:");
          printTree(invertedRoot);
      }
  }
   