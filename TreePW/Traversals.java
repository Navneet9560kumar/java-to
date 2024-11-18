package TreePW;

import java.util.*;


class Node{
      int val;
      Node left;
      Node right;
      Node(int val) {
            this.val = val;
      }



}


public class Traversals {
      static int n;
      public static void preorder(Node root){
            if (root == null)
            return;
            System.out.print(root.val + " ");
            preorder(root.left); // left sub tree
            preorder(root.right);// right sub tree
      }

      public static void inorder(Node root){
            if (root == null)
            return;
            inorder(root.left); 
            System.out.print(root.val + " ");
            inorder(root.right);
      }

      public static void postorder(Node root){
            if (root == null)
            return;
            postorder(root.left); 
            postorder(root.right);
            System.out.print(root.val + " ");
      }

      public  static void levelOrder(Node root){
            Queue<Node> q =  new ArrayDeque<>();
            if(root!=null) q.add(root);
            while (q.size()>0) {
                  Node front = q.remove();
                  System.out.print(front.val+ " ");
                 if(front.left!=null) q.add(front.left);
                 if(front.right!=null)q.add(front.right);
                 System.out.println(); 
            }
            }

            public static void nThLevel(Node root, int Level){
                  if (root == null)
                      return;
                  if (Level == n)
                      System.out.print(root.val + " ");
                  nThLevel(root.left, Level + 1); // left sub tree
                  nThLevel(root.right, Level + 1); // right sub tree
              }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
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
            e.left=h;
            f.right=i;
        
            System.out.println("Preorder:");
            preorder(a);  // Preorder traversal
            System.out.println();
        
            System.out.println("Inorder:");
            inorder(a);  // Inorder traversal
            System.out.println();
        
            System.out.println("Postorder:");
            postorder(a);  // Postorder traversal
            System.out.println("Level order");
            System.out.println("Entter the n: ");
             n = sc.nextInt();
             nThLevel(a,0);
      
        }
        
}
