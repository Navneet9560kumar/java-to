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
public class RemoveaDuplicatefromSortedList {

          public ListNode deleteDuplicates(ListNode head) {
            if(head==null)return null;
            ListNode a = head;
            ListNode b = head;
            while (b!=null){} {
                 if(b.val==a.val) b= b.next;
                 else{
                  a.next=b;
                  a=b;
                 } 
            }
            a.next=null;
            return head; 
          }
      public static void main(String[] args) {
            
      }
}
