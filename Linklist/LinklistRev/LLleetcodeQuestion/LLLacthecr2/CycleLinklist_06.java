package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

import Node;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val  =val;
            this.next = null;
      }
}

public class CycleLinklist_06 {
       public boolean hasCycle(Node head){
            Node slow = head;
            Node fast = head;

            while (fast!=null && fast.next!=null) {
                  slow = slow.next;
                  fast = fast.next.next;

                  if(slow==fast){
                        return true;
                  }
            }
            return false;
            
       }
      public static void main(String[] args) {
            
      }
}
