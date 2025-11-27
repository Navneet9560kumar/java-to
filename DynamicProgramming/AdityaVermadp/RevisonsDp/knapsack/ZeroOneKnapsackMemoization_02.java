package DynamicProgramming.AdityaVermadp.RevisonsDp.knapsack;

public class ZeroOneKnapsackMemoization_02 {

    // Java way (C/C++ syntax allowed nahi hoti)
    static int[][] t = new int[102][1002];

    public static int knapsacksss(int wt[], int val[], int w, int n){

        // base condition
        if(n == 0 || w == 0)
            return 0;

        // memo check
        if(t[n][w] != -1)
            return t[n][w];

        // choice diagram
        if(wt[n-1] <= w){
            t[n][w] = Math.max(
                    val[n-1] + knapsacksss(wt, val, w - wt[n-1], n-1),
                    knapsacksss(wt, val, w, n-1)
            );
        } else {
            t[n][w] = knapsacksss(wt, val, w, n-1);
        }

        return t[n][w];
    }

    public static void main(String[] args) {

        int[] wt = {1,3,4,5};
        int[] val = {1,4,5,7};
        int W = 7;
        int n = wt.length;

        // initialize dp array with -1
        for(int i=0;i<102;i++){
            for(int j=0;j<1002;j++){
                t[i][j] = -1;
            }
        }

        int ans = knapsacksss(wt, val, W, n);
        System.out.println("Maximum Value = " + ans);
    }
}
