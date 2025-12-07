package DynamicProgramming.AdityaVermadp.RevisonsDp.LostestCommeanSubsequece;

public class LongestCommonSubsequence {

      public static int LongestCommonSubsequencess(String s1, String s2,int i, int j){
            while (i>0 && j>0) {
              if(s1.charAt(i-1) == s2.charAt(j-1)){
                  return 1 + LongestCommonSubsequencess(s1, s2, i-1, j-1);
                  i--;
                  j--;
              }else{
                  if(t[i][j-1]>t[i-1][j]) j--;
                  else i--;
              }
            }
            return 0;
      }

      public static void main(String[] args) {
            
      }
}
