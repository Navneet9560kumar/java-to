package string.RevisonString;

public class isSomorphic {

       public boolean isIsomorphic(String s, String t) {
            char[]a = new char[128];
            for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);
                  char dh = t.charAt(i);
                  int idx = (int)ch;
                  if(a[idx] == '\0') a[idx] = dh;
                  else{
                        if(a[idx]!=dh) return false;
                  }
            }
            return true;
            
       }
      public static void main(String[] args) {
            
      }
}
