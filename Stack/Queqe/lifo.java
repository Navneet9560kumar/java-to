
package Stack.Queqe;

import java.util.*;

public class lifo {
      public static void main(String[] args) {
            // Stack<Integer>st = new Stack<>(); // Q ko aase nahi kar kar sakte hia kuki vo
            // abstract data type hai to iska sahi tarika ye hota hai
            Queue<Integer> q = new ArrayDeque<>();
            Queue<Integer> to = new LinkedList<>();
            // or push ke jagah ham add kar karte hai or (remove karne hai to stack mai pop use karte the) per isame ham remove use karte hai 
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q);
            q.remove();
            System.out.println(q);
            q.remove();
            System.out.println(q);
            System.out.println(q.peek());
            

      }
}
