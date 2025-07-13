package DynamicProgramming;

public class MaximumMatching {

    // ✅ Custom TreeNode class
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    // ✅ Method to compute height of the tree
    public static int levels(TreeNode root) {
        if (root == null) return 0;

        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);  // 🔧 Fixed here

        return 1 + Math.max(leftLevels, rightLevels);
    }

    // ✅ Method to compute diameter
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int myDia = levels(root.left) + levels(root.right); // path through root
        int leftDia = diameterOfBinaryTree(root.left);
        int rightDia = diameterOfBinaryTree(root.right);

        return Math.max(myDia, Math.max(leftDia, rightDia));
    }

    // ✅ Test the logic
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int diameter = diameterOfBinaryTree(root);
        System.out.println("Diameter of Binary Tree: " + diameter);  // Expected: 3
    }
}
