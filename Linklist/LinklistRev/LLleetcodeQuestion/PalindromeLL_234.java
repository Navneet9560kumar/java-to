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

public class PalindromeLL_234 {

        public static  ListNode reverseList(ListNode head){
           if(head==null || head.next==null) return head;
           ListNode a = head.next;
           ListNode newHead = reverseList(a);
           a.next = head;
           head.next= null;
           return newHead;
        }
      // create a deep copy 
       public static  boolean isPalindrome(ListNode head) {
            if(head.next==null) return true;
            ListNode newHead = new ListNode(head.val);
            ListNode t1 = head.next;
            ListNode t2 = newHead;
             while (t1!=null) {
                  ListNode temp = new ListNode(t1.val);
                  t2 = t2.next;
                  t1 = t1.next;
             }
             newHead = reverseList(newHead);
             t1 =head;
              t2 = newHead;
              while (t1!=null) {
                  if(t1.val!=t2.val) return false;
              }
               t2 = t2.next;
                  t1 = t1.next;

                  return true;
       }
      public static void main(String[] args) {
            
      }
}
