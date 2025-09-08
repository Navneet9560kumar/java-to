package Linklist.LinklistRev;

class Node{
      int val;
      Node next;
      Node(int val){
            this.val = val;
      }
}

public class ShallowCopyofANode {
public static void main(String[] args) {
      Node a = new Node(10);
      Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);
            Node f = new Node(72);
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      e.next = f;

      Node temp = a; // shallw copy  = SC ke help se ham chae to A ke value  balad bhi sakte hai ham  ok 
//      temp.val =12;
//      System.out.println(a.val); // 12 => a ke value 12 ho gayi hai ok bro 10 hone ke baad bhi 

//      for (int i = 0; i < 5; i++) {
//        System.out.println(temp.val);
//      } ab size pata nahi hai hmako to ham for loop use nahi kar sakte hai o ham logo ko ham ye use karna padega aase while lagaye ham jab tak null na ho jaye vo 
while (temp != null) {
      System.out.print(" " + temp.val);
      temp = temp.next;
}


}
}

