package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val = val;
            this.next = null;
      }
}

public class ReverseLL_206_13 {
// Method 1 iterative  to reverse the linked list
      // public Node reverseList(Node head){
      //       Node curr = head;
      //       Node prev = null;
      //       Node Next = head;
      //       while (curr!=null) {
      //            Next = curr.next;
      //               curr.next = prev;
      //                   prev = curr;
      //                         curr = Next;
      //       }
      //       return prev;

       public Node reverseList(Node head){
           if(head==null || head.next==null) return head;
           Node a  =head.next;
           Node newHead = reverseList(head.next);
             a.next = head;
             head.next = null;
           return newHead;
           }
            
      // }
      public static void main(String[] args) {
            
      }
}
