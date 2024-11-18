package string;

public class maxValue {
      public static void main(String[] args) {
            String[] arr = { "455", "45875214587652146556565559978", "85641", "0025" };
            String maxS = arr[0];
            for (int i = 1; i < arr.length; i++) {
                  maxS = max(maxS, arr[i]); // Update maxS by comparing with current array element
            }
            System.out.println(maxS); // Print the maximum value
      }

      public static String max(String a, String b) {
            String s = purify(a), t = purify(b); // Purify both strings by removing leading zeros
            if (s.length() > t.length()) return a; // If a's length is greater, it's larger
            if (s.length() < t.length()) return b; // If b's length is greater, it's larger

            // If lengths are equal, compare character by character
            for (int i = 0; i < s.length(); i++) {
                  if (s.charAt(i) != t.charAt(i)) {
                        if (s.charAt(i) > t.charAt(i)) return a;
                        else return b;
                  }
            }

            // If both purified strings are the same, return the one with more original length
            return a.length() >= b.length() ? a : b;
      }

      public static String purify(String s) {
            for (int i = 0; i < s.length(); i++) {
                  if (s.charAt(i) != '0') return s.substring(i); // Return substring starting from first non-zero
            }
            return "0"; // If all are zeros, return "0"
      }
}
