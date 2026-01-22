package TreePW.basetreebro.BinaryOrderpartTwo;


// Breath frist search with the help of que
import java.util.*;

class Node{
      int val;
       Node left;
       Node right;
       Node(int val){
            this.val = val;
       }
}
public class levelorderterversalQue_01 {

      public static void levelOrder(Node root){
            Queue<Node>q = new LinkedList<>();
           if(root!=null) q.add(root);
           while (q.size()>0) {
            Node front = q.remove();
            System.out.print(front.val);
            if(front.left!=null)q.add(front.left);
             if(front.right!=null)q.add(front.right); 
           }
           System.out.println();
      }
      public static void display(Node root){
            if(root==null) return;
            System.out.print(root.val + " ");
            display(root.left);
            display(root.right);
      }
      public static void main(String[] args) {

            
        display(a);
        System.out.println("the level order");
        levelOrder(a);
      }
}
