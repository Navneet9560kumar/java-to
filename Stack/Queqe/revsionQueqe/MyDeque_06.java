package Stack.Queqe.revsionQueqe;

import java.util.*;

public class MyDeque_06 {
      public static void main(String[] args) {
            Deque<Integer> dq =new ArrayDeque<>();
            // isame ham 6 tarha ke operaction kar sate hai jase ki add,remove,peek,poll peek,element, addFirst,addLast,removeFirst,removeLast
            dq.addLast(1);
            dq.addFirst(2);
            dq.addLast(3);
            dq.addFirst(5);
            System.out.println(dq);
            dq.removeLast();
      }
}

