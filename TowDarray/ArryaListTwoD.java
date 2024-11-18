package TowDarray;

import java.util.*;

public class ArryaListTwoD {
      public static void main(String[] args) {
            List<Integer> a = new ArrayList<>();
            a.add(10); a.add(20); a.add(30);

            List<Integer> b = new ArrayList<>();
            b.add(40); b.add(50);

            List<Integer> c = new ArrayList<>();
            List<Integer> d = new ArrayList<>();

           List<List<Integer>> l = new ArrayList<>();  
           l.add(a); 
           l.add(b);
           l.add(c);
           l.add(d);

           for(int i = 0; i < l.size(); i++){
                 List<Integer> x = l.get(i);
                 for(int j = 0; j < x.size(); j++){  // Adjusted to x.size()
                       System.out.print(x.get(j) + " ");
                 }
                 System.out.println();
           }
     }
}