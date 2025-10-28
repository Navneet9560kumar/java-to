package TreePW.RevesionTree.BinarySearchTree;



class Node{
      int val;
      Node left;
      Node right;


      Node (int val){
            this.val = val;
      }
}
public class DeleteNodeInABST_450 {


      public static Node Inorderpredecessor(Node root){
            Node temp = root.left;
            while (temp.right !=null) temp = temp.right;
            return temp;
      }

      
      public static Node parent(Node root,Node pred){
            Node temp = root.left;
            while (temp.right !=pred) temp = temp.right;
            return temp;
      }

      public Node deleteNode(Node root, int key){

            if(root==null) return null;

            if(root.val==key){ //delection(There are a 3 case in this term ok) case 1
                  if(root.left==null && root.right==null){
                        return null;
                  }
                  //case 2 
                 else if(root.left==null || root.right==null){
                        if(root.left==null)return root.right;
                        else return root.left;
                  }

                  //case 3  to isame hamko root node delete karna hai to hamko to hamko ye karna hogga ke root jo bhi hata raeh hai us se ek chhota jo usko lga de or sara kaam ho jayega 2 tarike hai karne ke {replce key node with inorder predecessor}

                  else{
                        Node pred = Inorderpredecessor(root);
                        Node predParent = parent(root,pred);
                        if(root==predParent){
                              pred.right = root.right;
                              return pred;
                        }
                        predParent.right = null;
                        pred.left = root.left; pred.right= root.right;
                        return pred;
                  }

            }else if(root.val>key){ //LCS well chnage 
                  root.left = deleteNode(root.left, key);
            }else{ // RST well chnage 
                  root.right = deleteNode(root.right, key);
            }
return root;
      }
      TreeNode
      public static void main(String[] args) {
            
      }
}
