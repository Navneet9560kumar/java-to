import java.util.LinkedList;
import java.util.Queue;

class Node {
      int val;
      Node left; // Change 'int' to 'Node'
      Node right; // Change 'int' to 'Node'
  
      Node(int val) {
          this.val = val;
      }
  }
  
  public class Traversals {
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
          preorder(a);
          System.out.println();
              inorder(a);
              System.out.println();
                  postorder(a);
      }

      public static void preorder(Node root){
            if(root==null) return;

            System.out.print(root.val+ " ");
            preorder(root.left);
            preorder(root.right);
      }

      public static void inorder(Node root){
            if(root==null) return;

           
            inorder(root.left);
            System.out.print(root.val+ " ");
            inorder(root.right);
      }
      public static void postorder(Node root){
            if(root==null) return;
             postorder(root.left);
            postorder(root.right);
            System.out.print(root.val+ " ");
      }
       public static void levelOrder(Node root){
            Queue<Node> q = new LinkedList<>();
            if(root!=null)q.add(root);
            while (q.size()>0) {
                Node front = q.remove();
                System.out.print(front.val+ " ");
                if(front.left!=null)q.add(front.left);
                if(front.right!=null)q.add(front.right);
                
            }
            System.out.println();
        }
        
  }
  

  // vase ye ek tarika hai [rint kare ka or ab ye aalaga order hai jaise ki preorder, inorder, postorder[]