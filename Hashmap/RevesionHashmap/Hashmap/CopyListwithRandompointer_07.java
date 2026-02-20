package Hashmap.RevesionHashmap.Hashmap;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListwithRandompointer_07 {

    public Node copyRandomList(Node head) {

        if (head == null) return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        // Step 1: Create copy of each node
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        temp = head;

        // Step 2: Assign next and random pointers
        while (temp != null) {
            Node copy = map.get(temp);
            copy.next = map.get(temp.next);
            copy.random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {
        // You can test here
    }
}