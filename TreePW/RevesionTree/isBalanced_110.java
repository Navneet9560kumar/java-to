package TreePW.RevesionTree;

import java.util.*;

class Node{
      int val;
      Node left;
      Node right;

      Node(int val){
            this.val = val;
      }
}
public class isBalanced_110 {

      public int levels(Node root){
            if(root==null) return 0;
            return 1+Math.max(levels(root.left),levels(root.right));
      }

      
    public boolean isBalanced(Node root){

      if(root==null) return true;
      int diff = Math.abs(levels(root.left)- levels(root.right));

      if(diff>1) return false;
      boolean lst = isBalanced(root.left);
      if(lst==false)return false;
           boolean rst = isBalanced(root.right);
           if(rst==false)return false;
           return true;

    }
      public static void main(String[] args) {
             Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        isBalanced_110 obj = new isBalanced_110();
        System.out.println(obj.isBalanced(root)); // Output: true or false
      }
}
