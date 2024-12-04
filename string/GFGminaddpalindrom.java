// bhai neeche bhi dekh bahut kuch kaam hai 😅😅



package string;

public class GFGminaddpalindrom {
    public static int minChar(String s) {
        // Reverse the string
        String reverse = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reverse;

        // Build LPS array (Longest Prefix Suffix)
        int[] lps = buildLPS(combined);

        // Min characters to add = length of original string - last value in LPS
        return s.length() - lps[lps.length - 1];
    }

    private static int[] buildLPS(String str) {
        int n = str.length();
        int[] lps = new int[n];
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < n) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Minimum characters to add: " + minChar(s)); // Output: 2

        s = "aacecaaaa";
        System.out.println("Minimum characters to add: " + minChar(s)); // Output: 2
    }
}





//to seen ye hai ke hamko question karna ek string de rakhi  de rakhi hai bas to waha to uske aage ku char jodane hai or aase banani hai ke Palindrome banane hai ok 🫡🫡
//     String reverse = new StringBuilder(s).reverse().toString();
//String combined = s + "#" + reverse;

//Purpose: Original string s ka ek reversed version banata hai. Reversed string ki madad se hum original string ka ek extended version banate hain jisme original aur reversed strings ko join kiya jata hai.

//Process:
// 1=> new StringBuilder(s) ek mutable string object banata hai jo reverse operation allow karta hai.
//2=>  .reverse() original string ke characters ko ulta karta hai (e.g., "abc" becomes "cba").
//3=> .toString() reversed StringBuilder ko normal String mein convert karta hai.