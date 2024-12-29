class Node 
{
int val;
Node left;
Node right;
Node(int val){
     this.val= val;
  }
     
}


public class findsumintree {
      public static void main(String[] args) {
            Node a = new Node(1);// a is a root
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node f = new Node(56);
            Node e = new Node(68);

            a.left=b; a.right=c;
            b.left=d; b.right=e;
            c.right=f;
            display(a);
            System.out.println();
            System.out.println("the sumis a");
            System.out.println(sum(a));
            System.out.println("The product is a ");
            System.out.println();
            System.out.println(product(a));
            System.out.println("The max is a ");
            System.out.println(max(a));
            System.out.println("This is a min element in a tree");
            System.out.println(min(a));
            System.out.println("This is a size of a tree");
            System.out.println(size(a));
      }

      private static int sum(Node root){
            if(root==null) return 0;
       return root.val + sum(root.left)+ sum(root.right);
      }

      private static int product(Node root) {
            if (root == null) return 1; 
            return root.val * product(root.left) * product(root.right); 
        }

        private static int max(Node root){
            if(root==null) return Integer.MIN_VALUE;
            int a = root.val;               
            int b = max(root.left);         
            int c = max(root.right);
            return Math.max(a, Math.max(b, c));
      }
      private static int min(Node root){
            if(root==null) return Integer.MAX_VALUE;
            int a = root.val;               
            int b = min(root.left);         
            int c = min(root.right);
            return Math.min(a, Math.min(b, c));
      }

      private static int size(Node root){
            if(root==null) return 0;
       return 1 + size(root.left)+ size(root.right);
      }


      public static void display(Node root){
            if(root==null) return;

            System.out.println(root.val+" ");
            display(root.left);
            display(root.right);
      }
}
