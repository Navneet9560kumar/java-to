import java.util.LinkedList;
import java.util.Queue;

class Pair {
    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class InorderPreorder {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        e.left = h;
        f.right = i;

        System.out.println("Preorder Traversal:");
        preorder(a);
        System.out.println("\n");

        System.out.println("Inorder Traversal:");
        inorder(a);
        System.out.println("\n");

        System.out.println("Level Order Traversal:");
        levelOrder(a);
        System.out.println();
    }

    public static void levelOrder(Node root) {
        int prelevel = -1; // Initialize with -1 to ensure the first level prints correctly
        Queue<Pair> q = new LinkedList<>();
        if (root != null) q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;

            if (lvl != prelevel) { // Print new line when level changes
                System.out.println();
                prelevel = lvl; // Update prelevel
            }

            System.out.print(temp.val + " ");

            if (temp.left != null) q.add(new Pair(temp.left, lvl + 1));
            if (temp.right != null) q.add(new Pair(temp.right, lvl + 1));
        }
        System.out.println();
    }

    public static void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}




// Tera Code Ka Problem Kya Tha?
// prelevel++ ka use galat ho raha tha:

// Jab naya level aata tha, toh prelevel++ kar raha tha.
// Yeh sirf ek level badhata tha, but actual level change ho bhi raha ya nahi, yeh check nahi kar raha tha.
// Is wajah se line break sahi jagah nahi aa raha tha.
// prelevel ko -1 se initialize kiya:

// Taki jab pehla node aaye (level 0) toh uske liye bhi println() ho.
// Agar prelevel = 0 rakhte, toh pehla if (lvl != prelevel) wala condition fail ho jata.
// Pehla level ek line pe chipak jata, jo ki sahi nahi hota.

// 2 nd step

// Fix Kya Kiya?
// Queue ka sahi use kiya taaki level-wise traverse ho sake.
// Jab naya level aaye, tabhi println() maaro.
// prelevel = lvl ka direct update kar diya.

// stpe 3 
// Kaise Kaam Kar Raha Hai Ab?
// Queue mein Pair object daal rahe hai, jo node aur level ko store karta hai.
// Loop chalta hai jab tak queue khali nahi ho jaye.
// Har baar ek node nikalte hai aur check karte hai:
// Agar uska level purane level se alag hai, toh ek println() maaro.
// prelevel = lvl se prelevel ko update kar do.
// Baccho ko queue mein push karo (left-right dono) aur level +1 kar ke store karo.

// Preorder Traversal:
// 1 2 4 5 8 3 6 9 7 

// Inorder Traversal:
// 4 2 8 5 1 9 6 3 7 

// Level Order Traversal:

// 1 
// 2 3 
// 4 5 6 7 
// 8 9 
