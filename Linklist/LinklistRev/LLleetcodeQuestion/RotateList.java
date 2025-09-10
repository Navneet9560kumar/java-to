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

public class RotateList {

          public ListNode rotateRight(ListNode head, int k){
    if(head==null || head.next==null || k==0) return head;
            ListNode temp = head;
            int length =0;
            while (temp!=null) {
                  temp = temp.next;
                  length++;
            }
            k%=length;
            if(head==null || head.next==null || k==0)return head;
            ListNode slow = head;
            ListNode fast = head;
            for (int i = 0; i <=k; i++) {
                  fast = fast.next;
            }
            while (fast.next!=null) {
                  slow = slow.next;
                  fast = fast.next;
                  
            }
            ListNode newHead = slow.next;
            slow.next = null;// slow is now the new tail
            fast.next = head;
            return newHead;
          }
      public static void main(String[] args) {
            
      }
}
