package TreePW.basetreebro;

import java.util.*;
;

class Node{
      int val;
      Node left;
      Node right;
      
       Node(int val) {
        this.val = val;
    }
}

public class InvertBinarytree_07 {

      public  void invert(Node root){
        if(root==null) return;
        if(root.left==null && root.right== null) return;
            Node temp = root.left;
            root.left = root.right;
            root.right  = temp;
            invert(root.left);
            invert(root.right);
      }

  public Node invertTree(Node root) {
        invert(root);
        return root;
    }

      public static void main(String[] args) {
             
      }
}
