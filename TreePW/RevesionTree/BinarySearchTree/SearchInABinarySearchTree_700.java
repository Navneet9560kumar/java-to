package TreePW.RevesionTree.BinarySearchTree;

import java.util.*;


class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }
}

public class SearchInABinarySearchTree_700 {


      public Node searchBST(Node root, int val){
              if (root == null) return null;
            if(root.val<val) return searchBST(root.right,val);
            else if(root.val>val) return searchBST(root.left,val);
            else return root;
      }
      public static void main(String[] args) {
            
      }
}
