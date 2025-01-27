import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class pathsum {
    public void path(Node root, int currentSum, List<Integer> pathSums) {
        if (root == null) return;

        currentSum += root.val;

        // Base case: leaf node
        if (root.left == null && root.right == null) {
            pathSums.add(currentSum);
            return;
        }

        // Recursive case: traverse left and right subtrees
        path(root.left, currentSum, pathSums);
        path(root.right, currentSum, pathSums);
    }

    public boolean hasPathSum(Node root, int targetSum) {
        if (root == null) return false;

        List<Integer> pathSums = new ArrayList<>();
        path(root, 0, pathSums);

        // Check if any path sum matches the target sum
        for (int sum : pathSums) {
            if (sum == targetSum) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;

        pathsum solution = new pathsum();

        int targetSum = 5 ; // Example target sum
        boolean result = solution.hasPathSum(a, targetSum);

        System.out.println("Does the tree have a path with the sum " + targetSum + "? " + result);
    }
}
