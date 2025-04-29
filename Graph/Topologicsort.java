
// 📘 Topological Sort – Graph Theory Notes

// 🔹 Definition:
// Topological Sort is a linear ordering of vertices in a Directed Acyclic Graph (DAG) such that for every directed edge u → v, vertex u appears before v in the ordering.

// 🔹 Applicable Only On:
// - Directed Graphs
// - Acyclic Graphs (No cycles)

// 🔹 Use Cases:
// - Task Scheduling
// - Course Prerequisite Planning
// - Build System (Compilation Order)
// - Dependency Resolution

// 🔹 Algorithms:

// 1. DFS-Based Algorithm:
//    - Perform DFS traversal.
//    - After visiting all adjacent nodes, push the current node onto a stack.
//    - At the end, reverse the stack to get the topological order.
//    - Time Complexity: O(V + E)

// 2. Kahn’s Algorithm (Using BFS and In-degree):
//    - Calculate in-degree of each node.
//    - Add nodes with in-degree 0 to a queue.
//    - While the queue is not empty:
//      - Pop a node, add it to result.
//      - Decrease in-degree of all its neighbors.
//      - If any neighbor’s in-degree becomes 0, push it to the queue.
//    - Time Complexity: O(V + E)

// 🔹 Important Points:
// - Topological Sort only works for DAGs.
// - It is not unique – multiple valid orders may exist.
// - If there is a cycle, topological sort is not possible.

// 🔹 Example:
// Graph:
//     5 → 0 ← 4
//     ↓       ↑
//     2 → 3 → 1

// Valid Topological Sort: 4 5 2 3 1 0\
// only of all nodes of the graph such that if a & b then if a &b are nodes & a->b then in the ordering a will always come before b this is pw 

import java.util.PriorityQueue;

public class Topologicsort {

      public class Triplet implements Comparable<Triplet> {
      int row;
      int col;
      int effort;
      Triplet(int row, int col,int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
       }
       public int compareTo(Triplet t){
            if(this.effort == t.effort) return this.row - t.row;
            return this.effort -t.effort;
       }
            
      }

      public int minimumEffortPath(int[][] arr) {
        int m = arr.length,n = arr[0].length;
        int [][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                  ans[i][j] = Integer.MAX_VALUE;
                  ans[0][0] =0;

                  PriorityQueue<Triplet>pq =new  PriorityQueue<>();
                  pq.add(new Triplet(0, 0, 0));
                  while(pq.size()>0){
                        Triplet top = pq.remove();
                        int  row = top.row, col = top.col, effort = top.effort;
                        if(row>0){//got up
                              int e = Math.abs(arr[row][col] -arr[row-1][col]);
                              e = Math.max(e,effort);
                              if(e<ans[row-1][col]){
                                    ans[row-1][col] =e;
                                    pq.add(new Triplet(row-1, col, e));
                              }
                        }
                  }

            }
        }
        return n;
      }
      public static void main(String[] args) {
            
      }
}
