package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SwappingNodeLL_04 {

    public Node swapNodes(Node head, int k) {

        int count = 0;
        Node front = null;
        Node end = null;
        Node temp = head;

        while (temp != null) {
            count++;

            if (count == k) {
                front = temp;
                end = head;
            } else if (count > k) {
                end = end.next;
            }

            temp = temp.next;
        }

        swapValues(front, end);
        return head;
    }

    private void swapValues(Node node1, Node node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    public static void main(String[] args) {

    }
}
