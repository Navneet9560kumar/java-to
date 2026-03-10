package Shorting.Bubblesort;

public class Bubblesortalgo_02 {

      public static void print(int[] arr) {
            for (int ele : arr) {
                  System.out.print(ele + " ");
            }
            System.out.println();
      }

      public static void main(String[] args) {
            int[] arr = { 5,4,3,2,1};
            int n = arr.length;
            print(arr);
            // for (int x = 0; x <= n-2; x++) {// n- 1 passes
            //       for (int i = 0; i < n - 1-x; i++) {
            //             if (arr[i] > arr[i + 1]) {
            //                   int temp = arr[i];
            //                   arr[i] = arr[i + 1];
            //                   arr[i + 1] = temp;
            //             }
            //       }
            // }
            // part 2
             for (int x = 0; x <= n-1; x++) {// n- 1 passes
                  for (int i = 0; i < n - 1-x; i++) {
                        if (arr[i] > arr[i + 1]) {
                              int temp = arr[i];
                              arr[i] = arr[i + 1];
                              arr[i + 1] = temp;
                        }
                  }
            }
            print(arr);
      }
      
}



// Bubble Sort kya hota hai?
// Bubble Sort ek simple sorting algorithm hai jo array/list ke adjacent
// elements ko compare karta hai aur agar order galat ho to swap karta hai. Ye
// process baar-baar repeat hota hai jab tak pura array sort na ho jaye.

// Kaise kaam karta hai?

// First element ko second se compare karo.
// Agar arr[i] > arr[i+1] ho, to swap karo.
// Isi tarah poore array me pass chalao.
// Har pass ke baad sabse bada element end me chala jata hai (jaise bubble upar
// aata hai, isliye naam Bubble Sort).
// Passes kitne lagte hain?

// n elements ke liye max n-1 passes.
// Har next pass me ek element already correct position pe hota hai, to
// comparisons kam hote jate hain.
// Time Complexity

// Worst Case: O(n^2)
// Average Case: O(n^2)
// Best Case (optimized with swap flag): O(n)
// Space Complexity

// O(1) (in-place sorting, extra memory nahi lagti)
// Stable hai ya nahi?

// Haan, Bubble Sort stable hai (equal elements ka relative order maintain rehta
// hai).
// Use kab karein?

// Chhote datasets ke liye.
// Learning purpose ke liye best, kyunki logic easy hai.
// Bade data ke liye efficient nahi hai (Merge/Quick sort better hote hain).

// Bubble Sort pe interview me ye questions common hain:😎😎😎

// Bubble Sort kya hai aur kaise kaam karta hai?
// Har pass ke baad kaunsa element correct position pe chala jata hai?
// Bubble Sort me n-1 passes kyun hote hain?
// Inner loop ka range n-1-i kyun hota hai?
// Bubble Sort ki time complexity (best/avg/worst) kya hai?
// Bubble Sort ki space complexity kya hai?
// Kya Bubble Sort stable hai? In-place hai?
// Optimized Bubble Sort kya hota hai (swap flag concept)?
// Best case O(n) kaise hota hai optimized version me?
// Bubble Sort aur Selection Sort me difference?
// Bubble Sort aur Insertion Sort me difference?
// Bubble Sort kab use karna chahiye, kab avoid karna chahiye?
// Dry run karo: [5,1,4,2,8] pe first 2 passes ka output?
// Agar array already sorted ho to normal vs optimized Bubble Sort behavior?
// Descending order me Bubble Sort ka condition kya change hoga?