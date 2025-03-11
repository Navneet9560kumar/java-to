import java.util.Scanner;  // Fix: Correct import statement

public class codeforce {  // Fix: Class name should follow Java conventions (Capitalized)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            if (p == 0) {  // Fix: Prevent division by zero
                System.out.println(-1);
                continue;
            }

            if (k % p == 0 && Math.abs(k / p) <= n) {  // Ensure within bounds
                System.out.println(Math.abs(k / p));
            } else if (Math.abs(k) <= n * p) {
                int requiredOps = Math.abs(k) / p;
                if (Math.abs(k) % p != 0) requiredOps++;  // Correct rounding logic
                System.out.println(requiredOps);
            } else {
                System.out.println(-1);
            }
        }

        sc.close();
    }
}
