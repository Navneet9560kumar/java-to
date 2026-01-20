package TreePW.basetreebro;


class Node{
      int val;
      Node left;
      Node right;
      
       Node(int val) {
        this.val = val;
    }
}
public class Sizeofarray_05 {

      public static int size(Node root){
            if(root== null) return 1;
            return 1 + size(root.left) + size(root.right);
      }

      public static int level(Node root){
            if(root== null) return 0;
            return 1 + Math.max(level(root.left),level(root.right));
      }

      
        public static void display(Node root){
    if(root == null) return;
    System.out.print(root.val + " ");
    display(root.left);
    display(root.right);
}
      public static void main(String[] args) {
             Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(4);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        display(a);
      
      }
}
