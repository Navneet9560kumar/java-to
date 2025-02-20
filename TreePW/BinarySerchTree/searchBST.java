package TreePW.BinarySerchTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class searchBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum = 0;

        // Add root value if within range
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        // Traverse left subtree if needed
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }

        // Traverse right subtree if needed
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }

    public static void main(String[] args) {
        // Creating a sample BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        searchBST search = new searchBST();
        int result = search.rangeSumBST(root, 7, 15);
        
        System.out.println("Range Sum: " + result);  // Expected Output: 32 (7 + 10 + 15)
    }
}
