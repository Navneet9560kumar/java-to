package DynamicProgramming.AdityaVermadp.DPONTREE;

class Node {
      int val;
      Node left,rigth;
      Node(int val){
            this.val =val;
      }


public static int maxPathsum(Node root){
      int[]res = new int[1];
      res[0]= Integer.MIN_VALUE;
      solve(root,res);
      return res[0];
}
   private static int solve(Node root, int[] res){
      if(root==null)return 0;

      int left =Math.max(0,solve(root.left, res));
      int right = Math.max(0,solve(root.left, res));

      int currentMaxPath  =root.val + left + right;

      res[0] =Math.max(res[0],currentMaxPath);

      return root.val +Math.max(left,right);
   }
   public static void main(String[] args) {
      
   }
}
