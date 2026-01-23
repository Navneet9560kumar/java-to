package TreePW.basetreebro.BinaryOrderpartTwo;



class Node{
      int val;
       Node left;
       Node right;
       Node(int val){
            this.val = val;
       }
}

public class BalancedBinaryTree_08 { 

      // diffictin of the Balanced Binary tree is |levels(lst)-levels(Rst)|<=1; mod of levels of leftsubTree and levels of rightSubtree


      public static int levels(Node root){
            if(root==null)return 0 ;
            return 1 + Math.max(levels(root.right),levels(root.left));


      }
          public boolean isBalanced(Node root){
            if(root ==null ) return true;
                  int differ=  Math.abs(levels(root.left) - levels(root.right));
                  if(differ>1) return false;
                  boolean lst = isBalanced(root.left);
                  if(lst==false)return false;
                  boolean rst = isBalanced(root.right);
                  if(rst==false)return false;
                  return true;
          }
      public static void main(String[] args) {
            
      }
}
