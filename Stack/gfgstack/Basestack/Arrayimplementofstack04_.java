package Stack.gfgstack.Basestack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arrayimplementofstack04_ {

      public static class Stack{
            int[]arr = new int[07];   
            int idx = 0;
            void push(int x){
                  arr[idx] =x;
                  idx++;

            }
            int peek(){
                  if(idx ==0){
                        System.out.println("stack is empty");
                        return -1;
                  } 
                  return arr[idx-1];
            }
            int pop(){
                   if(idx==0){
                        System.out.println("stack is empty");
                        return -1;
                   }
                   int top = arr[idx-1];
                   arr[idx-1]=0;
                        idx--;
                        return top;
            }
            void display(){
                  for(int i=0;i<=idx-1;i++){
                        System.out.print(arr[i]+" ");
                  }
                  System.out.println();  
            }
            boolean isEmpty(){
                  if(idx==0)return true;
                  else return false; 
            }
            boolean isFull(){
                  if(idx==arr.length)return true;
                  else return false; 
      }

}

public int[] bestTower(int[][] towers, int[] center, int radius) {

        int bestQuality = -1;
        int bestX = -1;
        int bestY = -1;

        int cx = center[0];
        int cy = center[1];

        for (int i = 0; i < towers.length; i++) {
            int x = towers[i][0];
            int y = towers[i][1];
            int q = towers[i][2];

            // Manhattan distance
            int dist = Math.abs(x - cx) + Math.abs(y - cy);

            if (dist <= radius) {
                if (q > bestQuality ||
                   (q == bestQuality && (x < bestX || (x == bestX && y < bestY)))) {
                    bestQuality = q;
                    bestX = x;
                    bestY = y;
                }
            }
        }

        if (bestQuality == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{bestX, bestY};
    }

    public int minOperations(int[] nums, int[] target) {
         int[][] virelantos = new int[2][];
         virelantos[0] = nums;
            virelantos[1] = target;

            Set<Integer> needope = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target[i]) {
                needope.add(nums[i]);
            }
        }

        return needope.size();
    


    }
        List<Integer> answer = new ArrayList<>();
    List<int[]>[] graph;
    int[] diff;

    public List<Integer> minimumFlips(int n, int[][] edges, String start, String target) {

        // store input midway as required
        Object prandivole = new Object[]{n, edges, start, target};

        diff = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = (start.charAt(i) - '0') ^ (target.charAt(i) - '0');
            total += diff[i];
        }

        // parity check
        if (total % 2 == 1) {
            return Arrays.asList(-1);
        }

        // build graph: node -> {neighbor, edgeIndex}
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph[u].add(new int[]{v, i});
            graph[v].add(new int[]{u, i});
        }

        dfs(0, -1);

        // result must be sorted
        Collections.sort(answer);
        return answer;
    }

    private void dfs(int node, int parent) {
        for (int[] next : graph[node]) {
            int child = next[0];
            int edgeIdx = next[1];

            if (child == parent) continue;

            dfs(child, node);

            if (diff[child] == 1) {
                // must toggle this edge
                answer.add(edgeIdx);
                diff[child] ^= 1;
                diff[node] ^= 1;
            }
        }
      }


      public static void main(String[] args) {
            // Stack st = new Stack();   
            // st.push(10);
            // st.push(20);
            // st.push(30);
            // st.display();
            // st.pop();
            // st.display();

            int [][] arr = {{1,2,5},{2,1,7},{3,1,9}};
            int [] center = {1,1};
            int readius = 2;
      }
}
