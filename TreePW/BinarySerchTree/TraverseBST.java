package TreePW.BinarySerchTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class TraverseBST {
    // Insert a value into BST
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    // Inorder traversal (Left, Root, Right) to check BST correctness
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        TraverseBST bst = new TraverseBST();
        
        TreeNode root = null;
        root = bst.insertIntoBST(root, 10);
        root = bst.insertIntoBST(root, 5);
        root = bst.insertIntoBST(root, 15);
        root = bst.insertIntoBST(root, 3);
        root = bst.insertIntoBST(root, 7);
        root = bst.insertIntoBST(root, 18);

        System.out.print("Inorder Traversal of BST: ");
        bst.inorderTraversal(root);
        // Expected output: 3 5 7 10 15 18
    }
}
