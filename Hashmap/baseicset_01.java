package Hashmap;

import java.util.*;

public class baseicset_01 {

      // insert , remove , search  -> O(1) average case time complexity
      // Ther are a some baseic set operations
      // 1. add -> add element to the set
      // 2. remove -> remove element from the set
      // 3. contains -> check if element is present in the set or not
      // 4. size -> return the size of the set
      // 5. isEmpty -> check if the set is empty or not
      // 6. clear -> remove all elements from the set
      // 7. iterate -> iterate through the elements of the set
      // 8. union -> return the union of two sets
      // 9. intersection -> return the intersection of two sets
      // 10. difference -> return the difference of two sets
      // 11. subset -> check if one set is a subset of another set
      // 12. toArray -> convert the set to an array
            public static void main(String[] args) {
      //       HashSet<Integer> set = new HashSet<>();
      //       set.add(20);
      //       set.add(100);
      //       set.add(10);
      //       set.add(-8);
      //       System.out.println(set);
      //      System.out.println( set.contains(100));
      //      System.out.println( set.contains(200));


      // Create two sets
        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2, 2, 3, 4));
        Set<Integer> B = new HashSet<>(Arrays.asList(3, 4, 4, 5, 6));

          // (a) Union -> elements present in A or B
Set<Integer> union = new HashSet<>(A);
union.addAll(B);
System.out.println("Union: " + union);

// (b) Intersection -> elements present in both A and B
Set<Integer> intersection = new HashSet<>(A);
intersection.retainAll(B);
System.out.println("Intersection: " + intersection);



        // (c) Difference (A - B) -> elements present in A but not in B
        Set<Integer> differenceAB = new HashSet<>(A);
        differenceAB.removeAll(B);
        System.out.println("different (A-B)" + differenceAB);

         // (c) Difference (B - A) -> elements present in B but not in A
                  Set<Integer> differenceBA = new HashSet<>(B);
                  differenceBA.removeAll(A);
                  System.out.println("different (B-A)" + differenceBA);
      }
}
