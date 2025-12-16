package DynamicProgramming.AdityaVermadp.RevisonsDp.MatrixChainMultiplication;

public class ExpressionToTrueBooleanParenthesization {

    static int solve(String s, int i, int j, boolean isTrue){
            // base case 
            if(i > j) return 0;
               if (i == j) {
            if (isTrue)
                return s.charAt(i) == 'T' ? 1 : 0;
            else
                return s.charAt(i) == 'F' ? 1 : 0;
        }
         int ans = 0;

         for (int k = i + 1; k <= j - 1; k += 2) {

            int LT = solve(s, i, k - 1, true);
            int LF = solve(s, i, k - 1, false);
            int RT = solve(s, k + 1, j, true);
            int RF = solve(s, k + 1, j, false);

            char op = s.charAt(k);

            if (op == '&') {
                if (isTrue)
                    ans += LT * RT;
                else
                    ans += LT * RF + LF * RT + LF * RF;
            }

            else if (op == '|') {
                if (isTrue)
                    ans += LT * RT + LT * RF + LF * RT;
                else
                    ans += LF * RF;
            }

            else if (op == '^') {
                if (isTrue)
                    ans += LT * RF + LF * RT;
                else
                    ans += LT * RT + LF * RF;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "T|T&F^T";
        int result = solve(s, 0, s.length() - 1, true);
        System.out.println(result);
    }
}
