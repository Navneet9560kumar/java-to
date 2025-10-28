package TreePW.RevesionTree.BinarySearchTree;

import java.util.*;

import javax.swing.tree.TreeNode;

public class ValidateBinarySearch_98 {


      
class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }
}

public static int max(Node root){
      if(root==null)return Integer.MIN_VALUE;
      int a = root.val, b= max(root.left),c = max(root.right);
      return Math.max(a,Math.max(b,c));
}

public static int min(Node root){
      if(root==null)return Integer.MAX_VALUE;
      int a = root.val, b= min(root.left),c = min(root.right);
      return Math.min(a,Math.min(b,c));
}

// public boolean isValidBST(Node root){
//       if(root==null) return true;
      
//   if(root.val<=max(root.left)) return false;
//   if(root.val>=min(root.right))return false;
//       return isValidBST(root.left)&& isValidBST(root.right);
// }
 


// method 2

public static void inorder(Node root, List<Integer>arr){
      if(root==null)return;
      inorder(root.left,arr);
      arr.add(root.val);
      inorder(root.right, arr);
}

 public boolean isValidBST(Node root){
 List<Integer>arr = new ArrayList<>();
 inorder(root, arr);

 for (int i = 1; i < arr.size(); i++) {
      if(arr.get(i)<=arr.get(i-1))return false;
 }
 return true;
 }

public static void main(String[] args) {
           
      }
}
