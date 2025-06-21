package DynamicProgramming;

public class CountDerangementsgfg {

    public  static int disarrange(int n) {
      
        // Base cases
        if (n == 1) return 0;
        if (n == 2) return 1;
        
        // countDer(n) = (n-1)[countDer(n-1) + der(n-2)]
        return (n - 1) * (disarrange(n - 1) + 
                          disarrange(n - 2));
    }

    public static void main (String[] args) {
        int n = 4;
        System.out.println(disarrange(n));
    }
}
      




// A Derangement is a permutation of n elements, such that no element appears in its original position. For example, a derangement of [0, 1, 2, 3] is [2, 3, 1, 0].
// Given a number n, find the total number of Derangements of a set of n elements.

// Examples : 

// Input: n = 2
// Output: 1
// Explanation: For two balls [1, 2], there is only one possible derangement [2, 1].

// Input: n = 3
// Output: 2
// Explanation: For three balls [1, 2, 3], there are two possible derangements [3, 1, 2] and [2, 3, 1].