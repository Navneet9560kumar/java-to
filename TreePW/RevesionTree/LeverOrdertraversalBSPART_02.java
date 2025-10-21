
package TreePW.RevesionTree;
import java.util.*;
class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val=val;

      }
}

public class LeverOrdertraversalBSPART_02 {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
          Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
         c.left = f;
        c.right = g;

      //    System.out.println("Preorder (display): ");
      //   display(a);
      //   System.out.println("\n");

      //   System.out.println("Level Order Traversal: ");
      //   levelOrder(a);
        System.out.println("Enter nth level");
        int n= sc.nextInt();
           System.out.println("Nodes at level " + n + ":");
        nthlevel(a, 1, n);
     ;
      }

      public static void nthlevel(Node root,int currlevel, int n){
            if(root==null) return;
           
            if(currlevel==n) {
                  System.out.println(root.val+ " ");
                  return;
            }
            nthlevel(root.left,currlevel+1,n);
              nthlevel(root.right,currlevel+1,n);
      }

      public static void levelOrder(Node root){
            Queue<Node> q = new ArrayDeque<>();
            if(root!=null)q.add(root);
            while (q.size()>0) {
                  Node front = q.remove();
                  System.out.println(front.val);
                  if(front.left !=null)q.add(front.left);
                   if(front.right !=null)q.add(front.right);
            }

      }

      public static void display(Node root){
            if(root==null) return ;
             System.out.print(root.val + " ");
                 display(root.left);// left subtree
            display(root.right);// right subtree
      }

        public static void perorder(Node root){
            if(root==null) return ;
             System.out.print(root.val + " ");
                 display(root.left);// left subtree
            display(root.right);// right subtree
      }

        public static void inoder(Node root){
            if(root==null) return ;
          
                 display(root.left);// left subtree
                    System.out.print(root.val + " ");
            display(root.right);// right subtree
      }

       public static void postOrder (Node root){
            if(root==null) return ;
          
                 display(root.left);// left subtree
                    System.out.print(root.val + " ");
            display(root.right);// right subtree
      }
}
