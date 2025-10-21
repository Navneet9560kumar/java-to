package TreePW.RevesionTree;

import java.util.*;

class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }
}

public class BinaryTreePath_257 {

      public static void path(Node root, String s, List<String> ans){
            if(root.left==null && root.right==null){
                  s+=root.val;
                  ans.add(s);
                  return;
            }
            path(root.left, s+root.val+"->", ans);
              path(root.right, s+root.val+"->", ans);
      }


        public List<String> binaryTreePaths(Node root){
            List<String>ans = new ArrayList<>();
            path(root,"",ans);
            return ans;
        }
      public static void main(String[] args) {
             
      }
}
