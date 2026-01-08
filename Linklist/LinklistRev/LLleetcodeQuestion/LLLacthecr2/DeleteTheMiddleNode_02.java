package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val = val;
            this.next = null;
      }
}

public class DeleteTheMiddleNode_02 {

      public Node middledelNode(Node head){
              if (head == null || head.next == null) {
        return null;
    }
       Node slow = head;
            Node fast = head;
            Node prev = null;

            while (fast !=null && fast.next !=null) {
                  prev = slow;
                  slow = slow.next;
                  fast = fast.next.next;
            }

            prev.next = slow.next;
            return head;
      }
      public static void main(String[] args) {
            
      }
}
