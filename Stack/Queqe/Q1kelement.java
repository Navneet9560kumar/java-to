package Stack.Queqe;

import java.util.*;

public class Q1kelement {

      public Queue<Integer>modifyQueue(Queue<Integer> q, int k){

            // using a auxilary stack
            Stack<Integer>st = new Stack<>();
            int n =q.size()-k;

                  return q;
            
      }
      public static void main(String[] args) {
            
      }
}



//1 we are using an auxillary stack
//2 Store frist K element of Queue in a stack & pop if from queue
//3 pop these element from the stack& push back in queue
//4  pop n-k ele from the queue & push it back into q