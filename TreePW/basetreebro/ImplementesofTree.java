package TreePW.basetreebro;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class ImplementesofTree {

    public static void display(Node root) {
        if (root == null) return;
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

        System.out.println(a.left.val); // prints 4
        display(a); // preorder traversal
    }
}
