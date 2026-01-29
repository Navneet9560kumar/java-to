package TreePW.basetreebro.BinarySerch;

import java.util.*;

class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }

}

public class FlattenBinarytreetoLL_13 {

      public static void preorder(Node root, List<Node> pre){
            if(root == null) return;
            pre.add(root);
            preorder(root.left, pre);
            preorder(root.right, pre);    
      }

        public static void flatten(Node root){
            List<Node>pre = new ArrayList<>();
            preorder(root, pre);
            int n = pre.size();
            for(int i=0;i<pre.size()-1;i++){
                  Node curr = pre.get(i);
                  Node next = pre.get(i+1);
                 if(i!=n-1)pre.get(i).right = pre.get(i+1);
                 pre.get(i).left = null;
            }
        }
      public static void main(String[] args) {
            
      }
}
