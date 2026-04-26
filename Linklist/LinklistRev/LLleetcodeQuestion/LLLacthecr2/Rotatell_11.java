package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node {
      int val;
      Node next;

      Node(int val) {
            this.val = val;
            this.next = null;
      }
}

public class Rotatell_11 {

      public static Node rotateRight(Node head, int k) {
            if (head == null || head.next == null)
                  return head;
            Node temp = head;
            int len = 0;

            while (temp != null) {
                  temp = temp.next;
                  len++;
            }
            k = k % len;
            if (k == 0)
                  return head;

            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= k; i++) {
                  fast = fast.next;
            }
            while (fast.next != null) {
                  slow = slow.next;
                  fast = fast.next;
            }
            Node newhead = slow.next;
            slow.next = null;
            fast.next = head;
            return newhead;
      }

      public static void main(String[] args) {

      }
}
