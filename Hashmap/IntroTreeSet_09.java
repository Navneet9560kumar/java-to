package Hashmap;

public class IntroTreeSet_09 {
      public static void main(String[] args) {
            // TreeSet -> is a part of Java's Collection Framework and implements the Set interface.
            // It uses a Red-Black tree structure to store elements in a sorted order.
            // TreeSet does not allow duplicate elements and maintains the natural ordering of elements
            // or can be sorted based on a custom comparator provided at the time of TreeSet creation.

            // Key Features of TreeSet:
            // 1. Sorted Order: Elements are stored in ascending order by default.
            // 2. No Duplicates: Duplicate elements are not allowed.
            // 3. Performance: Basic operations like add, remove, and contains have a time complexity of O(log n).
            // 4. NavigableSet Interface: TreeSet implements the NavigableSet interface, providing methods for
            //    navigation like lower(), higher(), floor(), ceiling(), etc.

            // Example Usage:
            java.util.TreeSet<Integer> treeSet = new java.util.TreeSet<>();

            // Adding elements
            treeSet.add(5);
            treeSet.add(2);
            treeSet.add(8);
            treeSet.add(1);
            treeSet.add(3);

            System.out.println("TreeSet: " + treeSet); // Output will be in sorted order: [1, 2, 3, 5, 8]

            // Checking for an element
            boolean containsThree = treeSet.contains(3);
            System.out.println("Contains 3: " + containsThree); // Output: true

            // Removing an element
            treeSet.remove(2);
            System.out.println("After removing 2: " + treeSet); // Output: [1, 3, 5, 8]

            // Iterating through elements
            System.out.print("Elements in TreeSet: ");
            for (Integer num : treeSet) {
                  System.out.print(num + " ");
            } 
      }
}
