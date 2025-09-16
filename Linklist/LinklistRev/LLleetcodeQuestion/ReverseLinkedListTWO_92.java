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


public class ReverseLinkedListTWO_92 {



      public static void reverseList(ListNode head){
            ListNode curr =head;
            ListNode prev = null;
            ListNode Next = null; // head/null
            while (curr!=null) {
                  Next = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = Next;

            }
           
      }
      
    public ListNode reverseBetween(ListNode head, int left, int right){
      if(head.next==null || left == right) return head;
      ListNode a = null, b=null, c =null, d= null;
      int pos =1;
      ListNode temp = head;
      while (temp!=null) {
            if(pos==left-1) a= temp;
            if(pos==left) b= temp;
            if(pos==right) c= temp;
            if(pos==right-1) d= temp;
            temp = temp.next;
            pos++;
      }
      if(a!=null) a.next =null;
      if(c!=null)c.next = null;
         if(a!=null)a.next= null; 
         c.next = null;
      reverseList(b);
      a.next =c; b.next =d;
      return head;
    }
     public static void main(String[] args) {
      
     } 
}
