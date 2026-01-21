package TreePW.basetreebro;

class Node{
      int val;
      Node left;
      Node right;
      
       Node(int val) {
        this.val = val;
    }
}

public class Travesaltree_06 {



        public static void inorder(Node root){
    if(root == null) return;
   
    postorder(root.left);
     System.out.print(root.val + " ");
    postorder(root.right);
        }
      

            
        public static void postorder(Node root){
    if(root == null) return;
    
    postorder(root.left);
    
    postorder(root.right);
    System.out.print(root.val + " ");
        }

      
        public static void preOrder(Node root){
    if(root == null) return;
    System.out.print(root.val + " ");
    preOrder(root.left);
    preOrder(root.right);
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
   preOrder(a);
   postorder(a);
   inorder(a);
      }
}
