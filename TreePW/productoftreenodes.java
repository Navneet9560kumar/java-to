package TreePW;



class Node {
      int val;
      Node left;
      Node right;

      Node(int val) {
            this.val = val;
      }
}

public class productoftreenodes {


      public static long product(Node root){
            if(root==null) {
                  return 1;
            }
            long leftproduct  = product(root.left);
            long rightproduct = product(root.right);

            return   (root.val*leftproduct *rightproduct);

      }
      public static void main(String[] args) {
                 Node a = new Node(1);
            Node b = new Node(41);
            Node c = new Node(3);
            Node d = new Node(5);
            Node e = new Node(6);
            Node f = new Node(60);
            Node g = new Node(10);
            Node h = new Node(20);

            c.left = g;
            e.right = h;

            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            c.right = f;
            System.out.println("the output is a " +  product(a));
      }
}
