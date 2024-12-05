package string;

public class Movepiecedtoobtain {


      public boolean canChange(String start, String target){
            int n =   start.length();
            
            StringBuilder stP = new StringBuilder();
            StringBuilder tp = new StringBuilder();

            for(int i=0;i<n;i++){
                  if(stP.charAt(i) != '_'){
                        stP.append(start.charAt(i));
                  }
                  if(tp.charAt(i)!= '_'){
                        tp.append(target.charAt(i));
                  }
                  if(!stP.toString().equals(tp.toString())){
                        return false;
                  }
                  int sidx =0, tidx =0;
                  for(int i=0; i<n;i++){
                        if(start.charAt(i) != '_'){
                              while (target.charAt(tidx) == '_') {
                                    tidx++;
                                }
                                char piece = start.charAt(i);
                                if ((piece == 'L' && i < tidx) || (piece == 'R' && i > tidx)) {
                                    return false;
                                }
                                tidx++; // Move to the next non-blank position
                            }
                        }
                
                        return true;
                    

                        }
                  }
            
      

      public static void main(String[] args) {
            
      }
}
