package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node {
      int val;
      Node next;

      Node(int val) {
            this.val = val;
            this.next = null;
      }
}

public class PartitionList_13 {

      public Node partition(Node head, int x) {
            Node a = new Node(-1);
            Node b = new Node(-1);
            Node temp1 = a;
            Node temp2 = b;
            Node temp = head;
            while (temp != null) {
                  if (temp.val < x) {
                        temp1.next = temp;
                        temp1 = temp1.next;
                  } else {
                        temp2.next = temp;
                        temp2 = temp2.next;
                  }
                  temp = temp.next;
            }
            temp2.next = null;
            temp1.next = b.next;

            return a.next;
      }

      public static void main(String[] args) {

      }
}
