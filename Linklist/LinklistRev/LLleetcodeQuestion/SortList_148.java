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

public class SortList_148 {



       public static ListNode merge(ListNode list1, ListNode list2){
            ListNode temp1 = list1;
            ListNode temp2 = list2;

            ListNode head = new ListNode(100);
            ListNode temp = head;
            while (temp1!=null && temp2!=null) {
                  if(temp1.val<temp2.val){
                        ListNode a = new ListNode(temp1.val);
                        temp =  a;
                        temp1 = temp1.next;
                  }else{
                 ListNode a = new ListNode(temp2.val);
                temp.next = a;
                temp = a;
                temp2= temp2.next;
            }
        }
        if(temp1==null){
            temp.next =temp2;
        }else{
            temp.next = temp1;
        }
        return head.next;
    }

      
    public static ListNode sortList(ListNode head){
            if(head==null|| head.next==null)return head;
            ListNode fristhalf  =  head;
            ListNode slow = head;
            ListNode fast = head;
            while (fast.next!=null && fast.next.next!=null) {
                  slow = slow.next;
                  fast =  fast.next.next;
            }
            ListNode secondhalf = slow.next;
            slow.next = null;
            fristhalf=sortList(fristhalf);
           secondhalf= sortList(secondhalf);
           ListNode ans = merge(fristhalf,secondhalf);
           return ans;

    }
      public static void main(String[] args) {
            
      }
}
