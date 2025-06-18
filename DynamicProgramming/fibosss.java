package DynamicProgramming;

public class fibosss {
    static int[] dp;

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != 0) return dp[n];
        dp[n] = fib(n - 1) + fib(n - 2);
        return dp[n];
    }

    public static int fidMemo(int n) {
        dp = new int[n + 1]; // Initialize DP array
        return fib(n);       // Use memoized version
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fidMemo(n);  // Call correct method
        System.out.println("Fibonacci of " + n + " is: " + result);
    }
}


// ab ham dp ke saath memoization karenge isame ham sab same hoga per ham dp arrya ka use karege kuki normal regular recursion me time complexity O(2^n) hoti hai per dp ke saath ham ise O(n) kar sakte hai
// isme ham dp array ka use karte hai jo ki n+1 size ka hota hai aur ise ham 0 se n tak bharte hai       


//Tabulation me ham dp array ko bharte hai aur ise bottom se top ki taraf bharte hai🙂🙂🙂🙂🙂🙂🙂   