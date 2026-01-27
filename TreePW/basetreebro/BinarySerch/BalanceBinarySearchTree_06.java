package TreePW.basetreebro.BinarySerch;

import java.util.*;
import javax.swing.tree.TreeNode;

class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
      }
}

public class BalanceBinarySearchTree_06 {

      public static void inorder(Node root, List<Integer> arr) {
            if (root == null)
                  return;
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
      }

      public static Node buildBalanced(List<Integer> arr, int lo, int hi){
            if(lo>hi) return null;
            int mid = (lo+hi)/2;

            Node root = new Node(arr.get(mid));
            root.left = buildBalanced(arr, lo, mid-1);
            root.right = buildBalanced(arr, mid+1, hi);

            return root;
      } 

      public static Node balanceBST(Node root) {
            List<Integer> arr = new ArrayList<>();
            inorder(root, arr); // step 1
            return buildBalanced(arr, 0, arr.size() - 1); // step 2
      }

      public static void main(String[] args) {

      }
}

// BST
//  ↓ inorder
// Sorted list
//  ↓ mid element
// Balanced BST
