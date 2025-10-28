package TreePW.RevesionTree.BinarySearchTree;


import java.util.*;


class Node{
       int val;
      Node left;
      Node right;

      Node (int val){
            this.val = val;
      }
}
public class GreaterSumTree {


      static int  sum;
      public void reverseinorder(Node root ){
            if(root==null) return;
            reverseinorder(root.right);
            root.val += sum;
            sum = root.val;
            reverseinorder(root.left);
      } 

      public Node convertBST(Node root) {
      sum =0;
        reverseinorder(root);
        
        return root;
    }
       
      public static void main(String[] args) {
            
      }
}
