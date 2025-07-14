package RrvisionArrya.ArryalistTwoD;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

        public List<List<Integer>> generate(int n){
            List<List<Integer>> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                  List<Integer>l = new ArrayList<>();
                  for (int j = 0; j <= i; j++) {
                        if (j == 0 || j == i) {
                              l.add(1);
                  ans.add(l);
                  
            }
          ans.add(l);
        }
          
        for (int i = 2; i < n; i++) {
            for(j=1;j<=1;j++){
                  
            }
        }
            }
      }
}
            



// l.get(i).get(j) = l.get(i-1).get(j)+ l.get(i-1).get(j-1);