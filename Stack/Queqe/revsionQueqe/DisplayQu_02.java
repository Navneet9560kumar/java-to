package Stack.Queqe.revsionQueqe;

import java.util.*;


public class DisplayQu_02 {
      public static void main(String[] args) {
             Queue<Integer>q = new LinkedList<>();
            q.size();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
           Queue<Integer>helper = new ArrayDeque<>();
           while (q.size()>0) {
            System.out.print(q.peek()+ " ");
            int x = q.poll();
            helper.add(x);
            
           }
           while (helper.size()>0) {
            q.add(helper.poll());
           }
      }
}
