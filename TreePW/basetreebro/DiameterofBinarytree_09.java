package TreePW.basetreebro;

import javax.swing.tree.TreeNode;

class Node{
      int val;
      Node right;
      Node left;
      Node(int val){
            this.val = val;
      }

}

public class DiameterofBinarytree_09 {

      public static int max(int a, int b, int c){
            return Math.max(a,Math.max(b,c));
      }


      public static int level(Node root){
            if(root==null) return 0;
            return 1+  Math.max(level(root.left),level(root.right));
      }

        public int diameterOfBinaryTree(Node root){
            int myDia =  level(root.left)+ level(root.right);
            int leftDai = diameterOfBinaryTree(root.left);
            int rightDai = diameterOfBinaryTree(root.right);
            return max(myDia,leftDai,rightDai);
        }
      public static void main(String[] args) {
            
      }
}
