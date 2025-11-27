package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack;

public class ZeroOneKnapsack {

      public int knapsackss(int[] wt, int[] val, int w, int n) {
        if (n == 0 || w == 0) 
            return 0;

        if (wt[n-1] <= w) {
            return Math.max(
                val[n-1] + knapsackss(wt, val, w - wt[n-1], n - 1),
                knapsackss(wt, val, w, n - 1)
            );
        } else {
            return knapsackss(wt, val, w, n - 1);
        }
    }
     public static void main(String[] args) {
         int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int W = 7;
        int n = wt.length;

         ZeroOneKnapsack obj = new ZeroOneKnapsack();
        int ans = obj.knapsackss(wt, val, W, n);
        System.out.println("Maximum Value = " + ans);
     } 
}


// abhi  frist lacther 