package Stack.Queqe.QuestiononQue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseAQueue {
      public static void main(String[] args) {
            Queue<Integer>q = new LinkedList<>(); 
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);   
            Stack<Integer>s = new Stack<>();
            while (q.size()>0) {
                  s.push(q.remove());
            }  
            while (s.size()>0) {
                  
            }
            System.out.println(q);
      }
}
