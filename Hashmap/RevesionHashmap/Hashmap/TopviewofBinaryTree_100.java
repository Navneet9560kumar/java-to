package Hashmap.RevesionHashmap.Hashmap;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class TopviewofBinaryTree_100 {

    static class Pair {
        Node node;
        int level;

        Pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public static void topView(Node root) {

        if (root == null) return;

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        int minLevel = 0;
        int maxLevel = 0;

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node node = curr.node;
            int level = curr.level;

            // top view -> first occurrence only
            if (!map.containsKey(level)) {
                map.put(level, node.data);
            }

            minLevel = Math.min(minLevel, level);
            maxLevel = Math.max(maxLevel, level);

            if (node.left != null) {
                q.add(new Pair(node.left, level - 1));
            }

            if (node.right != null) {
                q.add(new Pair(node.right, level + 1));
            }
        }

        // print using min & max level
        for (int i = minLevel; i <= maxLevel; i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
               \   /
                4 5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);

        topView(root);
    }
}
