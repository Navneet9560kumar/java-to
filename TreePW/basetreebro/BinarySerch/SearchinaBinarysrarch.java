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

public class SearchinaBinarysrarch {

        public Node searchBST(Node root, int val){
                 if (root == null) return null;
                 if(root.val<val)return searchBST(root.right, val);
                  else if(root.val>val) return searchBST(root.left, val);
                  else return root;
        }


       
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] result = new int[n];
        
        boolean skip = false;
        
        int i = 0; // deck
        int j = 0; // result
        
        Arrays.sort(deck);
        
        while (i < n) {
            if (result[j] == 0) { // khali hai
                if (!skip) {
                    result[j] = deck[i];
                    i++;
                }
                
                skip = !skip; // alternate
            }
            
            j = (j + 1) % n;
        }
        
        return result;
    }

     public void solve(char[][] arr) {
        int m= arr.length;
        int n = arr[0].length;
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                  if()
            }
        }
    }
    public static void main(String[] args) {
               
      }

}