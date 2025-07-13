package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class MaximumMatchingwithHashmap {

    // ✅ Definition of TreeNode (must be declared if not imported from another class)
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    Map<TreeNode, Integer> dp;  // ✅ Memoization map
    int maxDiameter = 0;

    // ✅ Height function with memoization
    public int height(TreeNode root) {
        if (root == null) return 0;
        if (dp.containsKey(root)) return dp.get(root);

        int left = height(root.left);
        int right = height(root.right);

        // update the diameter while computing height
        maxDiameter = Math.max(maxDiameter, left + right);

        int currentHeight = 1 + Math.max(left, right);
        dp.put(root, currentHeight);  // memoize height
        return currentHeight;
    }

    // ✅ Main method to calculate diameter
    public int diameterOfBinaryTree(TreeNode root) {
        dp = new HashMap<>();
        maxDiameter = 0;
        height(root);
        return maxDiameter;
    }

    public static void main(String[] args) {
        MaximumMatchingwithHashmap solution = new MaximumMatchingwithHashmap();

        // Sample tree:     1
        //                /   \
        //               2     3
        //              / \     
        //             4   5    
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter: " + solution.diameterOfBinaryTree(root)); // Output: 3
    }
}
