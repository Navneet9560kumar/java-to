package weak_3.part_1;
import java.util.*;;
public class BlanceBracket_03 {

       public static boolean isBalanced(String s){
            
            Stack<Character>st =new Stack<>();
            int n = s.length();
            for(int i=0;i<n;i++){
                  char ch = s.charAt(i);
                  if(ch=='(') {
                        st.push(ch);
                  }else{
                        if(st.size()==0)return false;
                        if(st.peek()== '(')st.pop();
                  }
            }
            if(st.size()>0)return  false;
            else return  true;

       }
      public static void main(String[] args) {
            String s = "()[]{}";
            Scanner sc = new Scanner(System.in);
              String str = sc.nextLine();
      }
}
