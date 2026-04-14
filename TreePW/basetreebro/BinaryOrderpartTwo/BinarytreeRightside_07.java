package TreePW.basetreebro.BinaryOrderpartTwo;

import java.util.*;



class Node{
      int val;
       Node left;
       Node right;
       Node(int val){
            this.val = val;
       }
}

public class BinarytreeRightside_07 {

    


static Node ans = null;

public static void fun(Node root, Node p, Node q) {
    if (root == null) return;

    if (p.val < root.val && q.val < root.val) {
        fun(root.left, p, q);
    } 
    else if (p.val > root.val && q.val > root.val) {
        fun(root.right, p, q);
    } 
    else {
        ans = root;
    }
}

      public static int level(Node root){
            if(root==null) return 0;
            return 1+ Math.max(level(root.left),level(root.right));

      }
public static void perorder(Node root, int level, List<Integer>ans ){
      if(root==null) return;
     ans.set(level,root.val);
      perorder(root.left,level+1,ans);
      perorder(root.right, level+1,ans);
}

        public List<Integer> rightSideView(Node root){
             int  n = level(root);
            List<Integer>ans  = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                 ans.add(0); 
            }
            perorder(root,0,ans);
            return ans; 
        }
      public static void main(String[] args) {
           
      }
}
