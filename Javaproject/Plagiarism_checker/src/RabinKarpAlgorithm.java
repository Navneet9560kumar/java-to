package Javaproject.Plagiarism_checker.src;

public class RabinKarpAlgorithm {
    private final int d = 256; // Number of characters in input alphabet
    private final int q = 101; // A prime number for hashing

    public boolean search(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();
        int p = 0, t = 0, h = 1;

        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t && text.substring(i, i + m).equals(pattern)) {
                return true; // Match found
            }
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;
                if (t < 0) t += q;
            }
        }
        return false;
    }
}
