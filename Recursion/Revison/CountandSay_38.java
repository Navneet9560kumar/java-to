package Revison;

public class CountandSay_38 {
        public static String countAndSay(int n){
            if(n==1)return "1";
            String s = countAndSay(n-1);
            String ans = "";
            int i=0, j=0;
            while (j<s.length()) {
                  if(s.charAt(i)==s.charAt(j)){
                        j++;
                  }else{
                        ans += (j-i) +""+ s.charAt(i);
                        i = j;
                  }
                  ans += (j-i) +""+ s.charAt(i);
            }
            return ans;
        }
      public static void main(String[] args) {
            
      }
}
