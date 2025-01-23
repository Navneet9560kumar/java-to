import java.util.*;



class Node {
      int val;
      Node left; // Change 'int' to 'Node'
      Node right; // Change 'int' to 'Node'
  
      Node(int val) {
          this.val = val;
      }
  }






public class level {

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
          
            int treeLevels = levels(a);
            System.out.println("The number of levels (height) in the binary tree is: " + treeLevels);
        }
    


      public static int levels(Node root){
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(levels(root.left), levels(root.right));
      }
      
}
