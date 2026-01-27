package TreePW.basetreebro.BinarySerch;



class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val=val;

      }
}

public class LCAbinary_03 {

          public static Node lowestCommonAncestor(Node root, Node p, Node q){
            if (root == null) return null;
          if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
         if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
          }
      public static void main(String[] args) {
            
      }
}
