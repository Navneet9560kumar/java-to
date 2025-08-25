package DynamicProgramming.AdityaVermadp.DPONTREE;



class Node{
      int val;
      Node left, right;

      Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
      }


public static int solve(Node root, int[]res){
      if(root==null) return 0;

      int left = solve(root.left,res);
      int right = solve(root.right,res);

      int diameter = left+ right;

      return res[0] = Math.max(res[0],diameter);

      // return hight of current subtree
}
public class DiameterofaBinaryTree {
      public static void main(String[] args) {
             Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // 🔹 res[0] will store the final answer
        int[] res = new int[1];
        res[0] = 0;

        // 🔹 Run the solve function
        solve(root, res);

        // 🔹 Print the diameter (in edges)
        System.out.println("Diameter of Tree (in edges): " + res[0]);
      }
}
}
