package TreePW.basetreebro;

import java.util.*;

class Node{
      int val;
      Node left;
      Node right;
      
       Node(int val) {
        this.val = val;
    }
}
public class leetcodetravesla {
    

      
      public static void main(String[] args) {
            
      }

     public static void helper(Node root, List<Integer> ans) {
        // base case
        if (root == null) return;

        ans.add(root.val);        // Root
        helper(root.left, ans);   // Left
        helper(root.right, ans);  // Right
    }

      public List<Integer>perordertre(Node root){
        List<Integer> ans = new ArrayList<>();
            helper(root,ans);
            return ans;
      }
}
