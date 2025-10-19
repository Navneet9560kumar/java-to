package TreePW.RevesionTree;

import javax.swing.tree.TreeNode;

class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }
}


public class SameTree_07 {

        public boolean isSameTree(Node p, Node q){
            if(p.val!=q.val)return false;
            if(isSameTree(p.left, q.left)==false)return false;
             if(isSameTree(p.right, q.right)==false)return false;
             return true; 
        }

       public static void main(String[] args) {
              Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
          Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
         c.left = f;
        c.right = g;
      }
      
}
