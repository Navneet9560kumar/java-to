package TreePW.RevesionTree;

import java.util.*;

// Node class
class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class StackpostOrderpart2_04 {

    public static List<Integer> postorderTraversal(Node root) {
        List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        if (root != null) st.push(root);

        while (!st.isEmpty()) {
            Node top = st.pop();
            ans.add(top.val);
            if (top.left != null) st.push(top.left);
            if (top.right != null) st.push(top.right);
        }

        Collections.reverse(ans);
        return ans;
    }

// second method 
    private static void postorder(Node root){
      Stack<Node> st = new Stack<>();
      List<Integer>ans= new ArrayList<>();

      if(root==null) st.push(root);
      while (st.size()>0) {
            Node top = st.pop();
            ans.add(top.val);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null)st.push(top.right);
      }
        Collections.reverse(ans);
        for(int ele:ans){
            System.out.println(ele+ " ");
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> postorder = postorderTraversal(root);
        System.out.println(postorder);
    }
}
