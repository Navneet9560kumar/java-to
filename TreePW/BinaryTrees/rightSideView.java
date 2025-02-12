import java.util.*;



class Node {
      int val;
      Node left;
      Node right;
       Node(int val) {
          this.val = val;
      }
  }


public class rightSideView {


public int levels(Node root){
      if(root==null) return 0;
       return 1 + Math.max(levels(root.left),levels(root.right));
}


      public  static void preorder(Node root, int level,List<Integer>ans){
            if(root==null) return;
            ans.set(level,root,val);
            preorder(root.left, level+1, ans);
            preorder(root.right, level+1, ans);
      }

      public List<Integer> rightSideView(Node root) {
        int n =  levels(root);
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(0);
        }
        preorder(root, n, ans);
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
