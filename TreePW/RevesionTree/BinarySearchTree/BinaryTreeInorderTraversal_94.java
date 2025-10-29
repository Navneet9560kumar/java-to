package TreePW.RevesionTree.BinarySearchTree;

import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

public class BinaryTreeInorderTraversal_94 {

    public List<Integer> inorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Node curr = root;

        while (curr != null) {
            if (curr.left == null) {
                // Left child nahi hai -> print value aur right me move karo
                ans.add(curr.val);
                curr = curr.right;
            } else {
                // Left child hai -> predecessor find karo
                Node pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    // Thread create karo
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    // Thread tod do aur value add karo
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Example test
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        BinaryTreeInorderTraversal_94 obj = new BinaryTreeInorderTraversal_94();
        List<Integer> inorder = obj.inorderTraversal(root);
        System.out.println(inorder);  // Output: [1, 3, 2]
    }
}
