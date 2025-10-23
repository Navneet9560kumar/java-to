package TreePW.RevesionTree;


import java.util.*;



class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class BinaryTreeRightSideView_199 {


      public int levels(Node root){
            if(root==null) return 0;
            return 1+Math.max(levels(root.left),levels(root.right)); 
      }

      public void perorder(Node root, int levels,List<Integer> ans){
            if(root==null)return;
            ans.set(levels,root.val);
            perorder(root.left, levels+1, ans);
             perorder(root.right, levels+1, ans);
      }

      public List<Integer> rightSideView(Node root){
            int n = levels(root);
            List<Integer> ans = new ArrayList<>();
            for(int i=0;i<n;i++){
                  ans.add(0);

            }
            perorder(root,0,ans);
            return ans;
      }
      public static void main(String[] args) {
            
      }
}
