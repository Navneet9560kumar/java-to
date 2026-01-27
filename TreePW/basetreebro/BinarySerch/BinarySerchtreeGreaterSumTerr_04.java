package TreePW.basetreebro.BinarySerch;

import java.util.*;


class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
      }
}
   
public class BinarySerchtreeGreaterSumTerr_04 {

      // public boolean isValidBST(Node root){
      //       List<Integer>arr = new ArrayList<>();
      //       inorder(root, arr);
      //       for(int i=1;i<arr.size();i++){
      //             if(arr.get(i)<=arr.get(i-1))return false;
      //       }
      //       return true;
      // }

      static int sum ;
 public static void reverseinorder(Node root) {
        if(root==null) return;
        reverseinorder(root.right);
       root.val+=sum;
       sum = root.val;
        reverseinorder(root.left);
     }

            public static Node bstToGst(Node root){
                 sum=0;
                  reverseinorder(root); 
                 return root;
            }
      public static void main(String[] args) {

      }
}
