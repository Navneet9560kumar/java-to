package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SortedLlise_12 {

    public Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        // find middle
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(second);

        return merge(left, right);
    }

    // merge two sorted lists
    public Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.val < b.val) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }
}
