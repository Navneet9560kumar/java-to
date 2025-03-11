package MAPS;

import java.util.HashSet;

public class setiterate {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Navneet");  // HashSet does not allow duplicate values

        System.out.println(set + " " + set.size()); // Output: [Navneet] 1
    }

    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();  // Use Integer instead of String

        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));  // Fix function call
        }
        return set.size();
    }

    public int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        return r;
    }
}
