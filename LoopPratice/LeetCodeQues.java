public class LeetCodeQues {

      public static void printHPattern(int n) {
          for (int i = 0; i < n; i++) {
              for (int j = 0; j < n; j++) {
                  // Pehli aur aakhri column print karna hai ya beech ki line
                  if (j == 0 || j == n - 1 || i == n / 2) {
                      System.out.print("* ");
                  } else {
                      System.out.print("  ");
                  }
              }
              System.out.println();
          }
      }
  
      public static void main(String[] args) {
          int n = 7; // H ki height
          printHPattern(n);
      }
  }
  