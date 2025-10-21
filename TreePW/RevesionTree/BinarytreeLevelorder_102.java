package TreePW.RevesionTree;

import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class BinarytreeLevelorder_102 {

    public static int levels(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public static void nthLevel(Node root, int level, int lvl, List<Integer> arr) {
        if (root == null) return;
        if (level == lvl) {
            arr.add(root.val);
            return;
        }
        nthLevel(root.left, level + 1, lvl, arr);
        nthLevel(root.right, level + 1, lvl, arr);
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for (int i = 0; i < lvl; i++) {
            List<Integer> arr = new ArrayList<>();
            nthLevel(root, 0, i, arr);
            ans.add(arr);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        BinarytreeLevelorder_102 obj = new BinarytreeLevelorder_102();
        List<List<Integer>> res = obj.levelOrder(root);

        System.out.println(res);
    }
}
