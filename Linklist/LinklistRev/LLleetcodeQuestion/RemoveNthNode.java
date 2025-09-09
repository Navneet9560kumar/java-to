package Linklist.LinklistRev.LLleetcodeQuestion;



 class ListNode {
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
public class RemoveNthNode {


      //     public ListNode removeNthFromEnd(ListNode head, int n){

      // ListNode temp = head;
      // int len =0;
      // while (temp!=null){
      //       temp = temp.next;
      //       len++;
      //     }
      //     if(len==n) return head.next;
      //     if(len==1) return null;
      //     // nth from end = len-n+1 from start
      //     // we need a temp  = len -n
      //     temp = head;
      //     for (int i = 1  ; i <=len-n-1; i++) {
      //       temp = temp.next;
      //     }

      //         temp.next = temp.next.next;
      //         return head;
      // }

      // method 2 


       public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode slow = head;
            ListNode fast = head;
            // move fast n steps ahead
            for (int i = 0; i <=n; i++) {
                  fast = fast.next;
            }
            if(fast == null) return head.next;
            while (fast.next != null) {
                  slow = slow.next;
                  fast = fast.next;
                  
            }
            slow.next = slow.next.next;
            return head;
       }

      public static void main(String[] args) {
          RemoveNthNode solution = new RemoveNthNode();

          // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
          ListNode head = new ListNode(1);
          head.next = new ListNode(2);
          head.next.next = new ListNode(3);
          head.next.next.next = new ListNode(4);
          head.next.next.next.next = new ListNode(5);

          // Remove the 2nd node from the end
          ListNode newHead = solution.removeNthFromEnd(head, 2);

          // Print the updated linked list
          ListNode current = newHead;
          while (current != null) {
              System.out.print(current.val + " ");
              current = current.next;
          }
      }
}
