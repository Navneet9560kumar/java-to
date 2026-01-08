package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

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


public class MiddleoftheLL_01_876 {

       public ListNode middleNode(ListNode head){
            // ListNode temp = head;
            // int len = 0;
            // while (temp!=null) {
            //     len++;
               
            // }
            // int mid = len/2+1;
            // temp = head;
            // for (int i = 1; i <= mid-1; i++) {
            //     temp = temp.next;
            // }
            // return temp;

            ListNode slow = head;
            ListNode fast = head;
            //fast.next!=null  ye tha to even ke leye ho raha tha per 
            // fir ye  fast.next != null  kar deya uske 
            while (fast!= null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
               
            }
            return slow;
        }
        

      public static void main(String[] args) {
            
      }
}
