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


public class perorder_iterative {
         public List<Integer> preorderTraversal(TreeNode root){
            List<Integer>ans = new ArrayList<>();
            Stack<Node> st = new Stack<>();
           if(root!=null) st.push((Node) root);
            while (st.size()>0) {
                  Node top = st.pop();
                  ans.add(top.val);
                 if(top.right !=null) st.push(top.right);
                 if(top.left !=null) st.push(top.left);
            }
            return ans;

         }
         public static void main(String[] args) {
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node e = new Node(5);
    
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
         }
}
