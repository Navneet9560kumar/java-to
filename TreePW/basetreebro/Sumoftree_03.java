package TreePW.basetreebro;

class Node{
      int val;
      Node left;
      Node right;
       Node(int val) {
        this.val = val;
    }
}

public class Sumoftree_03 {


   public static int sum(Node root) {
        if (root == null) return 1;
         return root.val * sum(root.left) * sum(root.right);

    }

    public static int productNonZero(Node root) {
    if (root == null) return 1;

    int left = productNonZero(root.left);
    int right = productNonZero(root.right);

    if (root.val == 0) {
        return left * right;   // skip zero
    }

    return root.val * left * right;
}



     public static void display(Node root){
    if(root == null) return;
    System.out.print(root.val + " ");
    display(root.left);
    display(root.right);
}

      public static void main(String[] args) {
              // Tree creation
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

        // Output
        System.out.println("Tree (Preorder):");
        display(a);

        System.out.println("\nSum of tree = " + sum(a));
       
      }
}
