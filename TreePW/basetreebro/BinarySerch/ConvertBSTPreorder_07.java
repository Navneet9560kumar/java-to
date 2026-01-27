package TreePW.basetreebro.BinarySerch;


import java.util.*;

class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
      }
}

// yaha per perorder de rakaha hai  tree constructed karna hai 
public class ConvertBSTPreorder_07 {
public static Node helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
        if (prelo > prehi || inlo > inhi) return null;

        Node root = new Node(preorder[prelo]);

        // Find the root index in inorder array
        int idx = inlo;
        while (idx <= inhi && inorder[idx] != root.val) {
            idx++;
        }

        // Number of Nodes in left subtree
        int leftSize = idx - inlo;

        // Recursive construction
        root.left = helper(preorder, inorder, prelo + 1, prelo + leftSize, inlo, idx - 1);
        root.right = helper(preorder, inorder, prelo + leftSize + 1, prehi, idx + 1, inhi);

        return root;
    }

   
    

    public static Node bstFromPreorder(int[] preorder){
              int n = preorder.length;
             int[] inorder = Arrays.copyOf(preorder,n);

              Arrays.sort(inorder);
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }
       
      public static void main(String[] args) {
            
      }
}
