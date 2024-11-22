package Sorting;

public class insertionshort {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 78, -6, 8};
        int n = arr.length;
        print(arr);
        // yaha se start hai
      // insertion Sort 
        for (int i = 1; i < n; i++) { 
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1); 
                } else {
                    break; // else block aligned properly with if
                }
            }
        }
        print(arr);
    }
}


// so basakaly the time complecity is AVG.case = o(n power 2);
// worst.case = o(n power 2) 
// Best case = o(n); this is over all and

// Is 😁😁😁😁 insertion short is stable or not  yes is a stable short like bubble short 

//(1) Bubble sort        Selection sort              Insertion sort
//(2)O(n) TC .in          o(n poewr 2)                  O(n) T.C in 
//(3) best case            TC in best case               best case 
// (4)stable                unstable                      stable 
//(5)n(n-1)/2 max swap      n-1 swap                      n(n-1)/2 swap
//[ The best thing is best  hota                           (Same for B s)
/// best case mai swap nahi 
/// hota]