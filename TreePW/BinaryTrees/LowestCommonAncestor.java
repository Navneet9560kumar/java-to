class Node {
      int val;
      Node left;
      Node right;
  
      Node(int val) {
          this.val = val;
      }
  }
  
  public class LowestCommonAncestor {
  
      public static boolean exists(Node root, Node tree) {
          if (root == null) return false;
          if (root == tree) return true;
          return exists(root.left, tree) || exists(root.right, tree);
      }
  
      public static Node lowestCommonAncenss(Node root, Node p, Node q) {
          if (root == null || root == p || root == q) return root;
  
          boolean pInLeftSubtree = exists(root.left, p);
          boolean qInLeftSubtree = exists(root.left, q);
  
          if (pInLeftSubtree != qInLeftSubtree) return root;
  
          if (pInLeftSubtree) {
              return lowestCommonAncenss(root.left, p, q);
          } else {
              return lowestCommonAncenss(root.right, p, q);
          }
      }
  
      public static void main(String[] args) {
          Node a = new Node(1);
          Node b = new Node(2);
          Node c = new Node(3);
          Node d = new Node(4);
          Node e = new Node(5);
          Node f = new Node(6);
          Node g = new Node(7);
          Node h = new Node(8);
          Node i = new Node(9);
  
          a.left = b;
          a.right = c;
          b.left = d;
          b.right = e;
          c.left = f;
          c.right = g;
          e.left = h;
          f.right = i;
  
          Node lca = lowestCommonAncenss(a, h, i);
          System.out.println("Lowest Common Ancestor of " + h.val + " and " + i.val + " is: " + lca.val);
      }
  }
  



  //### Explanation of the Code:

// This code finds the Lowest Common Ancestor (LCA) of two nodes in a binary tree. Here's a detailed explanation of the functionality:

// #### **Node Class**
// - The `Node` class defines the structure of a binary tree node.
// - It contains:
//   - `val`: The integer value of the node.
//   - `left` and `right`: References to the left and right children of the node.
// - The constructor initializes a node with a value and sets the left and right children to `null`.

// #### **exists() Method**
// ```java
// public static boolean exists(Node root, Node tree) {
//     if (root == null) return false;
//     if (root == tree) return true;
//     return exists(root.left, tree) || exists(root.right, tree);
// }
// ```
// - **Purpose:** Checks if a given `tree` node exists in the binary tree rooted at `root`.
// - **Logic:**
//   - If `root` is `null`, return `false` (base case).
//   - If the current `root` matches `tree`, return `true`.
//   - Recursively checks the left and right subtrees to find the node.

// #### **lowestCommonAncenss() Method**
// ```java
// public static Node lowestCommonAncenss(Node root, Node p, Node q) {
//     if (root == null || root == p || root == q) return root;

//     boolean pInLeftSubtree = exists(root.left, p);
//     boolean qInLeftSubtree = exists(root.left, q);

//     if (pInLeftSubtree != qInLeftSubtree) return root;

//     if (pInLeftSubtree) {
//         return lowestCommonAncenss(root.left, p, q);
//     } else {
//         return lowestCommonAncenss(root.right, p, q);
//     }
// }
// ```
// - **Purpose:** Finds the lowest common ancestor of two nodes (`p` and `q`) in the binary tree.
// - **Base Cases:**
//   - If `root` is `null`, return `null`.
//   - If `root` matches either `p` or `q`, it is the LCA, so return `root`.
// - **Logic:**
//   - Check if `p` and `q` are in the left subtree of `root` using the `exists` method.
//   - Check if `p` and `q` are in the same or different subtrees:
//     - If `p` and `q` are in different subtrees (one in the left subtree and one in the right subtree), `root` is their LCA.
//     - If both are in the same subtree, recurse into that subtree.

// #### **Main Method**
// ```java
// public static void main(String[] args) {
//     Node a = new Node(1);
//     Node b = new Node(2);
//     Node c = new Node(3);
//     Node d = new Node(4);
//     Node e = new Node(5);
//     Node f = new Node(6);
//     Node g = new Node(7);
//     Node h = new Node(8);
//     Node i = new Node(9);

//     a.left = b;
//     a.right = c;
//     b.left = d;
//     b.right = e;
//     c.left = f;
//     c.right = g;
//     e.left = h;
//     f.right = i;

//     Node lca = lowestCommonAncenss(a, h, i);
//     System.out.println("Lowest Common Ancestor of " + h.val + " and " + i.val + " is: " + lca.val);
// }
// ```
// - **Purpose:** Sets up the binary tree, calls the `lowestCommonAncenss` method, and prints the result.
// - **Tree Structure:**
// ```
//         1
//       /   \
//      2     3
//     / \   / \
//    4   5 6   7
//       /     \
//      8       9
// ```
// - **Execution:**
//   - Finds the LCA of nodes `h` (8) and `i` (9).
//   - The method identifies `1` as the LCA since `h` and `i` are in different subtrees of `1`.
// - **Output:**
// ```
// Lowest Common Ancestor of 8 and 9 is: 1
// ```

