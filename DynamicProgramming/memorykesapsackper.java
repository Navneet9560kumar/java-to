package DynamicProgramming;

public class memorykesapsackper {

      // Base condition: if no items or weight capacity is zero, return 0
      public static int knapsack(int[] wt, int[] val, int W, int n  ){
            if (n == 0 || W == 0) return 0;

            // If the weight of the nth item is less than or equal to W, we have two choices:
            if (wt[n - 1] <= W) {
                  // Include the nth item and check the remaining capacity
                  int includeItem = val[n - 1] + knapsack(wt, val, W - wt[n - 1], n - 1);
                  // Exclude the nth item
                  int excludeItem = knapsack(wt, val, W, n - 1);
                  // Return the maximum of including or excluding the item
                  return Math.max(includeItem, excludeItem);
            } else {
                  // If the weight of the nth item is more than W, we cannot include it
                  return knapsack(wt, val, W, n - 1);
            }
      }
      public static void main(String[] args) {
            int[] weights = {1, 2, 3};
            int[] values = {10, 15, 40};
            int W = 6;
            int n = values.length;
            int maxProfit = knapsack(weights, values, W, n);
            System.out.println("Maximum profit is: " + maxProfit);
      }
}
