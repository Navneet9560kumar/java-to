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


  

public class cycle_142 {
      public ListNode detectCycle(ListNode head){
      if(head==null || head.next==null) return null;
            ListNode slow =head;
            ListNode fast = head;

            while (fast!=null && fast.next!=null) {
                  slow = slow.next;
                  fast = fast.next.next;
                  if(fast == slow); 
                  
            }
            if(fast!=slow) return null;
            ListNode temp = head;
            while (temp!=slow) {
                  temp = temp.next;
                  slow = slow.next;
            }
            return slow;
      }

      public static void main(String[] args) {
            
      }
}
