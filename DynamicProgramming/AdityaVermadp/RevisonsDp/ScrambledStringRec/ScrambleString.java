package DynamicProgramming.AdityaVermadp.RevisonsDp.ScrambledStringRec;

import java.util.*;

public class ScrambleString {

    // Memoization ke liye Map use karenge (String key -> Boolean result)
    static Map<String, Boolean> map = new HashMap<>();

    public static boolean solve(String a, String b) {
        // Base Case 1: Agar dono strings equal hain
        if (a.equals(b)) return true;
        
        // Base Case 2: Agar length alag hai ya 1 se kam hai
        if (a.length() <= 1) return false;

        // Memoization check: "a + b" ko key ki tarah use karenge
        String key = a + "_" + b;
        if (map.containsKey(key)) return map.get(key);

        int n = a.length();
        boolean flag = false;

        // Loop 1 se n-1 tak (non-empty substrings)
        for (int i = 1; i < n; i++) {
            
            // CASE 1: Swapped logic
            // a ka starting i characters aur b ka last i characters
            boolean condition1 = solve(a.substring(0, i), b.substring(n - i)) && 
                                 solve(a.substring(i), b.substring(0, n - i));

            // CASE 2: Not Swapped logic
            // a ka starting i characters aur b ka starting i characters
            boolean condition2 = solve(a.substring(0, i), b.substring(0, i)) && 
                                 solve(a.substring(i), b.substring(i));

            if (condition1 || condition2) {
                flag = true;
                break;
            }
        }

        map.put(key, flag);
        return flag;
    }

    public static void main(String[] args) {
        String A = "great";
        String B = "rgeat";
        
        // Clear map before fresh call
        map.clear();
        
        if (solve(A, B)) {
            System.out.println("Yes, it is a Scrambled String (1)");
        } else {
            System.out.println("No (0)");
        }
    }
}