package Linklist.LinklistRev.LLleetcodeQuestion;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
public class SplitLLinParts_725 {

      public int lengthofList(ListNode head){
            int n=0;
            ListNode temp = head;
            while (temp!=null) {
                  temp = temp.next;
                  n++;
            }
            return n;
      }

        public ListNode[] splitListToParts(ListNode head, int k){
            int n= lengthofList(head);
            int size = n/k;
            int extra = n%k;
            ArrayList<ListNode> arr = new ArrayList<>();
            ListNode temp =head;
            int len =1;
            while (temp!=null) {
                  int s = size;
                  if(extra>0)s++;
                  if(len==1)arr.add(temp);
                  if(len==s){
                        ListNode a= temp.next;
                        temp.next =null;
                        temp =a;
                        len =1;
                        extra--;
                  }else{
                        len++;
                        temp = temp.next;
                  }
            }
            // arr mai convert karna hai 
            ListNode[] ans =(ListNode[]) arr.toArray();
            return ans;        
      
         }
      public static void main(String[] args) {
            
      }
}
