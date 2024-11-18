package Linklist;
public class Doubaly {

      static class dNode {
            int val;
            dNode next;
            dNode prev;

            dNode(int val) {
                  this.val = val;
                  // this.next = null;
                  // this.prev = null;
            }
      }

      class DoubalyL_List{
            
      }

      public static void print(dNode head) {
            dNode temp = head;
            while (temp != null) {
                  System.out.print(temp.val + " ");
                  temp = temp.next;
            }
            System.out.println();
      }

      public static void printReverse(dNode tail) {
            dNode temp = tail;
            while (temp != null) {
                  System.out.print(temp.val + " ");
                  temp = temp.prev;
            }
            System.out.println();
      }

      public static void display(dNode node) {
            dNode temp = node;
            while (temp.prev != null) {
                  temp = temp.prev;
            }
            // ab temp hamara head per hai
            System.out.println();
            print(temp);
      }

      public static void main(String[] args) {

            Doubaly list = new Doubaly();
            dNode a = new dNode(10);
            dNode b = new dNode(20);
            dNode c = new dNode(30);
            dNode d = new dNode(40);

            a.next = b;
            d.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            print(a);
            display(c);

      }
}
