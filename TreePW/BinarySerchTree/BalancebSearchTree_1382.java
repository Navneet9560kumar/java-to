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

      // Iska sabse simple tareeka hai: Inorder traversal karke values ko ek list mein bharo, aur phir un values se ek aisa tree banao jisme har node ka sirf right child ho (jaise ek Linked List hoti hai).

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


      public void printInorder(Node node) {
    if (node == null) return;
    printInorder(node.left);
    System.out.print(node.val + " ");
    printInorder(node.right);
}

      public static void main(String[] args) {
BalancebSearchTree_1382 sol = new BalancebSearchTree_1382();
Node root = new Node(10);
    root.right = new Node(20);
    root.right.right = new Node(30);
    root.right.right.right = new Node(40);

    System.out.println("Tree Balance hai? " + sol.isBalance(root));

    // Ab isko balance karte hain
    Node balancedRoot = sol.balanceBST(root);

    System.out.println("Balancing ke baad tree balance hai? " + sol.isBalance(balancedRoot));
    
    System.out.print("Balanced Tree ka Inorder: ");
    sol.printInorder(balancedRoot); // Result sorted hona chahiye

      }
}
