package TreePW.BinarySerchTree;

public class CountBST  {
      static long factorial(int num) {
            long fact = 1;
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            return fact;
        }
    
        // Function to calculate the nth Catalan number
        static long countBST(int n) {
            return factorial(2 * n) / (factorial(n + 1) * factorial(n));
        }
    
        public static void main(String[] args) {
            int n = 4; // Number of nodes
            System.out.println("Total number of BSTs with " + n + " nodes: " + countBST(n));
        }
    }

