package MAPS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}




public class hashtree {
        

      public static void topview(Node root){
           HashMap<Integer, Integer> map = new HashMap<>(); 
           Queue<Pari> q= new LinkedList<>();
           q.add(new Pari(root, 0));

      }


      public static void main(String[] args) {
            
      }
}
