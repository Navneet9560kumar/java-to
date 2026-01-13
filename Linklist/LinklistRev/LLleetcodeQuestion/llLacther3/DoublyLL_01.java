package Linklist.LinklistRev.LLleetcodeQuestion.llLacther3;

class dNode{
      int val;
      dNode next;
      dNode prev;
      dNode(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
      }

}

public class DoublyLL_01 {

      public static void printForward(dNode head){
            dNode temp = head;
            while (temp!=null) {
                  System.out.println(temp.val + " ");
                  temp = temp.next;
            }
            System.out.println();
      }

      public static void printReverse(dNode tail){
            dNode temp = tail;
            while (temp!=null) {
                  System.out.println(temp.val + " ");
                  temp = temp.prev;
            }
            System.out.println();
      }

      public static void display(dNode node){
            dNode temp = node;
            while (temp!=null) {
                  System.out.print(temp.val + " ");
                  temp = temp.next;
            }
            System.out.println(); 
      }
      public static void main(String[] args) {
            dNode a = new dNode(10);
            dNode b = new dNode(20);
            dNode c = new dNode(30);
           dNode d = new dNode(40);
           a.next = b;   b.prev = a;
             b.next = c;   c.prev = b;
                  c.next = d;   d.prev = c;
            printForward(a);
            printReverse(d);
      }
}
