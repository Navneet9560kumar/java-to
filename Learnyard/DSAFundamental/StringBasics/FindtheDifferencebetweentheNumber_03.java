package Learnyard.DSAFundamental.StringBasics;

import java.util.*;

public class FindtheDifferencebetweentheNumber_03 {

    public static void FindDifferencebetweenNumberofConsona(String str) {
        int n = str.length();
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        int difference = Math.abs(vowels - consonants);

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Difference: " + difference);
    }

     public String trimTrailingVowels(String s) {
        int i = s.length() - 1;

        while (i >= 0) {
            char ch = s.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                i--;
            } else {
                break;
            }
        }

        return s.substring(0, i + 1);
    }


      public int minimumCost(int n) {
        
        int ranivelotu = n;  // as required
        
        int cost = 0;
        
        while (ranivelotu > 1) {
            cost += (ranivelotu - 1);
            ranivelotu--;
        }
        
        return cost;
    }

      public int leastInterval1(char[] tasks, int n) {
        
        int[] freq = new int[26];
        
        // Step 1: count frequency
        for (char task : tasks) {
            freq[task - 'A']++;
        }
        
        // Step 2: max heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        
        for (int f : freq) {
            if (f > 0) {
                maxHeap.add(f);
            }
        }
        
        int time = 0;
        
        // Step 3: process
        while (!maxHeap.isEmpty()) {
            
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;
            
            while (cycle > 0 && !maxHeap.isEmpty()) {
                
                int current = maxHeap.poll();
                
                if (current - 1 > 0) {
                    temp.add(current - 1);
                }
                
                time++;
                cycle--;
            }
            
            // push back remaining tasks
            for (int remaining : temp) {
                maxHeap.add(remaining);
            }
            
            if (maxHeap.isEmpty()) break;
            
            time += cycle; // idle time
        }
        
        return time;
    }

    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count frequency
        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }
        
        // Max Heap based on frequency
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        
        maxHeap.addAll(map.values());
        
        int time = 0;
        
        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;
            
            while (cycle > 0 && !maxHeap.isEmpty()) {
                int current = maxHeap.poll();
                
                if (current - 1 > 0) {
                    temp.add(current - 1);
                }
                
                time++;
                cycle--;
            }
            
            for (int remaining : temp) {
                maxHeap.add(remaining);
            }
            
            if (maxHeap.isEmpty()) break;
            
            time += cycle;
        }
        
        return time;
    }
}

 public boolean search(int[] nums, int target) {
    int start =0;
    int end = nums.length-1;

    while (start<= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid]== target){
                return true;

            }
            if(nums[start]<=nums[mid]){
                 // Target lies in the left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }     
            }else {
                // Target lies in the right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
 
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("This is a count ");
        FindDifferencebetweenNumberofConsona(str);
    }
