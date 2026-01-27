package TreePW.basetreebro.BinarySerch;

import javax.swing.tree.TreeNode;

class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
      }
}
public class ConvertSortedarraytoBinarySearch_05 {

      public static Node helper(int[]arr, int lo, int hi){
            int mid = (lo+hi)/2;
            Node root = new Node(arr[mid]);
            root.left  = helper(arr,lo,mid-1);
            root.right = helper(arr,  mid+1,hi);

            return root;

      }


   


      public static Node sortedArrayToBST(int[] nums){
            int n = nums.length;
            return helper(nums, 0, n-1);
      }
   


      public static void main(String[] args) {
            
      }
}
