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
public class LowestCommen_09 {

      public boolean exists(Node root, Node node){
            if(node==root) return true;
            if(node==null)return false;
            return exists(root.left, node) || exists(root.right, node);
      }

          public Node lowestCommonAncestor(Node root, Node p, Node q){
            if(p==root || q==root)return root;
            boolean pLiesInLst = exists(root.left, p);
             boolean qLiesInLst = exists(root.left, q);
            
           if(pLiesInLst==true && qLiesInLst==true)return lowestCommonAncestor(root.left, p, q);
              if(pLiesInLst==false && qLiesInLst==false)return lowestCommonAncestor(root.right, p, q);
              else return root;

          }
      public static void main(String[] args) {
            
      }
}              
