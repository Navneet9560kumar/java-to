🌲 Dynamic Programming on Trees - Introduction & Identification
🔷 What is it?
Dynamic Programming on Trees is a technique where we solve problems by computing and storing answers (subproblems) for each node in a tree structure.
It’s very similar to standard DP, but instead of arrays or sequences, the state transitions happen through parent-child relationships in a tree.

🔷 When to Use DP on Trees?
You should think about DP on trees when:

The input is a tree (not a general graph).

You're asked to compute something for each node or the whole tree based on its children or subtrees.

The problem involves optimal substructures (like min/max/sum of something over the tree).

Recursion from leaves up to the root makes sense.

Subtree results can help compute parent results.

🔷 How It Works (Conceptual Steps)
Tree Traversal:

Usually done via DFS (Depth-First Search).

Traverse from parent to children, and compute answers from bottom-up.

Subtree Processing:

Each node's answer depends on its children’s answers.

Store results for each subtree to avoid recomputation.

DP State:

You define a dp[u] which stores something meaningful (like the size, sum, max, etc. of the subtree rooted at u).

Transitions: How dp[u] is computed from dp[v] for each child v.

