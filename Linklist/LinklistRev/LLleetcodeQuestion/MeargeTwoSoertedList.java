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

public class MeargeTwoSoertedList {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2){
          
            ListNode dummy = new ListNode(100);
            ListNode temp = dummy;
            ListNode temp1 = list1;
            ListNode temp2 = list2;
            while (temp1!=null && temp2!=null) {
              if(temp1.val<=temp2.val){
                  temp.next = temp1;
                  temp1 = temp1.next;
                  temp = temp.next;
              }   
                  else{
                        temp.next = temp2;
                        temp2 = temp2.next;
                        temp = temp.next;
                  } 
                  if(temp1!=null)temp.next = temp1;
                  else temp.next = temp2;
                  return dummy.next;
            }
            return temp2;
        }
      public static void main(String[] args) {
            
      }
}
