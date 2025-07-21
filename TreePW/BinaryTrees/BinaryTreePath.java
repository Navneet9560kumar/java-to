import java.util.*;

   class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int val){
                  this.val = val;
            }
      }
public class BinaryTreePath {
   


      public static void path(TreeNode root,  List<String>ans, String s){
            if(root==null) return;
            if(root.left==null&& root.right==null){
                  s +=root.val;
                  ans.add(s);
                  return;
            }
            path(root.left, ans,s+root.val,ans);
             path(root.right, ans,s+root.val+ "->", ans);
      }

      public List<String> binaryTreePaths(TreeNode root){
            List<String>ans = new ArrayList<>();
            path(root," ",ans);
            return ans;
      }


      public static void main(String[] args) {
            
      }
}
