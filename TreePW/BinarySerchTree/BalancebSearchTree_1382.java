package TreePW.BinarySerchTree;

import java.util.*;

class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
      }
}

public class BalancebSearchTree_1382 {

      public void inorder(Node root,List<Integer> list) {
         
            if (root == null)
                  return;
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
      }

      public Node buildTree(List<Integer> list,int lo ,int hi ) {
           if(lo>hi)return null;
           int mid = lo + (hi - lo) / 2;
           Node root = new Node(list.get(mid));
             root.left = buildTree(list,lo,mid-1);
                  root.right = buildTree(list,mid+1,hi); 
             return root;
      }

      

      public boolean isBalance(Node root) {
            return height(root) != -1;
      }

      private int height(Node node) {
            if (node == null)
                  return 0;

            int left = height(node.left);
            if (left == -1)
                  return -1;

            int right = height(node.right);
            if (right == -1)
                  return -1;

            if (Math.abs(left - right) > 1)
                  return -1;

            return Math.max(left, right) + 1;
      }

      public Node balanceBST(Node root) {
            List<Integer> list = new ArrayList<>();
            inorder(root, list);
            return buildTree(list, 0, list.size() - 1);
      }

      public static void main(String[] args) {

      }
}
