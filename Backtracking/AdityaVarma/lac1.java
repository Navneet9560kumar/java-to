package Backtracking.AdityaVarma;

public class lac1 {

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    // Function to generate permutations
    static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);           // Swap current index with l
                permute(str, l + 1, r);          // Recurse
                str = swap(str, l, i);           // Backtrack (undo the swap)
            }
        }
    }

    // Utility function to swap characters in a string
    static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
