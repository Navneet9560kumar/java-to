package TreePW.BinaryTrees;



 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
public class sametree {
        public boolean isSameTree(TreeNode p, TreeNode q){
            if(p==null && q== null) return true ;
            if(p==null && q!=null) return false;
            if(p!=null&& q==null) return false;
                  if(p.val  !=q.val)return false;
                  if(!isSameTree(p.left, q.left)) return false;
                    if(!isSameTree(p.right, q.right)) return false;
                    return true;

        }

        public static void main(String[] args) {
            
        }
}
