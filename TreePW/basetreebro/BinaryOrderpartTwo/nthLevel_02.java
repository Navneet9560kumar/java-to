package TreePW.basetreebro.BinaryOrderpartTwo;

import java.util.*;

class Node{
      int val;
      Node left;
      Node right;
      Node(int val){
            this.val = val;

      }
}

public class nthLevel_02 {

         static int n;
      private static void NthLevel(Node root, int level){
            if(root==null)return;
            if(level==n)System.out.print(root.val+ " ");
            NthLevel(root.left, level+1);
            NthLevel(root.right, level +1);
      }


      public static void main(String[] args) {

         
                  Scanner sc = new Scanner(System.in);
       
        Node a = new Node(1);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(6);
        Node e = new Node(4);
        Node f = new Node(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        n = sc.nextInt();   // example: n = 3
        NthLevel(a, 1);  
      }
      
}
