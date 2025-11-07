package Hashmap;

import java.util.*;

public class CountDistinctInteger_03 {

    public static int countDistinct(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();
    }

    public static int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        return r;
    }

    public static void main(String[] args) {
        int nums[] = {12, 10, 121, 20, 12, 21};
        System.out.println(countDistinct(nums));
    }
}
