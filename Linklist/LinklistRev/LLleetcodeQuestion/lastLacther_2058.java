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






public class lastLacther_2058 {


      public int[] nodesBetweenCriticalPoints(ListNode head){
            ListNode left = head;
            ListNode mid = head.next;
            ListNode right = head.next.next;
            int frist =-1;
            int last =-1;
            int idx =-1;
            int []arr = {-1,1};
            while (right!=null) {
                  if(mid.val<left.val && mid.val<right.val||mid.val>left.val && mid.val>right.val){
                        if(frist==-1) frist =idx;
                  last = idx;
                  }
                      idx++;
            left = left.next;
            mid = mid.next;
            right = right.next;  
            }
               if(frist==last) return arr; //0 or 1 critcal point 
               int maxDistance = last -frist;
      }
      public static void main(String[] args) {
            
      }
}
