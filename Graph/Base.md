# 📌 Graph Theory Notes

## 1. 🔹 Basic Terminologies
   
### **1.1 🔗 Edges**
- Graph ke andar jo connections hote hain, unhe edges kehte hain.
- Example: Agar ek graph mai 2 nodes A aur B hain, aur inke beech ek connection hai, to yeh ek edge hogi.

### **1.2 🔸 Vertices**
- Graph ke nodes ko vertices (singular: vertex) kehte hain.
- Example: Ek graph mai agar 4 nodes hain, to uske 4 vertices honge.

### **1.3 ⚖️ Weight**
- Agar kisi edge ke sath ek numerical value di ho, to use weight kehte hain.
- Example: Agar A se B tak jane mai 10 cost lagti hai, to weight = 10 hoga.

### **1.4 🔄 Direction**
- Graph do tarah ke hote hain:
  1. **➡️ Directed Graph (Digraph)** - Jisme edges ke direction fix hote hain (A → B).
  2. **↔️ Undirected Graph** - Jisme edges ke direction nahi hote (A — B).

### **1.5 🔁 Cycle**
- Jab kisi graph mai ek aisa path ho jo starting node par wapas aa jaye, to use cycle kehte hain.
- Example: A → B → C → A ek cycle hai.

### **1.6 🔗 Connected Components**
- Agar ek graph ke kuch parts alag-alag connected ho aur ek dusre se na jude ho, to unhe connected components kehte hain.
- Example: Ek graph mai do alag groups of nodes ho jo ek dusre se connected na ho, to isme 2 connected components honge.

---

## 2. 🏗 Representation of Graphs

### **2.1 📊 Adjacency Matrix**
- Graph ko ek 2D array (matrix) ke form mai store kiya jata hai.
- Agar edge exist karti hai, to matrix mai 1 likhte hain, warna 0.
- Example:
  ```
    A  B  C  D
  A [0, 1, 0, 0]
  B [1, 0, 1, 1]
  C [0, 1, 0, 0]
  D [0, 1, 0, 0]
  ```

### **2.2 📜 Adjacency List**
- Har vertex ka ek list maintain kiya jata hai jo batata hai ki wo kis vertex se connected hai.
- Example:
  ```
  A -> B
  B -> A, C, D
  C -> B
  D -> B
  ```

### **2.3 📋 Edge List**
- Graph ko ek list of edges ke form mai store karte hain.
- Example:
  ```
  [(A, B), (B, C), (B, D)]
  ```

---

✅ Ye notes tum GitHub pe upload kar sakte ho as a README.md ya kisi documentation file ke roop mai. Agar aur kuch specific chahiye to batao! 🚀

