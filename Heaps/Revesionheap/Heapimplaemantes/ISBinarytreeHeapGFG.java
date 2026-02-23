package Heaps.Revesionheap.Heapimplaemantes;

import java.util.ArrayList;

class Node{
      int data;
      Node left;
      Node right;
      Node(int data){
            this.data = data;
            left=right=null;
            
      }
}

public class ISBinarytreeHeapGFG {

      public void inorder(Node tree){
            ArrayList<Integer> st = new ArrayList<>();
            if(tree==null)return;

            inorder(tree.left);

      } 

       public static  boolean isHeap(Node tree) {
        // code here
   
        if(tree==null)return null;
       

        

        
    }
      public static void main(String[] args) {
            
      }
}
