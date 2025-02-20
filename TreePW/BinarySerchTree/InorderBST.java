package TreePW.BinarySerchTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InorderBST {
    int count = 0;  // Track number of nodes visited
    int result = -1; // Store k-th smallest element

    public void inorder(TreeNode root, int k) {
        if (root == null) return;  // Base case

        inorder(root.left, k); // Traverse left subtree

        count++; // Visit current node
        if (count == k) {
            result = root.val;  // Store k-th smallest element
            return; // Stop traversal early
        }

        inorder(root.right, k); // Traverse right subtree
    }

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result; // Return k-th smallest element
    }

    public static void main(String[] args) {
        // Create BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        InorderBST obj = new InorderBST();
        int k = 3; // Find the 3rd smallest element
        System.out.println("The " + k + "rd smallest element is: " + obj.kthSmallest(root, k));
    }
}
