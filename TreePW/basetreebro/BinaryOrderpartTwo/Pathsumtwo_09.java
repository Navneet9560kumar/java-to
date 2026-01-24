package TreePW.basetreebro.BinaryOrderpartTwo;

import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

public class Pathsumtwo_09 {

    public static void helper(Node root, int target,
            List<List<Integer>> ans,
            List<Integer>arr) {

        if (root == null)
            return;
        arr.add(root.val);

        // leaf node
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                ans.add(new ArrayList<>(arr)); // ✅ copy
            }
        } else {
            helper(root.left, target - root.val, ans, arr);
            helper(root.right, target - root.val, ans, arr);
        }

        arr.remove(arr.size() - 1); // ✅ backtrack
    }

    public static List<List<Integer>> pathSum(Node root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        helper(root, targetSum, ans, arr);
        return ans;
    }

    public static void main(String[] args) {
        /*
         * 5
         * / \
         * 4 8
         * / / \
         * 11 13 4
         * / \ \
         * 7 2 1
         */

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        System.out.println(pathSum(root, 22));
    }
}
