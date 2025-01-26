import java.util.*;
import java.util.List;

import javax.swing.tree.TreeNode;

class Node {
      int val;
      Node left;
      Node right;
  
      Node(int val) {
          this.val = val;
      }
  }



public class Treepath {
       
      public static void path(Node root, String s, List<String>ans){
            if(root==null)return;
            if(root.left==null && root.right==null){
                  s +=root.val;
                  ans.add(s);
                  return;
            }

            path(root.left,s+root.val,ans);
            path(root.right,s+root.val,ans);
      }

    public static List<String> binaryTreePaths(Node root){
            List<String> ans = new ArrayList<>();
            path(root, "",ans);
            return ans;
     }

      public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
            Node f = new Node(6);
            Node g = new Node(7);
            Node h = new Node(8);
            Node i = new Node(9);
    
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.left = f;
            c.right = g;
            e.left = h;
            f.right = i;

      }
}
