package TreePW.RevesionTree;


import java.util.*;
public class StackinOrderpart2_05 {

       public List<Integer> inorderTraversal(Node root){
              List<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
            Node temp = root;

      

        while (true) {
            if(temp!=null){
                  st.push(temp);
                  temp =  temp.left;
            }else{
                  if(st.size()==0) break;
                  Node top= st.pop();
                  ans.add(top.val);
                  temp = top.right;
            }
        }

        
        return ans;
       }
      public static void main(String[] args) {
            
      }
}
