package Aid;

public class landperimeter {
       public int islandPerimeter(int[][] grid) {
        int row=  grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                  if(grid[i][j]==1){
                        //up
                        if(i>0 && grid[i-1][j]==0|| i==0){
                            count+=1;
                        }
                        // right matlb ham last wale colum per hai 
                         if(j<col-1 && grid[i][j+1]==0|| j==col-1){
                            count+=1;
                        }
                        //down
                         if(i<row-1 && grid[i+1][j]==0|| i==row){
                            count+=1;
                        }
                        // left 
                         if(j>0 && grid[i][j-1]==0|| j==0){
                            count+=1;
                        }
                  }
            }

        }
            return count;
    }

    public static void main(String[] args) {
      landperimeter lp = new landperimeter();
      int[][] grid = {{0, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}, {0, 1, 0, 0}};
      int perimeter = lp.islandPerimeter(grid);
      System.out.println("Island Perimeter: " + perimeter);
    }
}
