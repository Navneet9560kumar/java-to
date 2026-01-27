package TreePW.basetreebro.BinarySerch;


class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val=val;

      }
}

public class ValidateBinarySearch {

      public static long max(Node root){
            if(root==null)return Integer.MIN_VALUE;
            long a = root.val;
            long b= max(root.left);
            long c = max(root.right);
            return Math.max(a,Math.max(b,c));
      }

      public static long min(Node root){
             if(root==null)return Integer.MAX_VALUE;
            long a = root.val;
            long b= min(root.left);
            long c = min(root.right);
            return Math.min(a,Math.min(b,c));
      }
      
        public boolean isValidBST(Node root){
            if(root==null)return true;

           if(root.val<=max(root.left))return false;
           if(root.val>=min(root.right)) return false;
                 return isValidBST(root.left)&& isValidBST(root.right);
        }
      public static void main(String[] args) {
            
      }
}
