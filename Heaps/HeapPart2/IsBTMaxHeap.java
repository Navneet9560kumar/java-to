package Heaps.HeapPart2;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class IsBTMaxHeap {

    public boolean isMaxHeap(Node root) {
        int n = size(root);
        return isCBT(root, 0, n) && isHeap(root);
    }

    // ✅ Size with base case
    public int size(Node root) {
        if (root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // ✅ Complete Binary Tree check
    private boolean isCBT(Node root, int i, int n) {
        if (root == null) return true;
        if (i >= n) return false;

        return isCBT(root.left, 2 * i + 1, n) && isCBT(root.right, 2 * i + 2, n);
    }

    // ✅ Heap property check
    private boolean isHeap(Node root) {
        if (root == null) return true;

        if (root.left != null && root.val < root.left.val) return false;
        if (root.right != null && root.val < root.right.val) return false;

        return isHeap(root.left) && isHeap(root.right);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(9);
        Node c = new Node(8);
        Node d = new Node(7);
        Node e = new Node(6);
        Node f = new Node(5);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;

        IsBTMaxHeap heapChecker = new IsBTMaxHeap();
        System.out.println(heapChecker.isMaxHeap(a)); // ✅ Should print true
    }
}
