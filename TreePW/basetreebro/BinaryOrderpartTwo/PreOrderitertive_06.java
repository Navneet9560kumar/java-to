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
public class PreOrderitertive_06 {

      public List<Integer>preoderTre(Node root){
            List<Integer>ans = new ArrayList<>();
            Stack<Node>st = new Stack<>();
            if(root!=null)st.push(root);
           while (st.size()>0) {
            Node top = st.pop();
            ans.add(top.val);
            if(top.right!=null)st.push(top.right);
            if(top.left!=null)st.push(top.left);
           }
           return ans;
      }
      public static void main(String[] args) {
            
      }
}
