package Linklist.LinklistRev.LLleetcodeQuestion;

class Node{
      int val;
      Node next;
      Node random;
      public Node(int val){
            this.val = val;
            this.next = null;
            this.random =null;
      }
}

public class CopyALinklistwithRandomPointer {

      public static Node deepCopy(Node head){
                Node newHead = new Node(head.val);
            Node t1 = head.next;
            Node t2 = head2;
            while (t1!=null) {
                  Node temp = new Node(t1.val);
                  t2.next = temp;
                  t2 = t2.next;
                  t1 = t1.next;
            }
            return head2;
          
      }


          public static Node copyRandomList(Node head){
      // create a deep copy 
            Node head2 = deepCopy(head);
            
          }
      public static void main(String[] args) {
            
      }
}
