package TreePW.basetreebro.BinarySerch;

import java.util.*;


class Node{
      int data;
      Node left;
      Node right;
      public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
      }
}

public class LeafSimilartree_872 {

        public boolean leafSimilar(Node root1, Node root2){
                  List<Integer> list1 = new ArrayList<>();
                  List<Integer> list2 = new ArrayList<>();
                  dfs(root1,list1);
                  dfs(root2,list2);
                  return list1.equals(list2);
        }
        public void dfs(Node root, List<Integer> list){
              if(root == null) return;
              if(root.left == null && root.right == null){
                    list.add(root.data);
              }
              dfs(root.left,list);
              dfs(root.right,list);
        }
      public static void main(String[] args) {
            
      }
}
