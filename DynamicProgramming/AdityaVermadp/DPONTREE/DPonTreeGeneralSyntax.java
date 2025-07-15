package DynamicProgramming.AdityaVermadp.DPONTREE;


class Node{
      int val;
      Node left, right;

      Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
      }
}

public class DPonTreeGeneralSyntax {
      // 1 step is a base case 
      // 2 HYPOTHESTS=> MAT PUCHO KE KAHA Se aaya bas visvas karo ke answer aa jayega 
      // 3 INDUCTION 
      public static  int solve(Node root, int[]res){
            if(root==null) return 0;

            // solve for left and right chid
            int left = Math.max(0,solve(root.left,res));
            int right = Math.max(0,solve(root.right,res));

            //calculate karege max path
            int temp = root.val + Math.max(left, right);
            int ans = root.val + left + right;

            // update karege golbe result
            res[0] = Math.max(res[0], ans);

            return temp;



      }
      public static void main(String[] args) {

      //   /* 
      //              10
      //             /  \
      //            2    10
      //           / \     \
      //          20  1    -25
      //                   /  \
      //                  3    4
              Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        // 🔹 Global result array
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;

        // 🔹 Run the DP function
        solve(root, res);

        // 🔹 Final answer
        System.out.println("Maximum Path Sum in Tree: " + res[0]);
      }
}
