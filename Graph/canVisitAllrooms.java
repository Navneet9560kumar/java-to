package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;

public class canVisitAllrooms {

    public static boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n]; // har node ke leye vissbile hai ke nahi hai vo is leye ban rahe hai ham jaha har ghar false hai
        visited[0] = true;
        bfs(0, adj, visited); // 0 se start kar rahe hai kyuki 0 se hi sab kuch shuru hota hai

        for (boolean ele : visited) {
            if (!ele) return false; // agar koi bhi node false hai to return false kar do kyuki sabhi ghar nahi ghoome hai
        }
        return true; // agar sabhi ghoom chuke hai to return true
    }

    private static void bfs(int start, List<List<Integer>> adj, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int front = q.remove(); // queue se front nikaal rahe hai
            for (int ele : adj.get(front)) { // front se jo bhi ghar hai unhe check kar rahe hai
                if (!visited[ele]) { // agar ghar nahi ghoome hai to unhe ghoomne do
                    visited[ele] = true; // ghar ko ghoomne ke liye true kar do
                    q.add(ele); // ghar ko queue me daal do taaki unhe bhi ghoom sake
                }
            }
        }
    }

    public static void main(String[] args) {
        // Example Test Case
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(List.of(1, 3)); // Room 0 ke pass keys hain Room 1 aur 3 ki
        rooms.add(List.of(3, 0, 1)); // Room 1 ke pass keys hain Room 3, 0, aur 1 ki
        rooms.add(List.of(2)); // Room 2 ke pass sirf Room 2 ki key hai
        rooms.add(List.of(0)); // Room 3 ke pass sirf Room 0 ki key hai

        boolean result = canVisitAllRooms(rooms);
        System.out.println("Kya sabhi rooms visit kar sakte hain? " + result);
    }
}
