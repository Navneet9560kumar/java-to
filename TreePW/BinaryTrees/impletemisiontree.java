

 class Node 
 {
int val;
Node left;
Node right;
Node(int val){
      this.val= val;
   }
      
}



public class impletemisiontree {
      public static void main(String[] args) {
            Node a = new Node(1);// a is a root
            Node b = new Node(2);
            Node c = new Node(3);
            Node d = new Node(4);
            Node f = new Node(5);
            Node e = new Node(6);
            
            a.left=b; a.right=c;
            b.left=d;b.right=e;
            c.right=f;
            display(a);
      }

      public static void display(Node root){
            if(root==null) return;//Base case

            System.out.print(root.val+ " ");
            display(root.left);// left subtree
            display(root.right); // right subtree
      }


}

