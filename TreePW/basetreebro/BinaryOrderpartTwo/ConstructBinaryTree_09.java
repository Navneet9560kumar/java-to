package TreePW.basetreebro.BinaryOrderpartTwo;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class ConstructBinaryTree_09 {

    public Node helper(int[] preorder, int[] inorder,
                       int prelo, int prehi,
                       int inlo, int inhi) {

        // base case
        if (prelo > prehi || inlo > inhi) return null;

        // root
        Node root = new Node(preorder[prelo]);

        // find root in inorder
        int r = inlo;
        while (inorder[r] != root.val) {
            r++;
        }

        int leftSize = r - inlo;

        // build left & right
        root.left = helper(preorder, inorder,
                prelo + 1, prelo + leftSize,
                inlo, r - 1);

        root.right = helper(preorder, inorder,
                prelo + leftSize + 1, prehi,
                r + 1, inhi);

        return root;
    }

    public Node buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder, inorder, 0, n - 1, 0, n - 1);
    }
}
