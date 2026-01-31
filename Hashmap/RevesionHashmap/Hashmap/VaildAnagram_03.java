package Hashmap.RevesionHashmap.Hashmap;

import java.util.HashMap;

public class VaildAnagram_03 {

    public boolean isAnagram(String s, String t) {

        // length check
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // frequency of t
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }

        // frequency of s
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        // compare frequencies
        for (char key : map2.keySet()) {
            if (!map1.containsKey(key) || !map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        VaildAnagram_03 obj = new VaildAnagram_03();
        System.out.println(obj.isAnagram("anagram", "nagaram")); // true
        System.out.println(obj.isAnagram("rat", "car"));         // false
    }
}
