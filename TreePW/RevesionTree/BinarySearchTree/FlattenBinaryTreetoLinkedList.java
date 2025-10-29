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

public class FlattenBinaryTreetoLinkedList {

      // public void preorder(Node root,List<Node> pre){
      //       if(root==null) return;
      //       pre.add(root);
      //       preorder(root.left,pre);
      //       preorder(root.right,pre);
      // }

      // public void flatten(Node root) {
      //       List<Node> pre  =new ArrayList<>();
      //       preorder(root,pre);
      //       for (int i = 0; i < pre.size(); i++) {
      //             if(i!=pre.size()-1) pre.get(i).right = pre.get(i+1);
      //             pre.get(i).left = null;
      //       }
      // }

      //method 2 

  public Node flatten(Node root) {
      if(root==null) return null;
      if(root.left==null && root.right==null)return root;
            Node lst = flatten(root.left);
            Node rst = flatten(root.right);
            flatten(lst);
            flatten(rst);
            root.left = null;
            root.right = lst;
            Node temp = root;
            while(temp.right!=null) temp = temp.right;
            return temp.right = rst;
      }
      
//     h= p+ b
      public static void main(String[] args) {
            
      }
}
