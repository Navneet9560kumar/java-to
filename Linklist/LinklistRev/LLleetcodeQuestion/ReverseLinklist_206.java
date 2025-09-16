package Linklist.LinklistRev.LLleetcodeQuestion;

class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
            this.val = val;
      }
      ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
      }
}

public class ReverseLinklist_206 {

      //   public ListNode reverseList(ListNode head){
      //       ListNode curr = head;
      //       ListNode prev = null;
      //       ListNode Next = head;
      //       while (curr!=null) {
      //             Next = curr.next;
      //             curr.next = prev;
      //             curr = Next;
      //       }
      //       return prev;
      //   }

      // Method 2 
        public ListNode reverseList(ListNode head){
           if(head==null || head.next==null) return head;
           ListNode a = head.next;
           ListNode newHead = reverseList(a);
           a.next = head;
           head.next= null;
           return newHead;
        }

      public static void main(String[] args) {
            
      }
}
