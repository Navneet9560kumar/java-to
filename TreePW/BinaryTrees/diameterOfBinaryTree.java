public class diameterOfBinaryTree {

      // Define the Node class
      static class Node {
          int val;
          Node left, right;
  
          Node(int val) {
              this.val = val;
          }
      }
  
      // Helper function to find the height of the tree
      public int level(Node root) {
          if (root == null) return 0;
          return 1 + Math.max(level(root.left), level(root.right));
      }
  
      // Function to calculate the diameter of the binary tree
      public int diameterOfBinaryTree(Node root) {
          if (root == null) return 0;
  
          int leftHeight = level(root.left);
          int rightHeight = level(root.right);
  
          int leftDiameter = diameterOfBinaryTree(root.left);
          int rightDiameter = diameterOfBinaryTree(root.right);
  
          return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
      }
  
      public static void main(String[] args) {
          diameterOfBinaryTree tree = new diameterOfBinaryTree();
  
          // Creating the tree structure
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
  
          // Calculate the diameter of the tree
          System.out.println("Diameter of the Binary Tree: " + tree.diameterOfBinaryTree(a));
      }
  }
  