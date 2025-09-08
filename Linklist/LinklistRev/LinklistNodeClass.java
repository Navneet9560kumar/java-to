package Linklist.LinklistRev;


class Node{
      int val;
      Node next;
      Node(int val){
            this.val = val;
            this.next = null;
      }
}



public class LinklistNodeClass {
      public static void main(String[] args) {
           Node a = new Node(10);
           Node b = new Node(20);
           Node c = new Node(30);
           Node d = new Node(40);
           Node e = new Node(50);
           a.next = b; 
           b.next = c;
           c.next = d;
           d.next = e;
           System.out.println(a.val + " " + b.val + " " + c.val + " " + d.val + " " + e.val);
      }
}
