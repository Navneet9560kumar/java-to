package MAPS;
import java.util.HashMap;

public class NicePairs {

    public static int rev(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        return r;
    }

    public static int countNicePairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int key = num - rev(num);
            count += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {42, 11, 1, 97}; 
        System.out.println(countNicePairs(nums)); // Output: 2
    }
}
