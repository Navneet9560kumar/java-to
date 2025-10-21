package TreePW.RevesionTree;


import java.util.*;

// Node class
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

// Pair class to hold node and its level
class Pair {
    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}
public class BSTlevel {
       Node root;

    // Insert node into BST
    public Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Helper to start insertion
    public void insert(int val) {
        root = insert(root, val);
    }

    // Level Order Traversal using Pair class
    public void levelOrder() {
        if (root == null) return;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int currentLevel = 0;
        System.out.print("Level 0: ");

        while (!q.isEmpty()) {
            Pair front = q.remove();

            // Print new line when level changes
            if (front.level != currentLevel) {
                currentLevel = front.level;
                System.out.print("\nLevel " + currentLevel + ": ");
            }

            System.out.print(front.node.val + " ");

            if (front.node.left != null)
                q.add(new Pair(front.node.left, front.level + 1));

            if (front.node.right != null)
                q.add(new Pair(front.node.right, front.level + 1));
        }
    }
}

// Driver class
public class LevelOrderUsingPair {
    public static void main(String[] args) {
        BSTlevel tree = new BSTlevel();

        // Insert elements into BST
        int[] values = { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
        for (int val : values) {
            tree.insert(val);
        }

        System.out.println("🌳 Level Order Traversal of BST:");
        tree.levelOrder();
    }
}
