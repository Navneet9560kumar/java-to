package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;


class Node{
      int val;
      Node next;
      Node(int val){
            this.val  =val;
            this.next = null;
      }
}
public class CycleLinklistpart2_07 {
              public Node detectCycle(Node head){
                  if(head==null|| head.next==null) return null;
                  Node slow = head;
                  Node fast = head;
                  while (fast!=slow&& fast.next!=null) {
                        slow = slow.next;
                        fast = fast.next.next;
                        if(fast==slow)break;
                  }
                  if(fast!=slow) return null;
                  Node temp = head;
                  while (temp!=slow) {
                        slow = slow.next;
                        temp = temp.next;
                  }
                  return slow;
              }
              
      public static void main(String[] args) {
            
      }
}
