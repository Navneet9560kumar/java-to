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

public class Llevelorderleetcode_05 {


      public static int levles(Node root){
            if(root==null)return 0;
            return 1+ Math.max(levles(root.left),levles(root.right));
      }

      public static void nthLevel(Node root, int level, int lvl,List<Integer>arr ){
            if(root==null) return;
            
            nthLevel(root.left, level+1, lvl,arr);
            nthLevel(root.right, level+1, lvl,arr);
      }


        public List<List<Integer>> levelOrder(Node root){
            List<List<Integer>>ans = new ArrayList<>();
            int lvl = levles(root);
            for (int i = 0; i < lvl-1; i++) {
                  for(int i=0;i<=lvl;i++){
                        List<Integer>arr = new ArrayList<>();
                        nthLevel(root,0,i,arr);
                        ans.add(arr);
                  }
                  
            }
            return ans;
        }
      public static void main(String[] args) {
            
      }
}
