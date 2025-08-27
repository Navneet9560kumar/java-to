package Revison;

public class RemoveAlllOccurencesofAfromString {

       public static void print(int i, String s){
            if(i==s.length())return;
            System.out.println(s.charAt(i));
            print(i+1, s);
      }

      public  static void skip(int i, String s, String ans){
            if(i==s.length()){
                  System.out.println(ans);
                  return;
            }
            if(s.charAt(i)!='a') skip(i+1, s, ans + s.charAt(i));
            else skip(i+1, s,ans);
      }
      public static void main(String[] args) {
            String s = "Navneet kumar";
            skip(0, s,""); 
      }
}
