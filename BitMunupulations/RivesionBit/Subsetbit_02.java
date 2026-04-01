package BitMunupulations.RivesionBit;

import java.util.*;

import OOPS.bouble;



public class Subsetbit_02 {

//       public static void subsets(int[] arr){
//         int n = arr.length;
//         int total = 1 << n;   // 2^n

//         for(int i = 0; i < total; i++){
//             for(int j = 0; j < n; j++){

//                 if((i & (1 << j)) != 0){
//                     System.out.print(arr[j] + " ");
//                 }

//             }
//             System.out.println();
//         }
//     }

  public static int[] singleNumber(int[] nums) {

    int xor = 0;

    for(int n : nums){
        xor ^= n;
    }

    int diff = xor & (-xor);

    int a = 0; 
//     int b = 0;  to  ye kaam os trha kar 


    for(int n : nums){

        if((n & diff) == 0){
            a ^= n;
        }

    }

    return new int[]{a};
}
     
public static boolean hasCycle(int v, List<List<Integer>>adj){
    boolean[] vis = new boolean[v];

    for (int i = 0; i < v; i++) {
        if(!vis[i]){
            if(bfs(i,adj,vis))return true;

        }
    }
    return false;
}

public  static boolean dfs(int start, List<List<Integer>>adj, boolean[] vis){
     Queue<int[]> q = new LinkedList<>();
     q.add(new int[]{start, -1});
     vis[start] = true;

     while (!q.isEmpty()) {
        int[]curr = q.poll();
        int node =curr[0];
        int parent = curr[1];

        for( int nei: adj.get(node)){
            if(!vis[nei]){
                vis[nei] = true;
                q.add(new int[]{nei, node});
            }else if(nei != parent){
                return true;
            }
        }
     }
     return flase;
}

public static void main(String[] args) {
          
      }

      
    //   c List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer> ans = new ArrayList<>();
    //     TreeNode curr = root;

    //     while (curr != null) {
    //         if (curr.left == null) {
    //             // Left child nahi hai -> print value aur right me move karo
    //             ans.add(curr.val);
    //             curr = curr.right;
    //         } else {
    //             // Left child hai -> predecessor find karo
    //             TreeNode pred = curr.left;
    //             while (pred.right != null && pred.right != curr) {
    //                 pred = pred.right;
    //             }

    //             if (pred.right == null) {
    //                 // Thread create karo
    //                 pred.right = curr;
    //                 curr = curr.left;
    //             } else {
    //                 // Thread tod do aur value add karo
    //                 pred.right = null;
    //                 ans.add(curr.val);
    //                 curr = curr.right;
    //             }
    //         }
    //     }

    //     return ans;
    // }


    // graph mai tha 

}

