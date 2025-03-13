package MAPS;

import java.util.HashMap;

public class ChangeArr {

    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate remainder frequency map
        for (int num : arr) {
            int rem = ((num % k) + k) % k; // Ensure non-negative remainder
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        // Check if the pairs can be formed
        for (int key : map.keySet()) {
            int keyFreq = map.get(key);
            
            if (key == 0) { 
                // Remainder 0 should have an even count
                if (keyFreq % 2 != 0) return false;
            } else {
                int complement = k - key;
                if (!map.containsKey(complement) || map.get(complement) != keyFreq) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ChangeArr obj = new ChangeArr();
        int[] arr = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
        int k = 5;
        System.out.println(obj.canArrange(arr, k)); // Expected output: true/false
    }
}
