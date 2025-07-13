package DynamicProgramming.AdityaVermadp.MCM;

import java.util.HashMap;

public class TrueBooleanParenthesizationMemoMap {

    public static int countWays(String s) {
        HashMap<String, Integer> memo = new HashMap<>();
        return countWaysUtil(s, 0, s.length() - 1, true, memo);
    }

    private static int countWaysUtil(String s, int i, int j, boolean isTrue, HashMap<String, Integer> memo) {
        if (i > j) return 0;
        if (i == j) {
            if (isTrue)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }

        String key = i + "_" + j + "_" + isTrue;
        if (memo.containsKey(key)) return memo.get(key);

        int ways = 0;

        for (int k = i + 1; k <= j - 1; k += 2) {
            char op = s.charAt(k);

            int lt = countWaysUtil(s, i, k - 1, true, memo);
            int lf = countWaysUtil(s, i, k - 1, false, memo);
            int rt = countWaysUtil(s, k + 1, j, true, memo);
            int rf = countWaysUtil(s, k + 1, j, false, memo);

            if (op == '&') {
                ways += isTrue ? lt * rt : lf * rt + lt * rf + lf * rf;
            } else if (op == '|') {
                ways += isTrue ? lt * rt + lf * rt + lt * rf : lf * rf;
            } else if (op == '^') {
                ways += isTrue ? lt * rf + lf * rt : lt * rt + lf * rf;
            }
        }

        memo.put(key, ways);
        return ways;
    }

    public static void main(String[] args) {
        String expr1 = "T|T&F^T";
        String expr2 = "T^F|F";
        System.out.println("Ways to evaluate to true for " + expr1 + " = " + countWays(expr1)); // Output: 4
        System.out.println("Ways to evaluate to true for " + expr2 + " = " + countWays(expr2)); // Output: 2
    }
}
