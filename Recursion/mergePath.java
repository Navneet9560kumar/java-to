import java.util.Scanner;

public class mergePath {

public static int maze(int row, int col, int m,int n){
      if(row==m || col==n) return 1;
      // if(row==m || col==n)return 1;
      // if(row>m || col >n) return 0;
        int rigthWays = maze(row,col+1,m,n);
      int downWays = maze(row+1,col,m,n);
      return rigthWays+downWays;
}

public static int maze2(int m, int n) {
      if (m == 1 || n == 1) return 1; // Base case: only one way to move
      int rightWays = maze2(m, n - 1); // Move right
      int downWays = maze2(m - 1, n);  // Move down
      return rightWays + downWays;    // Total ways
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter n and m: ");
      int n = sc.nextInt();
      int m = sc.nextInt();
      System.out.println(maze2( m, n));
  }
}
