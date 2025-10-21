package TreePW.RevesionTree;


class Node{
      int val ;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }
}


public class DiameterodBinaryTree {


public int max(int a, int b, int c){
      return Math.max(a,Math.max(b,c));
}      

      private static int levels(Node root) {
            if (root == null)
                  return 0;
            int level = 1 + Math.max(levels(root.left), levels(root.right));
            return level;

      }
      
          public int diameterOfBinaryTree(Node root) {
            if(root==null) return 0;
            int myDia = levels(root.left) + levels(root.right);
            int leftDia = diameterOfBinaryTree(root.left);
            int rightDia = diameterOfBinaryTree(root.right);
            return max(myDia,leftDia,rightDia);
          }
  public static void main(String[] args) {
      DiameterodBinaryTree tree = new DiameterodBinaryTree();

        /*
                1
               / \
              2   3
             / \     
            4   5
               /
              6
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(6);

        int diameter = tree.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree is: " + diameter);

        // ✅ Expected Output: Diameter = 4
        // Path: [4 -> 2 -> 5 -> 6] or [6 -> 5 -> 2 -> 1 -> 3]
    }
}
