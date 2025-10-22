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

// Auxillary space

// 👉 Auxiliary Space wo extra space (memory) hoti hai jo algorithm ke execution ke dauraan use hoti hai, input ke alawa.

// Matlab:

// Jo memory tumhare input data (like array, tree, etc.) ko store karne me lagti hai → wo count nahi hoti.

// Jo memory algorithm extra use karta hai (temporary variables, recursion stack, etc.) → wo Auxiliary Space kehlata hai.
//iske SPace com is a O(N) hoti hai or woste case is a or Auxillary case time com is a (logn) hoti hai ok 

public class StackpreOrderpart2_03 {

           
  public List<Integer> preorderTraversal(Node root) {
    List<Integer>ans = new ArrayList<>();
    Stack<Node>st = new Stack<>();
    if(root!=null)st.push(root);
    while (st.size()>0) {
        Node top = st.pop();
        ans.add(top.val);
       if(top.right!=null) st.push(top.right);
        if(top.left!=null)st.push(top.left);
    }
      return ans;
  }

      
      public static void main(String[] args) {
 
}
}

