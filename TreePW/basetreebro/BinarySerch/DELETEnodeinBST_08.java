package TreePW.basetreebro.BinarySerch;


class Node{
      int val; 
      Node left;
      Node  right;
      Node(int val){
            this.val = val;
      }

}

public class DELETEnodeinBST_08 {


      public static Node iop(Node root){
            Node temp = root.left;
            while (temp.right!=null)temp = temp.right ;
            return temp;
      }
         public static Node preparent(Node root){
            Node temp = root.left;
            while (temp.right!=pred)temp = temp.right ;
            return temp;
      }


      public static Node deleteNode(Node root, int key) {
        if(root==null)return null;
        if(root.val==key){// delection
            //case 1 = zero chiled node
            if(root.left==null && root.right==null) return null;

            //case 2 one chiled node
            if(root.left==null|| root.right == null){
                  if(root.left==null) return root.right;
                  else return root.left;
            }
            //case 3 
            else{
                   // replace key node with it inorder preorder

                   Node pred= iop(root);
                   Node preParent = preparent(root,pred);
                   preparent.right =null;
                   pred.left = root.left;
                   pred.right = pred.right;
                  return pred;
            }
            

        }
        else if(root.val>key){//LST will change 
            root.left = deleteNode(root.left, key);
        }else{ // root ke value key se vhhoti ho : RST will chnage 
                  root.right = deleteNode(root.right, key);
        }
    }
      public static void main(String[] args) {
            
      }
}
