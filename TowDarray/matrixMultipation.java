package TowDarray;

public class matrixMultipation {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 1}, {2, 1, 2}};
        int[][] b = {{1, 0, 1, 2}, {2, 1, 0, 0}, {0, 3, 1, 1}};

        // Check if multiplication is possible (columns in 'a' should match rows in 'b')
        if (a[0].length != b.length) {
            System.out.println("Multiplication not possible");
        } else {
            // Initialize result matrix with dimensions [rows of a][columns of b]
            int[][] c = new int[a.length][b[0].length];

            // Matrix multiplication logic
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Print the result matrix
            System.out.println("Result of Matrix Multiplication:");
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println(); // Move to the next row
            }
        }
    }
}
