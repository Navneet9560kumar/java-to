# HashMap & HashSet - Quick Notes

## 1. **HashMap**

### **Definition:**
- HashMap ek data structure hai jo **key-value pairs** ko store karta hai.
- Ye **hashing technique** ka use karta hai fast retrieval ke liye.

### **Features:**
- **Keys duplicate nahi ho sakti**, but values duplicate ho sakti hain.
- **Order maintain nahi hota.**
- **Fast operations:** Searching, Insertion, aur Deletion average case me `O(1)` time complexity me hote hain.
- **Null values allow hoti hain**.

### **Syntax (Java Example):**
```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println(map.get(2)); // Output: Banana
    }
}
```

---

## 2. **HashSet**

### **Definition:**
- HashSet ek collection hai jo **unique elements** store karta hai.
- Ye internally **HashMap ka use** karta hai.

### **Features:**
- **Duplicate values allow nahi hoti**.
- **Order maintain nahi hota**.
- **Fast operations:** Searching, Insertion, aur Deletion ka average case time complexity `O(1)` hota hai.
- **Internally HashMap ka use hota hai**.

### **Syntax (Java Example):**
```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate, ignore ho jayega

        System.out.println(set); // Output: [Apple, Banana, Mango] (Order random ho sakta hai)
    }
}
```

---

## 3. **HashMap vs HashSet**

| Feature       | HashMap | HashSet |
|--------------|---------|---------|
| Stores       | Key-Value Pair | Unique Values |
| Duplicates   | Keys duplicate nahi ho sakte, values ho sakti hain | Duplicate values allow nahi hoti |
| Performance  | Fast retrieval using key (`O(1)`) | Fast lookup (`O(1)`) |
| Order        | No order guarantee | No order guarantee |
| Internal Implementation | HashTable (Key-Value) | HashMap ke upar built |

---

## 4. **Conclusion**
- **Jab key-value pair store karna ho, tab HashMap use karein.**
- **Jab sirf unique elements store karne ho, tab HashSet use karein.**
- **Dono fast hote hain (`O(1)`), par HashMap zyada memory leta hai kyunki ye values bhi store karta hai.**

---

### **Interview Tips:**
- **HashMap me duplicate keys allowed nahi hoti, but values ho sakti hain.**
- **HashSet sirf unique elements store karta hai.**
- **Dono unordered hote hain, agar ordered collection chahiye to `LinkedHashMap` ya `LinkedHashSet` use karein.**
- **Thread-safe version ke liye `ConcurrentHashMap` aur `Collections.synchronizedSet()` ka use karein.**
//🥰🥰🥰🥰🥰🥰 

## 5. **TreeSet**

### **Definition:**
- TreeSet ek collection hai jo **sorted order** me unique elements store karta hai.
- Ye internally **TreeMap ka use** karta hai.

### **Features:**
- **Duplicate values allow nahi hoti**.
- **Sorted order me elements store karta hai**.
- **Slower operations:** Searching, Insertion, aur Deletion ka average case time complexity `O(log n)` hota hai.
- **Internally TreeMap ka use hota hai**.

### **Syntax (Java Example):**
```java
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate, ignore ho jayega

        System.out.println(set); // Output: [Apple, Banana, Mango] (Sorted order)
    }
}
```

---

## 6. **HashSet vs TreeSet**

| Feature       | HashSet | TreeSet |
|--------------|---------|---------|
| Stores       | Unique Values | Unique Values (Sorted) |
| Duplicates   | Duplicate values allow nahi hoti | Duplicate values allow nahi hoti |
| Performance  | Fast lookup (`O(1)`) | Slower lookup (`O(log n)`) |
| Order        | No order guarantee | Sorted order |
| Internal Implementation | HashMap ke upar built | TreeMap ke upar built |

---

## 7. **Conclusion**
- **Jab unique elements ko sorted order me store karna ho, tab TreeSet use karein.**
- **HashSet fast hota hai (`O(1)`), par TreeSet sorted order provide karta hai (`O(log n)`).**

---

### **Interview Tips:**
- **TreeSet me duplicate values allowed nahi hoti.**
- **TreeSet elements ko sorted order me store karta hai.**
- **TreeSet ka performance HashSet se slow hota hai due to sorting (`O(log n)`).**
- **Thread-safe version ke liye `Collections.synchronizedSortedSet()` ka use karein.**