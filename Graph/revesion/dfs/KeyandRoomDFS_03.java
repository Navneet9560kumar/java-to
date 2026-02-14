package revesionssss.dfs;

import java.util.List;

public class KeyandRoomDFS_03 {

        public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n]; 
        // har node ke leye vissbile hai ke nahi hai vo is leye ban rahe hai ham jaha har ghar false hai
        visited[0] = true;
        dfs(0, adj, visited); // 0 se start kar rahe hai kyuki 0 se hi sab kuch shuru hota hai

        for (boolean ele : visited) {
            if (!ele) return false; // agar koi bhi node false hai to return false kar do kyuki sabhi ghar nahi ghoome hai
        }
        return true; // agar sabhi ghoom chuke hai to return true
    }

      private static void dfs(int start, List<List<Integer>> adj, boolean[] visited) {
           visited[start] =true;
           for(int ele : adj.get(start)){
                 if(!visited[ele]){
                      dfs(ele,adj,visited);
                 }
           }

      }

      public static void main(String[] args) {
            
      }
}
