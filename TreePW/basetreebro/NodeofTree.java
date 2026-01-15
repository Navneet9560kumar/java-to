package TreePW.basetreebro;

class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;

      }
}

public class NodeofTree {
      public static void main(String[] args) {
            Node a =  new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node e = new Node(4);
            Node f = new Node(5 );

            a.left = b; a.right = c;
            b.left = e; b.right = f;
            c.right =f;

            System.out.println(b.val);
            System.out.println(a.left.val);
      }
}
