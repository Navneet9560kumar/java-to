package DynamicProgramming.AdityaVermadp.MCM;

public class TrueBooleanParenthesizationRecursive {

      public static int countWays(String s){
            return countWaysUtil(s,0,s.length()-1, true);
      }
         private static int countWaysUtil(String s, int i, int j, boolean isTrue) {
        // Base condition
        if (i > j) return 0;
        if (i == j) {
            if (isTrue)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        int ways = 0;

        // Try all operators (at odd indices)
        for (int k = i + 1; k <= j - 1; k += 2) {
            char operator = s.charAt(k);

            int leftTrue = countWaysUtil(s, i, k - 1, true);
            int leftFalse = countWaysUtil(s, i, k - 1, false);
            int rightTrue = countWaysUtil(s, k + 1, j, true);
            int rightFalse = countWaysUtil(s, k + 1, j, false);

            // Combine according to the operator
            if (operator == '&') {
                if (isTrue)
                    ways += leftTrue * rightTrue;
                else
                    ways += leftFalse * rightTrue + leftTrue * rightFalse + leftFalse * rightFalse;
            } else if (operator == '|') {
                if (isTrue)
                    ways += leftTrue * rightTrue + leftFalse * rightTrue + leftTrue * rightFalse;
                else
                    ways += leftFalse * rightFalse;
            } else if (operator == '^') {
                if (isTrue)
                    ways += leftTrue * rightFalse + leftFalse * rightTrue;
                else
                    ways += leftTrue * rightTrue + leftFalse * rightFalse;
            }
        }

        return ways;
    }
      public static void main(String[] args) {
         String expr1 = "T|T&F^T";
        String expr2 = "T^F|F";
        System.out.println("Ways to evaluate to true for " + expr1 + " = " + countWays(expr1)); // Output: 4
        System.out.println("Ways to evaluate to true for " + expr2 + " = " + countWays(expr2)); // Output: 2
    }
}
