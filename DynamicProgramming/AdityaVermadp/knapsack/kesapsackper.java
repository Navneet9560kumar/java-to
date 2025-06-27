package DynamicProgramming.AdityaVermadp.knapsack;

public class kesapsackper {

// base layout for the knapsack problem
// frist ham function banayenge ok int knapsack(int[] wt, int[] val, int W, int n) { {Base case }, {choice diagram}, {memoization}}

// Base condition=>   sabse chhota case kya hoga ki agar n==0 ya W==0 to ham return 0 karenge kyuki agar koi item nahi hai ya weight 0 hai to ham kuch nahi le sakte

   public static int knapsack(int[] wt, int[] val, int W, int n) {
      
    if(n==0 || W==0) return  0;

    if(wt[n-1]<=W){
        return Math.max(val[n-1]+ knapsack(wt, val, W-wt[n-1], n-1), knapsack(wt, val, W, n-1));

    }else if(wt[n-1]>W){
        return knapsack(wt, val, W, n-1);
    }
    return 0; // This line is not strictly necessary, but it ensures all paths return an int
   }
// this is a recursive solution to the knapsack problem
// isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
   public static void main(String[] args) {
       int[] weights = {1, 2, 3};
       int[] values = {10, 15, 40};
       int W = 6;
       int n = values.length;
       int maxProfit = knapsack(weights, values, W, n);
       System.out.println("Maximum profit is: " + maxProfit);
    }
}

 
 // this is a resuive solution to the knapsack problem
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte  hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte hai ya exclude karte hai aur dono ka max lete hai
 // isme ham har item ko do tarike se lete hai ya to include karte