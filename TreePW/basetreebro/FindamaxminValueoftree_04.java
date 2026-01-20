package TreePW.basetreebro;


class Node{
      int val;
      Node left;
      Node right;
      
       Node(int val) {
        this.val = val;
    }
}
public class FindamaxminValueoftree_04 {

      public static int max(Node root){
            if(root==null)return Integer.MIN_VALUE;
       return Math.max(root.val, Math.max(max (root.left),max(root.right)));

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
        System.out.println("The max value is " +  max(a));
      }
}
