import java.util.*;

public class Halloumibox {
    
    public static boolean canSort(int[] arr, int n, int k) {
     
        if (k >= n) return true;
             if (k == 1) {
            for (int i = 1; i < n; i++) {
                if (arr[i] < arr[i - 1]) {
                    return false; // Already not sorted
                }
            }
            return true;
        }

      
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

      
        for (int i = 0; i < n; i++) {
            if (arr[i] != sortedArr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (canSort(arr, n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
