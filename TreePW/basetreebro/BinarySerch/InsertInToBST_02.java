package TreePW.basetreebro.BinarySerch;



class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;

      }
}

public class InsertInToBST_02 {

      public  static void insert(Node root , int val){
            if(val<root.val){// attch to left
                  if(root.left==null)root.left = new Node(val);
                  else insert(root.left, val);
            }
             else{   //val>root.val -> attch to right
                        if(root.right==null)root.right = new Node(val);
                  else insert(root.right, val);
            }
      }

         public Node insertIntoBST(Node root, int val){
            if(root==null) return new Node(val);
            insert(root, root.val);
            return root;
         }
      public static void main(String[] args) {
            
      }
}
