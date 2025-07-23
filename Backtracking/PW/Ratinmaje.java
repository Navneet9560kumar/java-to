package Backtracking.PW;

import java.util.ArrayList;
import java.util.Collections;

public class Ratinmaje {

    public static void solveMaze(ArrayList<String> ans, int r, int c, int[][] m, int n, String path, boolean[][] vis) {
        if (r < 0 || c < 0 || r >= n || c >= n || m[r][c] == 0 || vis[r][c]) {
            return;
        }

        // Destination reached
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        // Mark visited
        vis[r][c] = true;

        // Move Down
        solveMaze(ans, r + 1, c, m, n, path + 'D', vis);

        // Move Left
        solveMaze(ans, r, c - 1, m, n, path + 'L', vis);

        // Move Right
        solveMaze(ans, r, c + 1, m, n, path + 'R', vis);

        // Move Up
        solveMaze(ans, r - 1, c, m, n, path + 'U', vis);

        // Backtrack
        vis[r][c] = false;
    }

    public static ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans; // No path if start or end is blocked
        }

        boolean[][] vis = new boolean[n][n];
        solveMaze(ans, 0, 0, maze, n, "", vis);
        Collections.sort(ans); // Lexicographical order
        return ans;
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        ArrayList<String> paths = ratInMaze(maze);
        System.out.println(paths); // Output: [DDRDRR, DRDDRR]
    }
}
