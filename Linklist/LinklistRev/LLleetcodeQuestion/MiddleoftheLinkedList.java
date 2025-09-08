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

public class MiddleoftheLinkedList {
      // Method 1
//       public ListNode middleNode(ListNode head){
//             ListNode temp = head;
//             int len =0;
//             while (temp!=null){
//                   temp = temp.next;
//                   len++;
//             } 
//             int mid = len/2+1;
//             temp = head;
//             for (int i = 0; i <= mid-1; i++) {
// temp = temp.next;
//             }
//             return temp;      
//       }

public ListNode middleNode(ListNode head){
      ListNode slow  = head;
      ListNode fast = head;
      // while (fast.next!=null) {
      //       slow = slow.next;
      //       fast = fast.next.next;
      // }
      // return slow;
      // ye code chalega to per only odd ke leye but even ke nahi  chalega kuki ye fast ko null pe leke jayega
      // to iske liye ham ye condition lagayenge
       while (fast!=null&& fast.next !=null) {
             slow = slow.next;
             fast = fast.next.next;
       }
       return slow;
}

}
