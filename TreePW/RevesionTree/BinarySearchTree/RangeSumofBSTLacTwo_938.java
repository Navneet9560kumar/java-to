package TreePW.RevesionTree.BinarySearchTree;



class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }
}
public class RangeSumofBSTLacTwo_938 {

       public int rangeSumBST(Node root, int low, int high){
            if(root==null) return 0;
            int sum = rangeSumBST(root.left,low,high)+ rangeSumBST(root.right,low, high);
            if(root.val>=low&& root.val<=high) sum += root.val;
            return sum;
       }
      public static void main(String[] args) {
            
      }
}
