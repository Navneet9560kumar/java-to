package Linklist.LinklistRev.LLleetcodeQuestion.LLLacthecr2;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val  =val;
            this.next = null;
      }

}

public class Removeduplicateformsorted_09 {

          public Node deleteDuplicates(Node head){
          Node a=head;
          Node b=head;
          while (b!=null) {
            if(b.val!=a.val)b=b.next;
            else{
                  a.next=b;
                  a=b;
            }
          }
          return b;
          }
      public static void main(String[] args) {
            
      }
}
