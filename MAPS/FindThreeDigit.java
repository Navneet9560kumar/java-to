package MAPS;

import java.util.ArrayList;
import java.util.HashMap;

public class FindThreeDigit {

    public Object[] findEvenNumbers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 100; i <= 999; i += 2) {
            int x = i;
            int c = x % 10;
            x /= 10;
            int b = x % 10;
            int a = x / 10;

            HashMap<Integer, Integer> tempMap = new HashMap<>(map);

            if (tempMap.getOrDefault(a, 0) > 0) {
                tempMap.put(a, tempMap.get(a) - 1);
                if (tempMap.getOrDefault(b, 0) > 0) {
                    tempMap.put(b, tempMap.get(b) - 1);
                    if (tempMap.getOrDefault(c, 0) > 0) {
                        ans.add(i);
                    }
                }
            }
        }
        return ans.toArray();
    }

    public static void main(String[] args) {
        FindThreeDigit obj = new FindThreeDigit();
        int[] arr = {1, 2, 3, 0, 4, 6, 7, 8};
        Object[] result = obj.findEvenNumbers(arr);

        for (Object num : result) {
            System.out.print(num + " ");
        }
    }
}
