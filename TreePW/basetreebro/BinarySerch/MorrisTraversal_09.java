package TreePW.basetreebro.BinarySerch;

import java.util.*;

class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;
      }

}

public class MorrisTraversal_09 {

 public List<Integer> inorderTraversal(Node root){
            List<Integer> ans  = new ArrayList<>();
            Node curr = root;
            while(curr != null){// left  hai 
                  if(curr.left !=null){
                        Node pred  =curr.left;
                        while(pred.right !=null && pred.right != curr) pred = pred.right;
                        if(pred.right == null){
                              pred.right = curr;
                              curr = curr.left;
                  }
                  
                  
                  else{
                        ans.add(curr.val);
                        pred.right = null;
                        curr = curr.right; 
                  } 
                  else{
                        ans.add(curr.val);
                       
                        curr = curr.right; 
                  }

            }
      }
      public static void main(String[] args) {
            
      }
}
