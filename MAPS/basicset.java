package MAPS;

import java.util.HashSet;

public class basicset {
      public static void main(String[] args) {
            HashSet<Integer> set = new HashSet<>();
            set.add(20);
            set.add(30);
            set.add(40);
            set.add(50);
            set.add(60);
            set.add(100);
            System.out.println(set);
            System.out.println(set.contains(30));
            set.add(85);
            System.out.println(set.size());
            set.remove(100);
            System.out.println(set);
      }
}





// ## 4. **Example Code for HashSet Operations**

// ### **Code:**
// ```java
// package MAPS;

// import java.util.HashSet;

// public class BasicSet {
//     public static void main(String[] args) {
//         HashSet<Integer> set = new HashSet<>();
//         set.add(20);
//         set.add(30);
//         set.add(40);
//         set.add(50);
//         set.add(60);
//         set.add(100);
        
//         System.out.println(set); // Print set elements
//         System.out.println(set.contains(30)); // Check if 30 exists
        
//         set.add(85); // Adding new element
//         System.out.println(set.size()); // Print size of set
        
//         set.remove(100); // Removing element 100
//         System.out.println(set); // Print updated set
//     }
// }
// ```

// ### **Explanation:**
// 1. **Creating a HashSet:** `HashSet<Integer> set = new HashSet<>();`
// 2. **Adding Elements:** `set.add(value);` method se unique values add hoti hain.
// 3. **Checking if Element Exists:** `set.contains(30);` true/false return karega.
// 4. **Getting Size:** `set.size();` total elements count karega.
// 5. **Removing an Element:** `set.remove(100);` specified element delete karega.
// 6. **Printing Elements:** `System.out.println(set);` se HashSet ke elements print honge.

// ---

// ## 5. **Conclusion**
// - **Jab key-value pair store karna ho, tab HashMap use karein.**
// - **Jab sirf unique elements store karne ho, tab HashSet use karein.**
// - **Dono fast hote hain (`O(1)`), par HashMap zyada memory leta hai kyunki ye values bhi store karta hai.**

// ---

// ### **Interview Tips:**
// - **HashMap me duplicate keys allowed nahi hoti, but values ho sakti hain.**
// - **HashSet sirf unique elements store karta hai.**
// - **Dono unordered hote hain, agar ordered collection chahiye to `LinkedHashMap` ya `LinkedHashSet` use karein.**
// - **Thread-safe version ke liye `ConcurrentHashMap` aur `Collections.synchronizedSet()` ka use karein.**

//   //