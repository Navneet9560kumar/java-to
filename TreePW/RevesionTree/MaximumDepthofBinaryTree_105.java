package TreePW.RevesionTree;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class MaximumDepthofBinaryTree_105 {

    // Helper function to build tree recursively
    public Node helper(int[] preorder, int[] inorder, int prelo, int prehi, int inlo, int inhi) {
        if (prelo > prehi || inlo > inhi) return null;

        Node root = new Node(preorder[prelo]);

        // Find the root index in inorder array
        int idx = inlo;
        while (idx <= inhi && inorder[idx] != root.val) {
            idx++;
        }

        // Number of nodes in left subtree
        int leftSize = idx - inlo;

        // Recursive construction
        root.left = helper(preorder, inorder, prelo + 1, prelo + leftSize, inlo, idx - 1);
        root.right = helper(preorder, inorder, prelo + leftSize + 1, prehi, idx + 1, inhi);

        return root;
    }

    public Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    public static void main(String[] args) {
        MaximumDepthofBinaryTree_105 obj = new MaximumDepthofBinaryTree_105();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        Node root = obj.buildTree(preorder, inorder);
        System.out.println("Tree built successfully! Root value: " + root.val);
    }
}
