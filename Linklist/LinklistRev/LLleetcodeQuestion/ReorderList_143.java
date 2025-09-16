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
public class ReorderList_143 {

      public ListNode middle(ListNode head){
            ListNode slow= head;
            ListNode fast = head;
            // null ka next nahi hota 

            while (fast.next!=null && fast.next.next!=null) {
                  slow = slow.next;
                  fast = fast.next.next;
            }
            return slow;
      }

      public ListNode reverseList(ListNode head){
            ListNode curr = head;
            ListNode prev = null;
            ListNode Next = null; // head/nul
            while (curr!=null) {
                  Next = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = Next;
            }
            return prev;
      }

     
    public void reorderList(ListNode head) {
            ListNode leftMiddleNode = middle(head);
            ListNode head2 = leftMiddleNode.next;
            leftMiddleNode.next = null;
            head2 =  reverseList(head2);
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            while (head!=null && head2!=null) {
                  temp.next = head2;
                  head2 = head2.next;
                  temp = temp.next;

            }
            if(head==null)temp.next =head2;
             if(head2==null)temp.next =head2;
             head = dummy.next;
      }
      public static void main(String[] args) {
            
      }
}
